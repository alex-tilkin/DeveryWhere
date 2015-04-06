package speechToText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SttController {

	private STT stt = null;
	private Method transcriptionEvent = null;
	private Object _owner = null;
	private float _confidenceThreshold = 0; 
	private static Logger log = Logger.getLogger(SttController.class.getName());
	private String failureToken = "****";
	private FileHandler fileHandler = null;
	
	public SttController() {
		try {
			fileHandler = new FileHandler("SpeachToTextModule.log");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		log.addHandler(fileHandler);
		log.setLevel(Level.ALL);
	}
	
	/**
	 * Initializes all necessary components and default configuration.
	 * Note: The calling object has to implement the following method: void transcribtionResult(String result);.
	 * All results will arrive to this method.
	 */
	public void setup(Object owner) {
		_owner = owner;
		subscribeToEvents(_owner);
		initSTT();
	}

	/**
	 * Enables/ Disables debug mode.
	 * @param enable - True - Enables debugging, False - Disables debugging
	 */
	public void setDebugMode(boolean enable) {
		if(enable == true) {
			stt.enableDebug();
			log.config("Debug mode enabled.");
		}
		else {
			stt.disableDebug();
			log.config("Debug mode disabled.");
		}
	}
	
	/**
	 * Sets confidence threshold
	 * @param confidenceThreshold - The threshold for confidence
	 */
	public void setConfidenceThreshold(final int confidenceThreshold) {
		_confidenceThreshold = (float) ((float)confidenceThreshold / 100.0);
		log.config(String.format("Confidence threshod has been set to: %f", _confidenceThreshold));
	}
	
	/**
	 * Starts recording.
	 */
	public void begin () {
		stt.begin();
		log.fine("Recording started out.");
	}
	
	/**
	 * Stops recording
	 */
	public void end () {
		stt.end();
		log.fine("Recording ended.");
	}
	
	/**
	 * Enables/ Disables Auto Record. When Auto Record is enabled the STT module begin to record 
	 * when speech identified.
	 * @param enable - True - Enable Auto Record. False - Disable Auto Record.
	 */
	public void setAutoRecord(boolean enable) {
		if(enable == true) {
			stt.enableAutoRecord();
			log.fine("Auto recording enabled.");
		}
		else {
			stt.disableAutoRecord();
			log.fine("Auto recording disabled.");
		}
	}
	
	/**
	 * This implementation required for Minim construction.
	 * @param fileName
	 * @return
	 */
	@SuppressWarnings("unused")
	public String sketchPath(String fileName) {
		return fileName;
	}
		
	/**
	 * This implementation required for Minim construction.
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("unused")
	public InputStream createInput(String fileName) throws FileNotFoundException {
		return new FileInputStream(fileName);
	}
	
	/**
	 * Raised when transcription process finished.
	 * @param utterance - The best result.
	 * @param confidence - With what confidence the utterance had been transcribed 
	 */
	public void transcribe (String utterance, float confidence) {
		String transcriptionBuffer = confidence >= _confidenceThreshold && confidence != 0.0 
				? utterance : getFailureToken();
		log.fine(String.format("transcription arrived: %s. With confidence %f", utterance, confidence));
		try {
			transcriptionEvent.invoke(_owner, new Object[] { transcriptionBuffer });
		} 
		catch (IllegalAccessException e) {
			e.printStackTrace();
			log.severe(e.toString());
		} 
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			log.severe(e.toString());
		} 
		catch (InvocationTargetException e) {
			e.printStackTrace();
			log.severe(e.toString());
		}
	}
	
	/**
	 * Initializes STT object
	 */
	private void initSTT() {
		stt = new STT(this);
		stt.setLanguage("en-us");
		log.fine("STT has been initialized.");
	}
	
	/**
	 * Subscribe to events
	 * @param calee - The owner of this object
	 */
	private void subscribeToEvents(Object owner) {
		try {
			transcriptionEvent = owner.getClass().getMethod("transcriptionResult", String.class);
			log.fine("Sunscribtion to events has been accomplished.");
		} 
		catch (SecurityException e) {
		} 
		catch (NoSuchMethodException e) {
		} 
		catch (IllegalArgumentException e) {
		}
	}

	
	/**
	 * @return The token that is returned in case a transcription is failed.
	 */
	public String getFailureToken() {
		return failureToken;
	}

	
	/**
	 * Sets the return token in case of transcription failure.
	 * For example: $$$%$^ (any non-trivial combination or rare character will be a good decision)
	 * @param failureToken
	 */
	public void setFailureToken(String failureToken) {
		this.failureToken = failureToken;
	}
}