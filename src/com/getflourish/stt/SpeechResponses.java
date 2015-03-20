package com.getflourish.stt;

import java.util.ArrayList;
import com.getflourish.stt.SpeechResponse.SpeechResult;
import com.getflourish.stt.SpeechResponse.SpeechResult.SpeechAlternative;

public class SpeechResponses extends ArrayList<SpeechResponse> {
	
	public SpeechAlternative getBestResponse() {
		SpeechAlternative bestResponse = null;
		
		for(SpeechResponse speechResponse : this) {
			for(SpeechResult speechResult : speechResponse.result) {
				for(SpeechAlternative speechAlternative : speechResult.alternative) {
					if(bestResponse == null || speechAlternative.confidence > bestResponse.confidence) {
						bestResponse = speechAlternative;
					}
				}
			}
		}
		
		return bestResponse;
	}
}