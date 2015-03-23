package speechToText;

import java.util.ArrayList;

import speechToText.SpeechResponse.SpeechResult;
import speechToText.SpeechResponse.SpeechResult.SpeechAlternative;

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