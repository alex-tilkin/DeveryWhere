package com.dictationParser;

public class DictationParserProcessor extends DictationParserBaseListener {
	
	
	@Override public void enterCommand(DictationParserParser.CommandContext ctx) { 
		
	}
	
	@Override public void exitCommand(DictationParserParser.CommandContext ctx) { 
		
	}
	
	private class DataPackage{
		private Command command;
		private Element element;
	}
}
