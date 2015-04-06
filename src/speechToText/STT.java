package speechToText;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javaFlacEncoder.FLAC_FileEncoder;
import ddf.minim.AudioInput;
import ddf.minim.AudioRecorder;
import ddf.minim.Minim;

/**
 * Converts speech to text using the x-webkit-speech technology found in Chrome.
 * 
 * @author Florian Schulz
 * 
 */
public class STT {

	public final static int RECORDING = 0;
	public final static int SUCCESS = 1;
	public final static int ERROR = 2;
	public final static int TRANSCRIBING = 3;

	private boolean active = false;
	boolean analyzing;
	
	// path of recorded files
	String dataPath = "";
	private boolean debug = false;
	FLAC_FileEncoder encoder;

	int fileCount = 0;

	String fileName = "";
	boolean fired;
	AudioInput in;

	// timer interval
	int interval = 1500;
	private String language = "en";
	String lastStatus = "";
	boolean log = false;
	private Minim minim;
	Object calee;

	String path = "";

	AudioRecorder recorder;

	boolean recording = false;
	String recordsPath = "";
	String result = "";
	String status = "";
	private ArrayList<TranscriptionThread> threads;
	float threshold = 5f;

	Timer timer;

	Timer timer2;

	Method transcriptionEvent;

	Method transcriptionEvent2;
	private TranscriptionThread transcriptionThread;
	float volume;
	ArrayList<Float> volumes;
	private StatusPrinter statusPrinter;
	private AutoRecordThread autoRecordThread;
	
	public STT(Object _calee) {
		calee = _calee;
		threads = new ArrayList<TranscriptionThread>();
		minim = new Minim(calee);
		encoder = new FLAC_FileEncoder();
		in = minim.getLineIn(Minim.MONO); // get a LineIn from Minim, default
											// bit depth is 16
		dataPath = System.getProperty("user.dir") + "/";
		recordsPath = getDateTime() + "/";
		if (log) {
			path = dataPath + recordsPath;
		} else {
			path = dataPath;
		}
		recorder = minim.createRecorder(in, path + fileName + fileCount + ".wav", true);
		statusPrinter = new StatusPrinter();
		listen();
	}

	public AudioInput getLineIn() {
		return in;
	}

	TranscriptionThread addTranscriptionThread() {
		transcriptionThread = new TranscriptionThread(language, this);
		transcriptionThread.debug = debug;
		transcriptionThread.start();
		threads.add(transcriptionThread);
		return transcriptionThread;
	}

	private void killTranscriptionThread(int i) {
		threads.get(i).interrupt();
		threads.remove(i);
	}

	private void analyzeEnv() {
		if (!analyzing) {
			timer2 = new Timer(2000);
			timer2.start();
			analyzing = true;
			volumes = new ArrayList<Float>();
		}
		if (timer2 != null) {
			if (!timer2.isFinished()) {
				float volume = in.mix.level() * 1000;
				volumes.add(volume);
			} else {
				float max = 0.0f;
				for (int i = 0; i < volumes.size(); i++) {
					volumes.get(i);
					if (volumes.get(i) > max) {
						max = volumes.get(i);
					}
				}
				volumes.size();
				threshold = (float) Math.ceil(max);
				System.out.println(getTime() + " Volume threshold automatically set to " + threshold);
				analyzing = false;
			}
		}
	}

	/**
	 * Starts a record
	 */
	public void begin() {
		if (!active) {
			onBegin();
			active = true;
		}
	}

	public void disableAutoRecord() {
		disableAutoThreshold();
		if(autoRecordThread != null) {
			autoRecordThread.halt();
		}
		status = "STT info: Manual mode enabled.";
		statusPrinter.setStatus(status);
	}

	/*
	 * Disables the analysis of the environmental volume after initialization.
	 */
	public void disableAutoThreshold() {
		analyzing = false;	
	}

	public void disableDebug() {
		this.debug = false;
	}

	/**
	 * Records will be deleted
	 */
	public void disableHistory() {
		this.log = false;
	}

