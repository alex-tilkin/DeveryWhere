package com.getflourish.stt;

public class SpeechResponse
{
    private SpeechResult[] result;
    private int result_index = -1;
    
	public SpeechResult[] getSpeechResults() {
		return result;
	}
	
	public SpeechResult getSpeechResultAtIndex(final int index) {
		if(index < 0 || index >= result.length) {
			return null;
		}
		return result[index];
	}
	
	public int getResultIndex() {
		return result_index;
	}
	
    public class SpeechResult
    {
    	private SpeechAlternative[] alternative;
    	private Boolean Final;
        
		public SpeechAlternative[] getAlternative() {
			return alternative;
		}

		public Boolean getFinal() {
			return Final;
		}
		
        public class SpeechAlternative
        {
        	private String transcript;
        	private float confidence;
        	
			public String getTranscript() {
				return transcript;
			}
			
			public float getConfidence() {
				return confidence;
			}
        }
    }
}