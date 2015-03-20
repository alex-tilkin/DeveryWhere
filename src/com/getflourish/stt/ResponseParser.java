package com.getflourish.stt;
import com.google.gson.Gson;

public class ResponseParser {
	private Gson gson = null;
	private String jsonString;
	private SpeechResponses speechResponses = null;
	
	public ResponseParser() {
		setSpeechResponses(new SpeechResponses());
		gson = new Gson();
	}
	
	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}
	
	public void reset() {
		getSpeechResponses().clear();
		jsonString = "";
	}
	
	public void parse() {
		String[] jsons = jsonString.split("\n");
        for(String j : jsons){
        	SpeechResponse speechResponse = gson.fromJson(j, SpeechResponse.class);
            if (speechResponse == null || speechResponse.result == null || speechResponse.result.length <= 0) { 
            	continue;
            }
            getSpeechResponses().add(speechResponse);
        }
	}

	public SpeechResponses getSpeechResponses() {
		return speechResponses;
	}

	private void setSpeechResponses(SpeechResponses speechResponses) {
		this.speechResponses = speechResponses;
	}
}