	private void dispatchTranscriptionEvent(String utterance, float confidence,
			int s) {
		if (transcriptionEvent2 != null && !status.equals(lastStatus)) {
			try {
				transcriptionEvent2.invoke(calee, new Object[] { utterance, confidence, s });
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {

			}
		}
	}

	public void dispose() {
	}

	public void update() {
		// handles active threads and callbacks
		for (int i = 0; i < threads.size(); i++) {
			transcriptionThread = threads.get(i);
			transcriptionThread.debug = debug;
			if (transcriptionThread.isAvailable()) {
				if (transcriptionEvent != null) {
					try {
						transcriptionEvent.invoke(calee, new Object[] {transcriptionThread.getUtterance(), transcriptionThread.getConfidence()});
					} 
					catch (IllegalArgumentException e) {
						e.printStackTrace();
					} 
					catch (IllegalAccessException e) {
						e.printStackTrace();
					} 
					catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				} 
				else if (transcriptionEvent2 != null) {
					dispatchTranscriptionEvent(transcriptionThread.getUtterance(), transcriptionThread.getConfidence(), transcriptionThread.getStatus());
				}
				killTranscriptionThread(i);
			}
		}
	}
	
	/**
	 * Enables the automatic recording if the set voulme threshold has been
	 * reached
	 */
	public void enableAutoRecord() {
		enableAutoThreshold();
		autoRecordThread = new AutoRecordThread();
		autoRecordThread.start();
		status = "STT info: Automatic mode enabled. Anything louder than threshold will be recorded.";
		statusPrinter.setStatus(status);
	}
	
	
	public class AutoRecordThread extends Thread {
		
		private boolean run = false;
		
		public AutoRecordThread() {
			run = true;
			setName("AutoRecordThread");
		}
		
		@Override
		public void run() {
			while (!Thread.currentThread().isInterrupted()) {
				if(run) {
					handleAuto();
				}
			}
		}
		
		public void halt() {
			run = false;
		}
	}

	/**
	 * Enables the automatic recording if the given voulme threshold has been
	 * reached
	 * 
	 * @param threshold
	 *            the threshold that can be checked with getVolume()
	 */
	public void enableAutoRecord(float threshold) {
		this.threshold = threshold;
		autoRecordThread = new AutoRecordThread();
		autoRecordThread.start();
		status = "STT info: Automatic mode enabled. Anything louder than " + threshold + 
				" will be recorded.";
		statusPrinter.setStatus(status);
	}

	/**
	 * Enables the analysis of the environmental volume after initialization.
	 */
	public void enableAutoThreshold() {
		analyzing = false;
		analyzeEnv();
	}

	/**
	 * Enables logging of events like recording, transcribing, success, error.
	 */
	public void enableDebug() {
		this.debug = true;
		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).debug = this.debug;
		}
	}

	/**
	 * Records will be kept in the data folder
	 */
	public void enableHistory() {
		this.log = true;
	}

	/**
	 * Ends a record
	 */
	public void end() {
		if (active) {
			onSpeechFinish();
			active = false;
		}
	}

	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String getLanguage() {
		return language;
	}

	/**
	 * Returns the Minim instance for access in programs that need to use Minim
	 * beside STT
	 */
	public Minim getMinimInstance() {
		return minim;
	}

	public float getThreshold() {
		return threshold;
	}

	private String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public float getVolume() {
		updateVolume();
		return volume;
	}

	private void handleAuto() {
		if (analyzing) {
			analyzeEnv();
		}
		updateVolume();
		if (volume > threshold) {
			// start recording when someone says something louder than a threshold
			onSpeech();
		} else {
			if (timer.isFinished() && volume < threshold
					&& recorder.isRecording() && recording) {
				onSpeechFinish();
			} else if (timer.isFinished() && volume < threshold) {
				startListening();
			}
		}
	}

	private void initFileSystem() {
		try {
			File datadir = new File(dataPath + "/");
			datadir.mkdir();
			if (log) {
				File recordsdir = new File(path);
				recordsdir.mkdir();
			}
		} catch (NullPointerException e) {
			System.err.println("Could not read files in directory: " + path);
		}
		timer = new Timer(interval);
	}

	private void listen() {
		addTranscriptionThread();
		initFileSystem();

		// listening repeats until something is heard
		timer.start();

		// setting up reflection method that is called in PApplet
		try {
			transcriptionEvent = calee.getClass().getMethod("transcribe",
					String.class, float.class);
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		} catch (IllegalArgumentException e) {
		}

		// setting up reflection method that is called in PApplet
		try {
			transcriptionEvent2 = calee.getClass().getMethod("transcribe", String.class, float.class, int.class);
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		} catch (IllegalArgumentException e) {
		}
		if (transcriptionEvent == null && transcriptionEvent2 == null) {
			System.err
					.println("STT info: use transcribe(String word, float confidence, [int status]) in your main sketch to receive transcription events");
		}

	}

	private void onBegin() {
		status = "Recording";
		statusPrinter.setStatus(status);
		startListening();
	}

	private void onSpeech() {
		// resets the timer each time something is heard
		status = "Recording";
		statusPrinter.setStatus(status);
		timer.start();
		recording = true;
		dispatchTranscriptionEvent(transcriptionThread.getUtterance(),
				transcriptionThread.getConfidence(), STT.RECORDING);
	}

	public void onSpeechFinish() {
		status = "Transcribing";
		fired = false;
		recorder.endRecord();
		recorder.save();
		recording = false;
		
		statusPrinter.setStatus(status);
		dispatchTranscriptionEvent("", 0, STT.TRANSCRIBING);

		// Encode the wav to flac
		String flac = path + fileName + fileCount + ".flac";
		encoder.encode(new File(path + fileName + fileCount + ".wav"), new File(flac));
		boolean exists = (new File(flac)).exists();
		while (exists == false) {
			exists = (new File(flac)).exists();
		}
		if (exists) {
			this.transcribe(flac);
		} 
		else {
			System.err.println("Could not transcribe. File was not encoded in time.");
		}
		// new file for new speech
		if (log) {
			fileCount++;
		}
	}

	/**
	 * @param language
	 *            en, de, fr, etc. If the language is not supported it will
	 *            automatically fall back to English.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Sets the volume threshold that is used to recognize speech and to filter
	 * background noise.
	 */
	public void setThreshold(float threshold) {
		status = "Threshold changed from " + this.threshold + " to " + threshold;
		this.threshold = threshold;
		statusPrinter.setStatus(status);
	}

	private void startListening() {
		recorder.endRecord();
		recorder.save();
		recorder = minim.createRecorder(in, path + fileName + fileCount
				+ ".wav", true);
		recorder.beginRecord();
		timer.start();
	}

	private void stop() {
		// always close Minim audio classes when you are done with them
		in.close();
		minim.stop();
	}

	public void transcribe(String _path) {
		addTranscriptionThread().startTranscription(_path);
	}

	public void transcribeFile(String _path) {
		status = "Transcribing";

		statusPrinter.setStatus(status);
		_path = path + "/" + _path;
		// Encode the wav to flac
		String flac = _path.substring(0, _path.length() - 4) + ".flac";
		encoder.encode(new File(_path), new File(flac));
		boolean exists = (new File(flac)).exists();
		while (exists == false) {
			exists = (new File(flac)).exists();
		}

		if (exists) {
			this.transcribe(flac);
		} else {
			System.err
					.println("Could not transcribe. File was not encoded in time.");
		}

		// new file for new speech
		if (log)
			fileCount++;
	}

	private void updateVolume() {
		volume = in.mix.level() * 1000;
	}

	public class StatusPrinter {
		private String lastStatus;
		private String status;
		private boolean isDebug = true;

		private void printStatus() {
			if (getDebugMode() && !getStatus().equals(lastStatus)) {
				System.out.println(getTime() + " " + getStatus());
				lastStatus = getStatus();
			}
		}

		public boolean getDebugMode() {
			return isDebug;
		}

		public void setDebugMode(boolean isDebug) {
			this.isDebug = isDebug;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
			printStatus();
		}
	}
}