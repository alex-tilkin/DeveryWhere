package speechToText;

import speechToText.STT;
import processing.core.PApplet;

public class SttControllerGraphic extends PApplet{

	
	private STT stt = null;
	private Language language = Language.ENGLISH;
	private boolean bAutoRecognition = false;
	private boolean bDebbuging = false;
	private boolean bKeepHistory = false;
	
	public enum Language {
		ENGLISH
	}
	
	public void setup () {
		stt = new STT(this, false);
		stt.setLanguage("en-us");
		stt.enableDebug();
	}
	
	public SttControllerGraphic() {
		
	}
	
//	public SttController(final Language _language, final boolean _bAutoRecognition, 
//			final boolean _bDebbuging, final boolean _bKeepHistory) {
//		language = _language;
//		bAutoRecognition = _bAutoRecognition;
//		bDebbuging = _bDebbuging;
//		bKeepHistory = _bKeepHistory;
//	}
	
	public void draw() {
		background(0);
	}
	
	public void transcribe (String utterance, float confidence) {
		System.out.println(utterance + " with confidence of: " + confidence);
	}
	
	public void keyPressed () {
		stt.begin();
	}
	
	public void keyReleased () {
		stt.end();
	}
}