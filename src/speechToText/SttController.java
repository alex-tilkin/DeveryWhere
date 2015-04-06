package speechToText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SttController {

	private STT stt = null;
	private Method transcriptionEvent = null;
	private Object _owner = null;
	private float _confidenceThreshold = 0; 
	private static Logger log = Logger.getLogger("SttController");
	
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
			log.log(Level.FINE, "Debug mode enabled.");
		}
		else {
			stt.disableDebug();
			log.log(Level.FINE, "Debug mode disabled.");
		}
	}
	
	/**
	 * Sets confidence threshold
	 * @param confidenceThreshold - The threshold for confidence
	 */
	public void setConfidenceThreshold(final int confidenceThreshold) {
		_confidenceThreshold = (float) ((float)confidenceThreshold / 100.0);
		log.log(Level.FINE, "Confidence threshod has been set to: {0}", _confidenceThreshold);
	}
	
	/**
	 * Starts recording.
	 */
	public void begin () {
		stt.begin();
		log.log(Level.FINE, "Recording started out.");
	}
	
	/**
	 * Stops recording
	 */
	public void end () {
		stt.end();
		log.log(Level.FINE, "Recording ended.");
	}
	
	/**
	 * Enables/ Disables Auto Record. When Auto Record is enabled the STT module begin to record 
	 * when speech identified.
	 * @param enable - True - Enable Auto Record. False - Disable Auto Record.
	 */
	public void setAutoRecord(boolean enable) {
		if(enable == true) {
			stt.enableAutoRecord();
		}
		else {
			stt.disableAutoRecord();
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
		String transcriptionBuffer = confidence >= _confidenceThreshold ? utterance : "****";
		log.log(Level.FINE, "Sunscribtion to events has been accomplished.");
		try {
			transcriptionEvent.invoke(_owner, new Object[] { transcriptionBuffer });
		} 
		catch (IllegalAccessException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.toString(), e);
		} 
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.toString(), e);
		} 
		catch (InvocationTargetException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.toString(), e);
		}
	}
	
	/**
	 * Initializes STT object
	 */
	private void initSTT() {
		stt = new STT(this);
		stt.setLanguage("en-us");
		log.log(Level.FINE, "STT has been initialized.");
	}
	
	/**
	 * Subscribe to events
	 * @param calee - The owner of this object
	 */
	private void subscribeToEvents(Object owner) {
		try {
			transcriptionEvent = owner.getClass().getMethod("transcriptionResult", String.class);
			log.log(Level.FINE, "Sunscribtion to events has been accomplished.");
		} 
		catch (SecurityException e) {
		} 
		catch (NoSuchMethodException e) {
		} 
		catch (IllegalArgumentException e) {
		}
	}
}