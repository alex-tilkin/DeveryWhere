package com.getflourish.stt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.getflourish.stt.SpeechResponse.SpeechResult.SpeechAlternative;
import com.google.gson.JsonSyntaxException;

/**
 * Each transcription is handled in a separate thread to ensure that the program remains responsive while the thread is waiting for 
 * a response from the server.
 * @author Florian Schulz
 */
public class TranscriptionThread extends Thread {
	boolean running;

	private float confidence;
	public boolean debug = false;
	private int status;
	boolean available = false;
	private String utterance;

	private String record;
	private String lang;

	public TranscriptionThread(String lang) {
		this.lang = lang;
		running = false;
		this.setName("TranscriptionThread");
	}

	public void startTranscription(String _record) {
		this.record = _record;
		this.running = true;
	}

	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			if (running) {
				transcribe(this.record);
				running = false;
			} else {
				try {
					sleep(500);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	public boolean isRunning() {
		return running;
	}

	/**
	 * 
	 * @param path location of the audio file encoded as FLAC
	 * @return transcription of the audio file as String
	 */
	public String transcribe(String path) {
		this.available = false;
		String response = "";
		ResponseParser responseParser = null;
		SpeechResponses speechResponses = null;
		SpeechAlternative speechAlternative = null;
		
		try {
			response = performClientHttpRequestPost(path);
			responseParser = new ResponseParser();
			responseParser.setJsonString(response);
			responseParser.parse();
			speechResponses = responseParser.getSpeechResponses();
			speechAlternative = speechResponses.getBestResponse();
			if (speechAlternative != null) {
				this.confidence = speechAlternative.getConfidence();
				this.utterance = speechAlternative.getTranscript();
				this.available = true;
				this.status = 0;
			}
			else {
				this.confidence = 0;
				this.status = -1;
				this.utterance = "";
				this.available = true;
			}
			if (debug) {
				String debugReport = "";
				switch (this.status) {
				case 0:
					debugReport = "Recognized: " + this.utterance + " (confidence: " + this.confidence + ")";
					status = STT.SUCCESS;
					break;
				default:
					debugReport = "Could not recognize the transcript";
					status = STT.ERROR;
				}
				System.out.println(getTime() + " " + debugReport);
			} 
			else {
				if (this.status == 0) {
					status = STT.SUCCESS;
				}
				else {
					status = STT.ERROR;
				}
			}
		} catch (JsonSyntaxException e) {
			System.out.println(getTime() + " PARSE ERROR: Speech could not be interpreted.");
			status = STT.ERROR;
		}
		this.available = true;
		
		return this.utterance;
	}
//			Gson gson = new Gson();
//			Response transcription = gson.fromJson(response, Response.class);
//			if (transcription != null) {
//				if (transcription.status == 0) {
//					// returns the transcription
//					this.confidence = transcription.hypotheses[0].confidence;
//					this.status = transcription.status;
//					this.utterance = transcription.hypotheses[0].utterance;
//					this.available = true;
//				} else {
//					// no result, could not be transcribed
//					this.confidence = 0;
//					this.status = transcription.status;
//					this.utterance = "";
//					this.available = true;
//				}
//				if (debug) {					
//					switch (this.status) {
//					case 0:
//						s = "Recognized: " + this.utterance + " (confidence: " + this.confidence + ")";
//						status = STT.SUCCESS;
//						break;
//					case 3:
//						s = "We lost some words on the way.";
//						status = STT.ERROR;
//						break;
//					case 5:
//						s = "Speech could not be interpreted.";
//						status = STT.ERROR;
//						break;
//					default:
//						s = "Did you say something?";
//						status = STT.ERROR;
//						break;
//					}
//				} else {
//					if (this.status == 0) status = STT.SUCCESS;
//					else status = STT.ERROR;
//				}
//			} else {
//				s = "Speech could not be interpreted! Try to shorten the recording.";
//				status = STT.ERROR;
//			}
//			if(debug) {
//				System.out.println(getTime() + " " + s);
//			}
//		} catch (JsonSyntaxException e) {
//			s = "PARSE ERROR: Speech could not be interpreted.";
//			System.out.println(getTime() + " " + s);
//			status = STT.ERROR;
//		}
//		return this.utterance;
//	}

	private String performClientHttpRequestPost(String path) {
		ClientHttpRequest clientHttpRequest = null;
		String response = "";
		File file = new File(path);
		
		try {
			clientHttpRequest = new ClientHttpRequest("https://www.google.com/speech-api/v2/recognize?output=json&lang=" + lang
					+ "&key=AIzaSyDT41KV3j_c2OseWNNt4xv79MD9sj9p2j4");
			clientHttpRequest.setParameter("file", file);
			InputStream stream = clientHttpRequest.post();
			response = convertStreamToString(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return response;
	}

	private String convertStreamToString(InputStream is) throws IOException {
		if (is != null) {
			Writer writer = new StringWriter();

			char[] buffer = new char[1024];
			try {
				Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				int n;
				while ((n = reader.read(buffer)) != -1) {
					writer.write(buffer, 0, n);
				}
			} finally {
				is.close();
			}
			return writer.toString();
		} else {
			return "";
		}
	}
	
	public float getConfidence () 
	{
		return this.confidence;
	}
	
	public String getUtterance ()
	{
		return this.utterance;
	}
	
	public int getStatus () {
		return this.status;
	}
	
	/**
	 * @return true if audio processing was successfull
	 */
	public boolean isAvailable()
	{
		return this.available;
	}
	
	private String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
	}
}
