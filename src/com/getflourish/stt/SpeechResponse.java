package com.getflourish.stt;

public class SpeechResponse
{
    public SpeechResult[] result;
    public int result_index;
    
    public class SpeechResult
    {
        public SpeechAlternative[] alternative;
        public Boolean Final;
        
        public class SpeechAlternative
        {
            public String transcript;
            public double confidence;
        }
    }
}