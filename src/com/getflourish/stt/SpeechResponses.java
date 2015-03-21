package com.getflourish.stt;

import java.util.ArrayList;
import com.getflourish.stt.SpeechResponse.SpeechResult;
import com.getflourish.stt.SpeechResponse.SpeechResult.SpeechAlternative;

public class SpeechResponses extends ArrayList<SpeechResponse> {
	
	public SpeechAlternative getBestResponse() {
		SpeechAlternative bestResponse = null;
		
		for(SpeechResponse speechResponse : this) {
			for(SpeechResult speechResult : speechResponse.getSpeechResults()) {
				for(SpeechAlternative speechAlternative : speechResult.getAlternative()) {
					if(bestResponse == null || speechAlternative.getConfidence() > bestResponse.getConfidence()) {
						bestResponse = speechAlternative;
					}
				}
			}
		}
		
		return bestResponse;
	}
}