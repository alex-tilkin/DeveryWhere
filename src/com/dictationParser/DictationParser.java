package com.dictationParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DictationParser {
    
    public DictationParser(String context){
        ANTLRInputStream input = new ANTLRInputStream(context);
        DictationParserLexer lexer = new DictationParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DictationParserParser parser = new DictationParserParser(tokens);
        ParseTree parseTree = parser.command();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new DictationParserBaseListener(), parseTree);
        System.out.println(parseTree.toStringTree(parser)); // print a \n after translation
    }
}