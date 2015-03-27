package speechToText;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SttController {
	
	private STT stt = null;
	
	public void setup() {
		stt = new STT(this, false);
		stt.setLanguage("en-us");
		stt.enableDebug();
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
	
	public String sketchPath(String fileName) {
		return fileName;
	}
	
	public InputStream createInput(String fileName) throws FileNotFoundException {
		return new FileInputStream(fileName);
	}
}
