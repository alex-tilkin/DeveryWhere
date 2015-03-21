package com.getflourish.stt;

import org.json.JSONException;
import com.getflourish.stt.SpeechResponse.SpeechResult.SpeechAlternative;

public class SimpleStt {

	public static void main(String[] args) throws JSONException {
		String jsonString = "{\"result\":[]}\n{\"result\":[{\"alternative\":[{\"transcript\":\"123\",\"confidence\":0.78849554},{\"transcript\":\"one2free\"},{\"transcript\":\"12 free\"},{\"transcript\":\"1 2 3\"},{\"transcript\":\"one two three\"}],\"final\":true}],\"result_index\":0}";
		
		ResponseParser responseParser = new ResponseParser();
		responseParser.setJsonString(jsonString);
		responseParser.parse();
		SpeechResponses speechResponses = responseParser.getSpeechResponses();
		SpeechAlternative speechAlternative = speechResponses.getBestResponse();
		
		responseParser.reset();
	}
}