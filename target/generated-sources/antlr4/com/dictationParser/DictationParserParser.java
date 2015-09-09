package com.dictationParser;
// Generated from DictationParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DictationParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		METHOD=1, FUNCTION=2, CONSTRUCTOR=3, FIELD=4, BLOCK=5, INSIDE=6, IN=7, 
		AFTER=8, BEFORE=9, ABOVE=10, BELOW=11, INNER=12, OF_TYPE=13, NEW=14, NAMED=15, 
		CALLED=16, LINE=17, NUMBER=18, OPTION=19, AN=20, A=21, THAT_ACCEPTS=22, 
		WITH=23, AND=24, OR=25, TO=26, FROM=27, GO_TO=28, EXIT=29, QUIT=30, WE_ARE_DONE_WITH=31, 
		MAKE_IT=32, CHANGE_IT=33, CREATE=34, OPEN=35, OPEN_PARENTHESES=36, CALL=37, 
		OF=38, PERIOD=39, PERIOD_CHAR=40, DELETE=41, REMOVE=42, ASSIGN=43, PLUS=44, 
		MATH_PLUS=45, MINUS=46, MATH_MINUS=47, IS=48, IS_NOT=49, IS_EQUAL_TO=50, 
		EQUAL_TO=51, EQUALS_TO=52, EQUALS=53, IS_EQUALS=54, IS_DIFFERENT_FROM=55, 
		DIFFERENT_FROM=56, LESS_THAN=57, LESS_THAN_MATH=58, IS_LESS_THAN=59, IS_LESS_THAN_EQUAL=60, 
		IS_LESS_THAN_EQUALS=61, LESS_THAN_EQUAL=62, LESS_THAN_EQUALS=63, LESS_THAN_EQUAL_MATH=64, 
		LESS_THAN_EQUAL_MATH_SPACE=65, GREATER_THAN=66, GREATER_THAN_MATH=67, 
		IS_GREATER_THAN=68, GREATER_THAN_EQUAL=69, GREATER_THAN_EQUAL_MATH=70, 
		GREATER_THAN_EQUAL_MATH_SPACE=71, IF=72, THEN=73, ABSTRACT=74, ASSERT=75, 
		CATCH=76, CLASS=77, CONST=78, DO=79, ELSE=80, ENUM=81, EXTENDS=82, EXTEND=83, 
		THAT_EXTENDS=84, FINAL=85, FOR=86, IMPLEMENTS=87, THAT_IMPLEMENTS=88, 
		IMPLEMENT=89, INTERFACE=90, PRIVATE=91, PROTECTED=92, PUBLIC=93, STATIC=94, 
		SUPER=95, THROW=96, THROWS=97, TRANSIENT=98, TRY=99, VOID=100, VOLATILE=101, 
		WHILE=102, FOR_EACH=103, FOR_EACH_SPACE=104, THAT_RETURNS=105, RETURNS=106, 
		RETURN=107, SWITCH=108, SYNCHRONIZED=109, STRICTFP=110, NATIVE=111, PACKAGE=112, 
		IMPORT=113, INSTANCEOF=114, FINALLY=115, CONTINUE=116, DEFAULT=117, BREAK=118, 
		CASE=119, IN_CASE=120, ZERO=121, ONE=122, TWO=123, THREE=124, FOUR=125, 
		FIVE=126, SIX=127, SEVEN=128, EIGHT=129, NINE=130, WS=131, Number=132, 
		Element=133;
	public static final int
		RULE_command = 0, RULE_creationCommand = 1, RULE_creationVerb = 2, RULE_createField = 3, 
		RULE_createMethod = 4, RULE_createConstructor = 5, RULE_createDataType = 6, 
		RULE_createBlock = 7, RULE_createBlockStatement = 8, RULE_createLoop = 9, 
		RULE_createForEachLoop = 10, RULE_createWhileLoop = 11, RULE_createDoWhileLoop = 12, 
		RULE_createForLoop = 13, RULE_navigationCommand = 14, RULE_navigationVerb = 15, 
		RULE_exitCommand = 16, RULE_exit = 17, RULE_modificationCommand = 18, 
		RULE_modifyAccessLevel = 19, RULE_modificationVerb = 20, RULE_selectionCommand = 21, 
		RULE_deletionCommand = 22, RULE_invocationCommand = 23, RULE_fieldModifier = 24, 
		RULE_variableModifier = 25, RULE_modifier = 26, RULE_accessLevel = 27, 
		RULE_localVariableDeclaration = 28, RULE_statement = 29, RULE_expression = 30, 
		RULE_primary = 31, RULE_elementsElement = 32, RULE_elementLocation = 33, 
		RULE_fieldRef = 34, RULE_elementRef = 35, RULE_classRef = 36, RULE_namedElement = 37, 
		RULE_elementsName = 38, RULE_enumRef = 39, RULE_interfaceRef = 40, RULE_unspecifiedRef = 41, 
		RULE_reference = 42, RULE_locationRef = 43, RULE_parametersList = 44, 
		RULE_parameter = 45, RULE_dataType = 46, RULE_line = 47, RULE_number = 48, 
		RULE_returnsVars = 49, RULE_implementsVars = 50, RULE_extendsVars = 51, 
		RULE_plusVars = 52, RULE_minusVars = 53, RULE_equalsVars = 54, RULE_isDifferentVars = 55, 
		RULE_lessThanVars = 56, RULE_lessThanEqualsVars = 57, RULE_greaterThanVars = 58, 
		RULE_greaterThanEqualVars = 59, RULE_forEachVars = 60, RULE_caseVars = 61, 
		RULE_periodVars = 62;
	public static final String[] ruleNames = {
		"command", "creationCommand", "creationVerb", "createField", "createMethod", 
		"createConstructor", "createDataType", "createBlock", "createBlockStatement", 
		"createLoop", "createForEachLoop", "createWhileLoop", "createDoWhileLoop", 
		"createForLoop", "navigationCommand", "navigationVerb", "exitCommand", 
		"exit", "modificationCommand", "modifyAccessLevel", "modificationVerb", 
		"selectionCommand", "deletionCommand", "invocationCommand", "fieldModifier", 
		"variableModifier", "modifier", "accessLevel", "localVariableDeclaration", 
		"statement", "expression", "primary", "elementsElement", "elementLocation", 
		"fieldRef", "elementRef", "classRef", "namedElement", "elementsName", 
		"enumRef", "interfaceRef", "unspecifiedRef", "reference", "locationRef", 
		"parametersList", "parameter", "dataType", "line", "number", "returnsVars", 
		"implementsVars", "extendsVars", "plusVars", "minusVars", "equalsVars", 
		"isDifferentVars", "lessThanVars", "lessThanEqualsVars", "greaterThanVars", 
		"greaterThanEqualVars", "forEachVars", "caseVars", "periodVars"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'method'", "'function'", "'constructor'", "'field'", "'block'", 
		"'inside'", "'in'", "'after'", "'before'", "'above'", "'below'", "'inner'", 
		"'of type'", "'new'", "'named'", "'called'", "'line'", "'number'", "'option'", 
		"'an'", "'a'", "'that accepts'", "'with'", "'and'", "'or'", "'to'", "'from'", 
		"'go to'", "'exit'", "'quit'", "'we are done with'", "'make it'", "'change it to'", 
		"'create'", "'open'", "'open parentheses'", "'call'", "'of'", "'period'", 
		"'.'", "'delete'", "'remove'", "'assign'", "'plus'", "'+'", "'minus'", 
		"'-'", "'is'", "'is not'", "'is equal to'", "'equal to'", "'equals to'", 
		"'equals'", "'is equals'", "'is different from'", "'different from'", 
		"'less than'", "'<'", "'is less than'", "'is less than equal'", "'is less than equals'", 
		"'less than equal'", "'less than equals'", "'<='", "'< ='", "'greater than'", 
		"'>'", "'is greater than'", "'greater than equal'", "'>='", "'> ='", "'if'", 
		"'then'", "'abstract'", "'assert'", "'catch'", "'class'", "'const'", "'do'", 
		"'else'", "'enum'", "'extends'", "'extend'", "'that extends'", "'final'", 
		"'for'", "'implements'", "'that implements'", "'implement'", "'interface'", 
		"'private'", "'protected'", "'public'", "'static'", "'super'", "'throw'", 
		"'throws'", "'transient'", "'try'", "'void'", "'volatile'", "'while'", 
		"'foreach'", "'for each'", "'that returns'", "'returns'", "'return'", 
		"'switch'", "'synchronized'", "'strictfp'", "'native'", "'package'", "'import'", 
		"'instanceof'", "'finally'", "'continue'", "'default'", "'break'", "'case'", 
		"'in case'", "'zero'", "'one'", "'two'", "'three'", "'four'", "'five'", 
		"'six'", "'seven'", "'eight'", "'nine'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "METHOD", "FUNCTION", "CONSTRUCTOR", "FIELD", "BLOCK", "INSIDE", 
		"IN", "AFTER", "BEFORE", "ABOVE", "BELOW", "INNER", "OF_TYPE", "NEW", 
		"NAMED", "CALLED", "LINE", "NUMBER", "OPTION", "AN", "A", "THAT_ACCEPTS", 
		"WITH", "AND", "OR", "TO", "FROM", "GO_TO", "EXIT", "QUIT", "WE_ARE_DONE_WITH", 
		"MAKE_IT", "CHANGE_IT", "CREATE", "OPEN", "OPEN_PARENTHESES", "CALL", 
		"OF", "PERIOD", "PERIOD_CHAR", "DELETE", "REMOVE", "ASSIGN", "PLUS", "MATH_PLUS", 
		"MINUS", "MATH_MINUS", "IS", "IS_NOT", "IS_EQUAL_TO", "EQUAL_TO", "EQUALS_TO", 
		"EQUALS", "IS_EQUALS", "IS_DIFFERENT_FROM", "DIFFERENT_FROM", "LESS_THAN", 
		"LESS_THAN_MATH", "IS_LESS_THAN", "IS_LESS_THAN_EQUAL", "IS_LESS_THAN_EQUALS", 
		"LESS_THAN_EQUAL", "LESS_THAN_EQUALS", "LESS_THAN_EQUAL_MATH", "LESS_THAN_EQUAL_MATH_SPACE", 
		"GREATER_THAN", "GREATER_THAN_MATH", "IS_GREATER_THAN", "GREATER_THAN_EQUAL", 
		"GREATER_THAN_EQUAL_MATH", "GREATER_THAN_EQUAL_MATH_SPACE", "IF", "THEN", 
		"ABSTRACT", "ASSERT", "CATCH", "CLASS", "CONST", "DO", "ELSE", "ENUM", 
		"EXTENDS", "EXTEND", "THAT_EXTENDS", "FINAL", "FOR", "IMPLEMENTS", "THAT_IMPLEMENTS", 
		"IMPLEMENT", "INTERFACE", "PRIVATE", "PROTECTED", "PUBLIC", "STATIC", 
		"SUPER", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", 
		"FOR_EACH", "FOR_EACH_SPACE", "THAT_RETURNS", "RETURNS", "RETURN", "SWITCH", 
		"SYNCHRONIZED", "STRICTFP", "NATIVE", "PACKAGE", "IMPORT", "INSTANCEOF", 
		"FINALLY", "CONTINUE", "DEFAULT", "BREAK", "CASE", "IN_CASE", "ZERO", 
		"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", 
		"WS", "Number", "Element"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DictationParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DictationParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public CreationCommandContext creationCommand() {
			return getRuleContext(CreationCommandContext.class,0);
		}
		public NavigationCommandContext navigationCommand() {
			return getRuleContext(NavigationCommandContext.class,0);
		}
		public SelectionCommandContext selectionCommand() {
			return getRuleContext(SelectionCommandContext.class,0);
		}
		public ModificationCommandContext modificationCommand() {
			return getRuleContext(ModificationCommandContext.class,0);
		}
		public DeletionCommandContext deletionCommand() {
			return getRuleContext(DeletionCommandContext.class,0);
		}
		public InvocationCommandContext invocationCommand() {
			return getRuleContext(InvocationCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				creationCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				navigationCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				selectionCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				modificationCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				deletionCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				invocationCommand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreationCommandContext extends ParserRuleContext {
		public CreateFieldContext createField() {
			return getRuleContext(CreateFieldContext.class,0);
		}
		public CreateMethodContext createMethod() {
			return getRuleContext(CreateMethodContext.class,0);
		}
		public CreateConstructorContext createConstructor() {
			return getRuleContext(CreateConstructorContext.class,0);
		}
		public CreateDataTypeContext createDataType() {
			return getRuleContext(CreateDataTypeContext.class,0);
		}
		public CreateBlockContext createBlock() {
			return getRuleContext(CreateBlockContext.class,0);
		}
		public CreateLoopContext createLoop() {
			return getRuleContext(CreateLoopContext.class,0);
		}
		public CreationVerbContext creationVerb() {
			return getRuleContext(CreationVerbContext.class,0);
		}
		public ElementLocationContext elementLocation() {
			return getRuleContext(ElementLocationContext.class,0);
		}
		public TerminalNode AN() { return getToken(DictationParserParser.AN, 0); }
		public TerminalNode A() { return getToken(DictationParserParser.A, 0); }
		public CreationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creationCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreationCommand(this);
		}
	}

	public final CreationCommandContext creationCommand() throws RecognitionException {
		CreationCommandContext _localctx = new CreationCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_creationCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(134);
				creationVerb();
				}
				break;
			}
			setState(138);
			_la = _input.LA(1);
			if (_la==AN || _la==A) {
				{
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==AN || _la==A) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(140);
				createField();
				}
				break;
			case 2:
				{
				setState(141);
				createMethod();
				}
				break;
			case 3:
				{
				setState(142);
				createConstructor();
				}
				break;
			case 4:
				{
				setState(143);
				createDataType();
				}
				break;
			case 5:
				{
				setState(144);
				createBlock();
				}
				break;
			case 6:
				{
				setState(145);
				createLoop();
				}
				break;
			}
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(148);
				elementLocation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreationVerbContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(DictationParserParser.CREATE, 0); }
		public TerminalNode NEW() { return getToken(DictationParserParser.NEW, 0); }
		public TerminalNode OPEN() { return getToken(DictationParserParser.OPEN, 0); }
		public CreationVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creationVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreationVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreationVerb(this);
		}
	}

	public final CreationVerbContext creationVerb() throws RecognitionException {
		CreationVerbContext _localctx = new CreationVerbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_creationVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << CREATE) | (1L << OPEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFieldContext extends ParserRuleContext {
		public FieldRefContext fieldRef() {
			return getRuleContext(FieldRefContext.class,0);
		}
		public FieldModifierContext fieldModifier() {
			return getRuleContext(FieldModifierContext.class,0);
		}
		public CreateFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateField(this);
		}
	}

	public final CreateFieldContext createField() throws RecognitionException {
		CreateFieldContext _localctx = new CreateFieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ABSTRACT - 74)) | (1L << (CONST - 74)) | (1L << (FINAL - 74)) | (1L << (PRIVATE - 74)) | (1L << (PROTECTED - 74)) | (1L << (PUBLIC - 74)) | (1L << (STATIC - 74)))) != 0)) {
				{
				setState(153);
				fieldModifier();
				}
			}

			setState(156);
			fieldRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateMethodContext extends ParserRuleContext {
		public NamedElementContext namedElement() {
			return getRuleContext(NamedElementContext.class,0);
		}
		public TerminalNode METHOD() { return getToken(DictationParserParser.METHOD, 0); }
		public TerminalNode FUNCTION() { return getToken(DictationParserParser.FUNCTION, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public ReturnsVarsContext returnsVars() {
			return getRuleContext(ReturnsVarsContext.class,0);
		}
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public TerminalNode THAT_ACCEPTS() { return getToken(DictationParserParser.THAT_ACCEPTS, 0); }
		public TerminalNode WITH() { return getToken(DictationParserParser.WITH, 0); }
		public CreateMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateMethod(this);
		}
	}

	public final CreateMethodContext createMethod() throws RecognitionException {
		CreateMethodContext _localctx = new CreateMethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ABSTRACT - 74)) | (1L << (PRIVATE - 74)) | (1L << (PROTECTED - 74)) | (1L << (PUBLIC - 74)) | (1L << (STATIC - 74)))) != 0)) {
				{
				setState(158);
				modifier();
				}
			}

			setState(161);
			_la = _input.LA(1);
			if ( !(_la==METHOD || _la==FUNCTION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(162);
			namedElement();
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==THAT_ACCEPTS || _la==WITH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(164);
				parametersList();
				}
				break;
			}
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(167);
				returnsVars();
				setState(168);
				match(Element);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(DictationParserParser.CONSTRUCTOR, 0); }
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public TerminalNode THAT_ACCEPTS() { return getToken(DictationParserParser.THAT_ACCEPTS, 0); }
		public TerminalNode WITH() { return getToken(DictationParserParser.WITH, 0); }
		public CreateConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateConstructor(this);
		}
	}

	public final CreateConstructorContext createConstructor() throws RecognitionException {
		CreateConstructorContext _localctx = new CreateConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ABSTRACT - 74)) | (1L << (PRIVATE - 74)) | (1L << (PROTECTED - 74)) | (1L << (PUBLIC - 74)) | (1L << (STATIC - 74)))) != 0)) {
				{
				setState(172);
				modifier();
				}
			}

			setState(175);
			match(CONSTRUCTOR);
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==THAT_ACCEPTS || _la==WITH) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(177);
				parametersList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public NamedElementContext namedElement() {
			return getRuleContext(NamedElementContext.class,0);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode INNER() { return getToken(DictationParserParser.INNER, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public ImplementsVarsContext implementsVars() {
			return getRuleContext(ImplementsVarsContext.class,0);
		}
		public ExtendsVarsContext extendsVars() {
			return getRuleContext(ExtendsVarsContext.class,0);
		}
		public CreateDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateDataType(this);
		}
	}

	public final CreateDataTypeContext createDataType() throws RecognitionException {
		CreateDataTypeContext _localctx = new CreateDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ABSTRACT - 74)) | (1L << (PRIVATE - 74)) | (1L << (PROTECTED - 74)) | (1L << (PUBLIC - 74)) | (1L << (STATIC - 74)))) != 0)) {
				{
				setState(180);
				modifier();
				}
			}

			setState(184);
			_la = _input.LA(1);
			if (_la==INNER) {
				{
				setState(183);
				match(INNER);
				}
			}

			setState(186);
			dataType();
			setState(187);
			namedElement();
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(190);
				switch (_input.LA(1)) {
				case IMPLEMENTS:
				case THAT_IMPLEMENTS:
				case IMPLEMENT:
					{
					setState(188);
					implementsVars();
					}
					break;
				case EXTENDS:
				case EXTEND:
				case THAT_EXTENDS:
					{
					setState(189);
					extendsVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				match(Element);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateBlockContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(DictationParserParser.BLOCK, 0); }
		public CreateBlockStatementContext createBlockStatement() {
			return getRuleContext(CreateBlockStatementContext.class,0);
		}
		public CreateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateBlock(this);
		}
	}

	public final CreateBlockContext createBlock() throws RecognitionException {
		CreateBlockContext _localctx = new CreateBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createBlock);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case BLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(BLOCK);
				}
				break;
			case FIELD:
			case NEW:
			case OPEN_PARENTHESES:
			case ASSIGN:
			case PLUS:
			case MATH_PLUS:
			case MINUS:
			case MATH_MINUS:
			case IF:
			case CLASS:
			case CONST:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case STATIC:
			case THROW:
			case TRY:
			case RETURN:
			case SWITCH:
			case CONTINUE:
			case BREAK:
			case CASE:
			case IN_CASE:
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case Number:
			case Element:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				createBlockStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateBlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CreateBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateBlockStatement(this);
		}
	}

	public final CreateBlockStatementContext createBlockStatement() throws RecognitionException {
		CreateBlockStatementContext _localctx = new CreateBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createBlockStatement);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLoopContext extends ParserRuleContext {
		public CreateForEachLoopContext createForEachLoop() {
			return getRuleContext(CreateForEachLoopContext.class,0);
		}
		public CreateWhileLoopContext createWhileLoop() {
			return getRuleContext(CreateWhileLoopContext.class,0);
		}
		public CreateDoWhileLoopContext createDoWhileLoop() {
			return getRuleContext(CreateDoWhileLoopContext.class,0);
		}
		public CreateForLoopContext createForLoop() {
			return getRuleContext(CreateForLoopContext.class,0);
		}
		public CreateLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateLoop(this);
		}
	}

	public final CreateLoopContext createLoop() throws RecognitionException {
		CreateLoopContext _localctx = new CreateLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createLoop);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case FOR_EACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				createForEachLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				createWhileLoop();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				createDoWhileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				createForLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateForEachLoopContext extends ParserRuleContext {
		public TerminalNode FOR_EACH() { return getToken(DictationParserParser.FOR_EACH, 0); }
		public List<TerminalNode> Element() { return getTokens(DictationParserParser.Element); }
		public TerminalNode Element(int i) {
			return getToken(DictationParserParser.Element, i);
		}
		public TerminalNode IN() { return getToken(DictationParserParser.IN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CreateForEachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createForEachLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateForEachLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateForEachLoop(this);
		}
	}

	public final CreateForEachLoopContext createForEachLoop() throws RecognitionException {
		CreateForEachLoopContext _localctx = new CreateForEachLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createForEachLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FOR_EACH);
			setState(211);
			match(Element);
			setState(212);
			match(IN);
			setState(213);
			match(Element);
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(214);
				command();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateWhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DictationParserParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(DictationParserParser.DO, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CreateWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateWhileLoop(this);
		}
	}

	public final CreateWhileLoopContext createWhileLoop() throws RecognitionException {
		CreateWhileLoopContext _localctx = new CreateWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(WHILE);
			setState(218);
			expression(0);
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(219);
				match(DO);
				}
				break;
			}
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222);
				command();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDoWhileLoopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(DictationParserParser.DO, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DictationParserParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CreateDoWhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDoWhileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateDoWhileLoop(this);
		}
	}

	public final CreateDoWhileLoopContext createDoWhileLoop() throws RecognitionException {
		CreateDoWhileLoopContext _localctx = new CreateDoWhileLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createDoWhileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DO);
			setState(226);
			command();
			setState(227);
			match(WHILE);
			setState(228);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DictationParserParser.FOR, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public TerminalNode FROM() { return getToken(DictationParserParser.FROM, 0); }
		public TerminalNode TO() { return getToken(DictationParserParser.TO, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<ElementsElementContext> elementsElement() {
			return getRuleContexts(ElementsElementContext.class);
		}
		public ElementsElementContext elementsElement(int i) {
			return getRuleContext(ElementsElementContext.class,i);
		}
		public CreateForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCreateForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCreateForLoop(this);
		}
	}

	public final CreateForLoopContext createForLoop() throws RecognitionException {
		CreateForLoopContext _localctx = new CreateForLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_createForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FOR);
			setState(231);
			match(Element);
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(232);
				match(FROM);
				setState(235);
				switch (_input.LA(1)) {
				case ZERO:
				case ONE:
				case TWO:
				case THREE:
				case FOUR:
				case FIVE:
				case SIX:
				case SEVEN:
				case EIGHT:
				case NINE:
				case Number:
					{
					setState(233);
					number();
					}
					break;
				case FIELD:
				case CLASS:
				case ENUM:
				case INTERFACE:
				case Element:
					{
					setState(234);
					elementsElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(239);
				match(TO);
				setState(242);
				switch (_input.LA(1)) {
				case ZERO:
				case ONE:
				case TWO:
				case THREE:
				case FOUR:
				case FIVE:
				case SIX:
				case SEVEN:
				case EIGHT:
				case NINE:
				case Number:
					{
					setState(240);
					number();
					}
					break;
				case FIELD:
				case CLASS:
				case ENUM:
				case INTERFACE:
				case Element:
					{
					setState(241);
					elementsElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(246);
				command();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationCommandContext extends ParserRuleContext {
		public NavigationVerbContext navigationVerb() {
			return getRuleContext(NavigationVerbContext.class,0);
		}
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode FIELD() { return getToken(DictationParserParser.FIELD, 0); }
		public TerminalNode METHOD() { return getToken(DictationParserParser.METHOD, 0); }
		public ExitCommandContext exitCommand() {
			return getRuleContext(ExitCommandContext.class,0);
		}
		public NavigationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterNavigationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitNavigationCommand(this);
		}
	}

	public final NavigationCommandContext navigationCommand() throws RecognitionException {
		NavigationCommandContext _localctx = new NavigationCommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_navigationCommand);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case GO_TO:
			case WE_ARE_DONE_WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				navigationVerb();
				setState(253);
				switch (_input.LA(1)) {
				case CLASS:
				case ENUM:
				case INTERFACE:
					{
					setState(250);
					dataType();
					}
					break;
				case FIELD:
					{
					setState(251);
					match(FIELD);
					}
					break;
				case METHOD:
					{
					setState(252);
					match(METHOD);
					}
					break;
				case Element:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255);
				match(Element);
				}
				break;
			case EXIT:
			case QUIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				exitCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationVerbContext extends ParserRuleContext {
		public TerminalNode GO_TO() { return getToken(DictationParserParser.GO_TO, 0); }
		public TerminalNode WE_ARE_DONE_WITH() { return getToken(DictationParserParser.WE_ARE_DONE_WITH, 0); }
		public NavigationVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterNavigationVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitNavigationVerb(this);
		}
	}

	public final NavigationVerbContext navigationVerb() throws RecognitionException {
		NavigationVerbContext _localctx = new NavigationVerbContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_navigationVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==GO_TO || _la==WE_ARE_DONE_WITH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitCommandContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(DictationParserParser.EXIT, 0); }
		public TerminalNode QUIT() { return getToken(DictationParserParser.QUIT, 0); }
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode FIELD() { return getToken(DictationParserParser.FIELD, 0); }
		public TerminalNode METHOD() { return getToken(DictationParserParser.METHOD, 0); }
		public ExitCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterExitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitExitCommand(this);
		}
	}

	public final ExitCommandContext exitCommand() throws RecognitionException {
		ExitCommandContext _localctx = new ExitCommandContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exitCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==EXIT || _la==QUIT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(263);
				elementsElement();
				}
				break;
			case 2:
				{
				setState(267);
				switch (_input.LA(1)) {
				case CLASS:
				case ENUM:
				case INTERFACE:
					{
					setState(264);
					dataType();
					}
					break;
				case FIELD:
					{
					setState(265);
					match(FIELD);
					}
					break;
				case METHOD:
					{
					setState(266);
					match(METHOD);
					}
					break;
				case Element:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269);
				match(Element);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode WE_ARE_DONE_WITH() { return getToken(DictationParserParser.WE_ARE_DONE_WITH, 0); }
		public TerminalNode EXIT() { return getToken(DictationParserParser.EXIT, 0); }
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==EXIT || _la==WE_ARE_DONE_WITH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModificationCommandContext extends ParserRuleContext {
		public ModifyAccessLevelContext modifyAccessLevel() {
			return getRuleContext(ModifyAccessLevelContext.class,0);
		}
		public ModificationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificationCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterModificationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitModificationCommand(this);
		}
	}

	public final ModificationCommandContext modificationCommand() throws RecognitionException {
		ModificationCommandContext _localctx = new ModificationCommandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modificationCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			modifyAccessLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyAccessLevelContext extends ParserRuleContext {
		public ModificationVerbContext modificationVerb() {
			return getRuleContext(ModificationVerbContext.class,0);
		}
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public ModifyAccessLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyAccessLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterModifyAccessLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitModifyAccessLevel(this);
		}
	}

	public final ModifyAccessLevelContext modifyAccessLevel() throws RecognitionException {
		ModifyAccessLevelContext _localctx = new ModifyAccessLevelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifyAccessLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			modificationVerb();
			setState(277);
			accessLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModificationVerbContext extends ParserRuleContext {
		public TerminalNode MAKE_IT() { return getToken(DictationParserParser.MAKE_IT, 0); }
		public TerminalNode CHANGE_IT() { return getToken(DictationParserParser.CHANGE_IT, 0); }
		public ModificationVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificationVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterModificationVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitModificationVerb(this);
		}
	}

	public final ModificationVerbContext modificationVerb() throws RecognitionException {
		ModificationVerbContext _localctx = new ModificationVerbContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modificationVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==MAKE_IT || _la==CHANGE_IT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionCommandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DictationParserParser.NUMBER, 0); }
		public TerminalNode OPTION() { return getToken(DictationParserParser.OPTION, 0); }
		public SelectionCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterSelectionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitSelectionCommand(this);
		}
	}

	public final SelectionCommandContext selectionCommand() throws RecognitionException {
		SelectionCommandContext _localctx = new SelectionCommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectionCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==OPTION) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==OPTION) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(284);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeletionCommandContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DictationParserParser.DELETE, 0); }
		public TerminalNode REMOVE() { return getToken(DictationParserParser.REMOVE, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public DeletionCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletionCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterDeletionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitDeletionCommand(this);
		}
	}

	public final DeletionCommandContext deletionCommand() throws RecognitionException {
		DeletionCommandContext _localctx = new DeletionCommandContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deletionCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(289);
			switch (_input.LA(1)) {
			case LINE:
				{
				setState(287);
				line();
				}
				break;
			case FIELD:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case Element:
				{
				setState(288);
				elementsElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationCommandContext extends ParserRuleContext {
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public TerminalNode CALL() { return getToken(DictationParserParser.CALL, 0); }
		public InvocationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocationCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterInvocationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitInvocationCommand(this);
		}
	}

	public final InvocationCommandContext invocationCommand() throws RecognitionException {
		InvocationCommandContext _localctx = new InvocationCommandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_invocationCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if (_la==CALL) {
				{
				setState(291);
				match(CALL);
				}
			}

			setState(294);
			elementsElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public TerminalNode TRANSIENT() { return getToken(DictationParserParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(DictationParserParser.VOLATILE, 0); }
		public TerminalNode FINAL() { return getToken(DictationParserParser.FINAL, 0); }
		public TerminalNode CONST() { return getToken(DictationParserParser.CONST, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if (_la==CONST || _la==FINAL) {
				{
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==FINAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(299);
			modifier();
			setState(301);
			_la = _input.LA(1);
			if (_la==TRANSIENT) {
				{
				setState(300);
				match(TRANSIENT);
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==VOLATILE) {
				{
				setState(303);
				match(VOLATILE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(DictationParserParser.FINAL, 0); }
		public TerminalNode CONST() { return getToken(DictationParserParser.CONST, 0); }
		public TerminalNode STATIC() { return getToken(DictationParserParser.STATIC, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableModifier);
		int _la;
		try {
			setState(308);
			switch (_input.LA(1)) {
			case CONST:
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==FINAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(STATIC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AccessLevelContext accessLevel() {
			return getRuleContext(AccessLevelContext.class,0);
		}
		public TerminalNode ABSTRACT() { return getToken(DictationParserParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(DictationParserParser.STATIC, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(310);
				match(ABSTRACT);
				}
			}

			setState(314);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(313);
				match(STATIC);
				}
			}

			setState(316);
			accessLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(DictationParserParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(DictationParserParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(DictationParserParser.PROTECTED, 0); }
		public AccessLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterAccessLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitAccessLevel(this);
		}
	}

	public final AccessLevelContext accessLevel() throws RecognitionException {
		AccessLevelContext _localctx = new AccessLevelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_accessLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (PRIVATE - 91)) | (1L << (PROTECTED - 91)) | (1L << (PUBLIC - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public ElementsNameContext elementsName() {
			return getRuleContext(ElementsNameContext.class,0);
		}
		public TerminalNode OF_TYPE() { return getToken(DictationParserParser.OF_TYPE, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (CONST - 78)) | (1L << (FINAL - 78)) | (1L << (STATIC - 78)))) != 0)) {
				{
				{
				setState(320);
				variableModifier();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			elementsName();
			setState(327);
			match(OF_TYPE);
			setState(328);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DictationParserParser.RETURN, 0); }
		public TerminalNode TRY() { return getToken(DictationParserParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(DictationParserParser.CATCH, 0); }
		public TerminalNode FINALLY() { return getToken(DictationParserParser.FINALLY, 0); }
		public TerminalNode THROW() { return getToken(DictationParserParser.THROW, 0); }
		public TerminalNode SWITCH() { return getToken(DictationParserParser.SWITCH, 0); }
		public TerminalNode BREAK() { return getToken(DictationParserParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DictationParserParser.CONTINUE, 0); }
		public CaseVarsContext caseVars() {
			return getRuleContext(CaseVarsContext.class,0);
		}
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case FIELD:
			case NEW:
			case OPEN_PARENTHESES:
			case ASSIGN:
			case PLUS:
			case MATH_PLUS:
			case MINUS:
			case MATH_MINUS:
			case IF:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case Number:
			case Element:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				expression(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(RETURN);
				setState(333);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(332);
					expression(0);
					}
					break;
				}
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(TRY);
				setState(337);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(336);
					match(CATCH);
					}
					break;
				}
				setState(340);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(339);
					match(FINALLY);
					}
					break;
				}
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(THROW);
				setState(343);
				expression(0);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(SWITCH);
				setState(346);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(345);
					expression(0);
					}
					break;
				}
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				match(CONTINUE);
				}
				break;
			case CASE:
			case IN_CASE:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				caseVars();
				setState(351);
				elementsElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PlusVarsContext> plusVars() {
			return getRuleContexts(PlusVarsContext.class);
		}
		public PlusVarsContext plusVars(int i) {
			return getRuleContext(PlusVarsContext.class,i);
		}
		public List<MinusVarsContext> minusVars() {
			return getRuleContexts(MinusVarsContext.class);
		}
		public MinusVarsContext minusVars(int i) {
			return getRuleContext(MinusVarsContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode IF() { return getToken(DictationParserParser.IF, 0); }
		public TerminalNode THEN() { return getToken(DictationParserParser.THEN, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DictationParserParser.ELSE, 0); }
		public List<TerminalNode> AND() { return getTokens(DictationParserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DictationParserParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(DictationParserParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(DictationParserParser.OR, i);
		}
		public TerminalNode NEW() { return getToken(DictationParserParser.NEW, 0); }
		public ElementRefContext elementRef() {
			return getRuleContext(ElementRefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DictationParserParser.ASSIGN, 0); }
		public TerminalNode TO() { return getToken(DictationParserParser.TO, 0); }
		public EqualsVarsContext equalsVars() {
			return getRuleContext(EqualsVarsContext.class,0);
		}
		public IsDifferentVarsContext isDifferentVars() {
			return getRuleContext(IsDifferentVarsContext.class,0);
		}
		public LessThanEqualsVarsContext lessThanEqualsVars() {
			return getRuleContext(LessThanEqualsVarsContext.class,0);
		}
		public GreaterThanEqualVarsContext greaterThanEqualVars() {
			return getRuleContext(GreaterThanEqualVarsContext.class,0);
		}
		public GreaterThanVarsContext greaterThanVars() {
			return getRuleContext(GreaterThanVarsContext.class,0);
		}
		public LessThanVarsContext lessThanVars() {
			return getRuleContext(LessThanVarsContext.class,0);
		}
		public TerminalNode IS_NOT() { return getToken(DictationParserParser.IS_NOT, 0); }
		public TerminalNode IS() { return getToken(DictationParserParser.IS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			switch (_input.LA(1)) {
			case PLUS:
			case MATH_PLUS:
			case MINUS:
			case MATH_MINUS:
				{
				setState(364);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(356);
					plusVars();
					}
					break;
				case 2:
					{
					setState(357);
					minusVars();
					}
					break;
				case 3:
					{
					setState(358);
					plusVars();
					setState(359);
					plusVars();
					}
					break;
				case 4:
					{
					setState(361);
					minusVars();
					setState(362);
					minusVars();
					}
					break;
				}
				setState(366);
				expression(5);
				}
				break;
			case FIELD:
			case OPEN_PARENTHESES:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case Number:
			case Element:
				{
				setState(368);
				primary();
				}
				break;
			case IF:
				{
				setState(369);
				match(IF);
				setState(370);
				expression(0);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(371);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(372);
					expression(0);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(THEN);
				setState(379);
				command();
				setState(382);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(380);
					match(ELSE);
					setState(381);
					command();
					}
					break;
				}
				}
				break;
			case NEW:
				{
				setState(384);
				match(NEW);
				setState(387);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(385);
					expression(0);
					}
					break;
				case 2:
					{
					setState(386);
					elementRef();
					}
					break;
				}
				}
				break;
			case ASSIGN:
				{
				setState(389);
				match(ASSIGN);
				setState(390);
				expression(0);
				setState(391);
				match(TO);
				setState(392);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(429);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(396);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(405);
						switch (_input.LA(1)) {
						case IS_EQUAL_TO:
						case EQUAL_TO:
						case EQUALS_TO:
						case EQUALS:
						case IS_EQUALS:
							{
							setState(397);
							equalsVars();
							}
							break;
						case IS_DIFFERENT_FROM:
						case DIFFERENT_FROM:
							{
							setState(398);
							isDifferentVars();
							}
							break;
						case IS_LESS_THAN_EQUAL:
						case IS_LESS_THAN_EQUALS:
						case LESS_THAN_EQUAL:
						case LESS_THAN_EQUALS:
						case LESS_THAN_EQUAL_MATH:
						case LESS_THAN_EQUAL_MATH_SPACE:
							{
							setState(399);
							lessThanEqualsVars();
							}
							break;
						case GREATER_THAN_EQUAL:
						case GREATER_THAN_EQUAL_MATH:
						case GREATER_THAN_EQUAL_MATH_SPACE:
							{
							setState(400);
							greaterThanEqualVars();
							}
							break;
						case GREATER_THAN:
						case GREATER_THAN_MATH:
						case IS_GREATER_THAN:
							{
							setState(401);
							greaterThanVars();
							}
							break;
						case LESS_THAN:
						case LESS_THAN_MATH:
						case IS_LESS_THAN:
							{
							setState(402);
							lessThanVars();
							}
							break;
						case IS_NOT:
							{
							setState(403);
							match(IS_NOT);
							}
							break;
						case IS:
							{
							setState(404);
							match(IS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(407);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(417);
						switch (_input.LA(1)) {
						case IS_EQUAL_TO:
						case EQUAL_TO:
						case EQUALS_TO:
						case EQUALS:
						case IS_EQUALS:
							{
							setState(409);
							equalsVars();
							}
							break;
						case IS_DIFFERENT_FROM:
						case DIFFERENT_FROM:
							{
							setState(410);
							isDifferentVars();
							}
							break;
						case IS_LESS_THAN_EQUAL:
						case IS_LESS_THAN_EQUALS:
						case LESS_THAN_EQUAL:
						case LESS_THAN_EQUALS:
						case LESS_THAN_EQUAL_MATH:
						case LESS_THAN_EQUAL_MATH_SPACE:
							{
							setState(411);
							lessThanEqualsVars();
							}
							break;
						case GREATER_THAN_EQUAL:
						case GREATER_THAN_EQUAL_MATH:
						case GREATER_THAN_EQUAL_MATH_SPACE:
							{
							setState(412);
							greaterThanEqualVars();
							}
							break;
						case GREATER_THAN:
						case GREATER_THAN_MATH:
						case IS_GREATER_THAN:
							{
							setState(413);
							greaterThanVars();
							}
							break;
						case LESS_THAN:
						case LESS_THAN_MATH:
						case IS_LESS_THAN:
							{
							setState(414);
							lessThanVars();
							}
							break;
						case IS_NOT:
							{
							setState(415);
							match(IS_NOT);
							}
							break;
						case IS:
							{
							setState(416);
							match(IS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(419);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(427);
						switch (_input.LA(1)) {
						case PLUS:
						case MATH_PLUS:
							{
							setState(421);
							plusVars();
							setState(422);
							plusVars();
							}
							break;
						case MINUS:
						case MATH_MINUS:
							{
							setState(424);
							minusVars();
							setState(425);
							minusVars();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(DictationParserParser.OPEN_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primary);
		try {
			setState(440);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(OPEN_PARENTHESES);
				setState(436);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(435);
					expression(0);
					}
					break;
				}
				}
				break;
			case FIELD:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case Element:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				elementsElement();
				}
				break;
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsElementContext extends ParserRuleContext {
		public List<ElementRefContext> elementRef() {
			return getRuleContexts(ElementRefContext.class);
		}
		public ElementRefContext elementRef(int i) {
			return getRuleContext(ElementRefContext.class,i);
		}
		public PeriodVarsContext periodVars() {
			return getRuleContext(PeriodVarsContext.class,0);
		}
		public ElementsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementsElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterElementsElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitElementsElement(this);
		}
	}

	public final ElementsElementContext elementsElement() throws RecognitionException {
		ElementsElementContext _localctx = new ElementsElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_elementsElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(442);
				elementRef();
				setState(443);
				periodVars();
				}
				break;
			}
			setState(447);
			elementRef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementLocationContext extends ParserRuleContext {
		public LocationRefContext locationRef() {
			return getRuleContext(LocationRefContext.class,0);
		}
		public ElementRefContext elementRef() {
			return getRuleContext(ElementRefContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ElementLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterElementLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitElementLocation(this);
		}
	}

	public final ElementLocationContext elementLocation() throws RecognitionException {
		ElementLocationContext _localctx = new ElementLocationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elementLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			locationRef();
			setState(452);
			switch (_input.LA(1)) {
			case FIELD:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case Element:
				{
				setState(450);
				elementRef();
				}
				break;
			case LINE:
				{
				setState(451);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldRefContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(DictationParserParser.FIELD, 0); }
		public TerminalNode OF_TYPE() { return getToken(DictationParserParser.OF_TYPE, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public NamedElementContext namedElement() {
			return getRuleContext(NamedElementContext.class,0);
		}
		public ElementsNameContext elementsName() {
			return getRuleContext(ElementsNameContext.class,0);
		}
		public FieldRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterFieldRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitFieldRef(this);
		}
	}

	public final FieldRefContext fieldRef() throws RecognitionException {
		FieldRefContext _localctx = new FieldRefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fieldRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(FIELD);
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(456);
				_la = _input.LA(1);
				if (_la==Element) {
					{
					setState(455);
					elementsName();
					}
				}

				setState(458);
				match(OF_TYPE);
				setState(459);
				match(Element);
				}
				break;
			case 2:
				{
				setState(460);
				match(OF_TYPE);
				setState(461);
				match(Element);
				setState(462);
				namedElement();
				}
				break;
			case 3:
				{
				setState(463);
				elementsName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementRefContext extends ParserRuleContext {
		public ClassRefContext classRef() {
			return getRuleContext(ClassRefContext.class,0);
		}
		public FieldRefContext fieldRef() {
			return getRuleContext(FieldRefContext.class,0);
		}
		public EnumRefContext enumRef() {
			return getRuleContext(EnumRefContext.class,0);
		}
		public InterfaceRefContext interfaceRef() {
			return getRuleContext(InterfaceRefContext.class,0);
		}
		public UnspecifiedRefContext unspecifiedRef() {
			return getRuleContext(UnspecifiedRefContext.class,0);
		}
		public ElementRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterElementRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitElementRef(this);
		}
	}

	public final ElementRefContext elementRef() throws RecognitionException {
		ElementRefContext _localctx = new ElementRefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elementRef);
		try {
			setState(471);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				classRef();
				}
				break;
			case FIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				fieldRef();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				enumRef();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				interfaceRef();
				}
				break;
			case Element:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				unspecifiedRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DictationParserParser.CLASS, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public ClassRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterClassRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitClassRef(this);
		}
	}

	public final ClassRefContext classRef() throws RecognitionException {
		ClassRefContext _localctx = new ClassRefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(CLASS);
			setState(474);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedElementContext extends ParserRuleContext {
		public ElementsNameContext elementsName() {
			return getRuleContext(ElementsNameContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public NamedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterNamedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitNamedElement(this);
		}
	}

	public final NamedElementContext namedElement() throws RecognitionException {
		NamedElementContext _localctx = new NamedElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_namedElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if (_la==NAMED || _la==CALLED) {
				{
				setState(476);
				reference();
				}
			}

			setState(479);
			elementsName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsNameContext extends ParserRuleContext {
		public List<TerminalNode> Element() { return getTokens(DictationParserParser.Element); }
		public TerminalNode Element(int i) {
			return getToken(DictationParserParser.Element, i);
		}
		public List<TerminalNode> AND() { return getTokens(DictationParserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DictationParserParser.AND, i);
		}
		public ElementsNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementsName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterElementsName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitElementsName(this);
		}
	}

	public final ElementsNameContext elementsName() throws RecognitionException {
		ElementsNameContext _localctx = new ElementsNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elementsName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(481);
					match(Element);
					setState(482);
					match(AND);
					}
					} 
				}
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(488);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumRefContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(DictationParserParser.ENUM, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public EnumRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterEnumRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitEnumRef(this);
		}
	}

	public final EnumRefContext enumRef() throws RecognitionException {
		EnumRefContext _localctx = new EnumRefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ENUM);
			setState(491);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceRefContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(DictationParserParser.INTERFACE, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public InterfaceRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterInterfaceRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitInterfaceRef(this);
		}
	}

	public final InterfaceRefContext interfaceRef() throws RecognitionException {
		InterfaceRefContext _localctx = new InterfaceRefContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(INTERFACE);
			setState(494);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnspecifiedRefContext extends ParserRuleContext {
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public UnspecifiedRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unspecifiedRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterUnspecifiedRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitUnspecifiedRef(this);
		}
	}

	public final UnspecifiedRefContext unspecifiedRef() throws RecognitionException {
		UnspecifiedRefContext _localctx = new UnspecifiedRefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unspecifiedRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(Element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode NAMED() { return getToken(DictationParserParser.NAMED, 0); }
		public TerminalNode CALLED() { return getToken(DictationParserParser.CALLED, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==NAMED || _la==CALLED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationRefContext extends ParserRuleContext {
		public TerminalNode INSIDE() { return getToken(DictationParserParser.INSIDE, 0); }
		public TerminalNode IN() { return getToken(DictationParserParser.IN, 0); }
		public TerminalNode AFTER() { return getToken(DictationParserParser.AFTER, 0); }
		public TerminalNode BEFORE() { return getToken(DictationParserParser.BEFORE, 0); }
		public TerminalNode ABOVE() { return getToken(DictationParserParser.ABOVE, 0); }
		public TerminalNode BELOW() { return getToken(DictationParserParser.BELOW, 0); }
		public LocationRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterLocationRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitLocationRef(this);
		}
	}

	public final LocationRefContext locationRef() throws RecognitionException {
		LocationRefContext _localctx = new LocationRefContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_locationRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSIDE) | (1L << IN) | (1L << AFTER) | (1L << BEFORE) | (1L << ABOVE) | (1L << BELOW))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(DictationParserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DictationParserParser.AND, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parametersList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					parameter();
					setState(503);
					match(AND);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(510);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ElementsElementContext elementsElement() {
			return getRuleContext(ElementsElementContext.class,0);
		}
		public TerminalNode OF_TYPE() { return getToken(DictationParserParser.OF_TYPE, 0); }
		public TerminalNode Element() { return getToken(DictationParserParser.Element, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			elementsElement();
			setState(515);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(513);
				match(OF_TYPE);
				setState(514);
				match(Element);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DictationParserParser.CLASS, 0); }
		public TerminalNode ENUM() { return getToken(DictationParserParser.ENUM, 0); }
		public TerminalNode INTERFACE() { return getToken(DictationParserParser.INTERFACE, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (CLASS - 77)) | (1L << (ENUM - 77)) | (1L << (INTERFACE - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(DictationParserParser.LINE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DictationParserParser.NUMBER, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(LINE);
			setState(521);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(520);
				match(NUMBER);
				}
			}

			setState(523);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(DictationParserParser.Number, 0); }
		public TerminalNode ZERO() { return getToken(DictationParserParser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(DictationParserParser.ONE, 0); }
		public TerminalNode TWO() { return getToken(DictationParserParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(DictationParserParser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(DictationParserParser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(DictationParserParser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(DictationParserParser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(DictationParserParser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(DictationParserParser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(DictationParserParser.NINE, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & ((1L << (ZERO - 121)) | (1L << (ONE - 121)) | (1L << (TWO - 121)) | (1L << (THREE - 121)) | (1L << (FOUR - 121)) | (1L << (FIVE - 121)) | (1L << (SIX - 121)) | (1L << (SEVEN - 121)) | (1L << (EIGHT - 121)) | (1L << (NINE - 121)) | (1L << (Number - 121)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnsVarsContext extends ParserRuleContext {
		public TerminalNode THAT_RETURNS() { return getToken(DictationParserParser.THAT_RETURNS, 0); }
		public TerminalNode RETURNS() { return getToken(DictationParserParser.RETURNS, 0); }
		public TerminalNode RETURN() { return getToken(DictationParserParser.RETURN, 0); }
		public ReturnsVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterReturnsVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitReturnsVars(this);
		}
	}

	public final ReturnsVarsContext returnsVars() throws RecognitionException {
		ReturnsVarsContext _localctx = new ReturnsVarsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_returnsVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (THAT_RETURNS - 105)) | (1L << (RETURNS - 105)) | (1L << (RETURN - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementsVarsContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(DictationParserParser.IMPLEMENTS, 0); }
		public TerminalNode IMPLEMENT() { return getToken(DictationParserParser.IMPLEMENT, 0); }
		public TerminalNode THAT_IMPLEMENTS() { return getToken(DictationParserParser.THAT_IMPLEMENTS, 0); }
		public ImplementsVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterImplementsVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitImplementsVars(this);
		}
	}

	public final ImplementsVarsContext implementsVars() throws RecognitionException {
		ImplementsVarsContext _localctx = new ImplementsVarsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_implementsVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (IMPLEMENTS - 87)) | (1L << (THAT_IMPLEMENTS - 87)) | (1L << (IMPLEMENT - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsVarsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(DictationParserParser.EXTENDS, 0); }
		public TerminalNode EXTEND() { return getToken(DictationParserParser.EXTEND, 0); }
		public TerminalNode THAT_EXTENDS() { return getToken(DictationParserParser.THAT_EXTENDS, 0); }
		public ExtendsVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterExtendsVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitExtendsVars(this);
		}
	}

	public final ExtendsVarsContext extendsVars() throws RecognitionException {
		ExtendsVarsContext _localctx = new ExtendsVarsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_extendsVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EXTENDS - 82)) | (1L << (EXTEND - 82)) | (1L << (THAT_EXTENDS - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusVarsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DictationParserParser.PLUS, 0); }
		public TerminalNode MATH_PLUS() { return getToken(DictationParserParser.MATH_PLUS, 0); }
		public PlusVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterPlusVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitPlusVars(this);
		}
	}

	public final PlusVarsContext plusVars() throws RecognitionException {
		PlusVarsContext _localctx = new PlusVarsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_plusVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MATH_PLUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinusVarsContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(DictationParserParser.MINUS, 0); }
		public TerminalNode MATH_MINUS() { return getToken(DictationParserParser.MATH_MINUS, 0); }
		public MinusVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterMinusVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitMinusVars(this);
		}
	}

	public final MinusVarsContext minusVars() throws RecognitionException {
		MinusVarsContext _localctx = new MinusVarsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_minusVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==MATH_MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsVarsContext extends ParserRuleContext {
		public TerminalNode IS_EQUAL_TO() { return getToken(DictationParserParser.IS_EQUAL_TO, 0); }
		public TerminalNode EQUAL_TO() { return getToken(DictationParserParser.EQUAL_TO, 0); }
		public TerminalNode EQUALS_TO() { return getToken(DictationParserParser.EQUALS_TO, 0); }
		public TerminalNode EQUALS() { return getToken(DictationParserParser.EQUALS, 0); }
		public TerminalNode IS_EQUALS() { return getToken(DictationParserParser.IS_EQUALS, 0); }
		public EqualsVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterEqualsVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitEqualsVars(this);
		}
	}

	public final EqualsVarsContext equalsVars() throws RecognitionException {
		EqualsVarsContext _localctx = new EqualsVarsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_equalsVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS_EQUAL_TO) | (1L << EQUAL_TO) | (1L << EQUALS_TO) | (1L << EQUALS) | (1L << IS_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsDifferentVarsContext extends ParserRuleContext {
		public TerminalNode IS_DIFFERENT_FROM() { return getToken(DictationParserParser.IS_DIFFERENT_FROM, 0); }
		public TerminalNode DIFFERENT_FROM() { return getToken(DictationParserParser.DIFFERENT_FROM, 0); }
		public IsDifferentVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isDifferentVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterIsDifferentVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitIsDifferentVars(this);
		}
	}

	public final IsDifferentVarsContext isDifferentVars() throws RecognitionException {
		IsDifferentVarsContext _localctx = new IsDifferentVarsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_isDifferentVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !(_la==IS_DIFFERENT_FROM || _la==DIFFERENT_FROM) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanVarsContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(DictationParserParser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_MATH() { return getToken(DictationParserParser.LESS_THAN_MATH, 0); }
		public TerminalNode IS_LESS_THAN() { return getToken(DictationParserParser.IS_LESS_THAN, 0); }
		public LessThanVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterLessThanVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitLessThanVars(this);
		}
	}

	public final LessThanVarsContext lessThanVars() throws RecognitionException {
		LessThanVarsContext _localctx = new LessThanVarsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lessThanVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << LESS_THAN_MATH) | (1L << IS_LESS_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LessThanEqualsVarsContext extends ParserRuleContext {
		public TerminalNode IS_LESS_THAN_EQUALS() { return getToken(DictationParserParser.IS_LESS_THAN_EQUALS, 0); }
		public TerminalNode IS_LESS_THAN_EQUAL() { return getToken(DictationParserParser.IS_LESS_THAN_EQUAL, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(DictationParserParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(DictationParserParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode LESS_THAN_EQUAL_MATH() { return getToken(DictationParserParser.LESS_THAN_EQUAL_MATH, 0); }
		public TerminalNode LESS_THAN_EQUAL_MATH_SPACE() { return getToken(DictationParserParser.LESS_THAN_EQUAL_MATH_SPACE, 0); }
		public LessThanEqualsVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanEqualsVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterLessThanEqualsVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitLessThanEqualsVars(this);
		}
	}

	public final LessThanEqualsVarsContext lessThanEqualsVars() throws RecognitionException {
		LessThanEqualsVarsContext _localctx = new LessThanEqualsVarsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lessThanEqualsVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (IS_LESS_THAN_EQUAL - 60)) | (1L << (IS_LESS_THAN_EQUALS - 60)) | (1L << (LESS_THAN_EQUAL - 60)) | (1L << (LESS_THAN_EQUALS - 60)) | (1L << (LESS_THAN_EQUAL_MATH - 60)) | (1L << (LESS_THAN_EQUAL_MATH_SPACE - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterThanVarsContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN() { return getToken(DictationParserParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_MATH() { return getToken(DictationParserParser.GREATER_THAN_MATH, 0); }
		public TerminalNode IS_GREATER_THAN() { return getToken(DictationParserParser.IS_GREATER_THAN, 0); }
		public GreaterThanVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterGreaterThanVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitGreaterThanVars(this);
		}
	}

	public final GreaterThanVarsContext greaterThanVars() throws RecognitionException {
		GreaterThanVarsContext _localctx = new GreaterThanVarsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_greaterThanVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GREATER_THAN - 66)) | (1L << (GREATER_THAN_MATH - 66)) | (1L << (IS_GREATER_THAN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterThanEqualVarsContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(DictationParserParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN_EQUAL_MATH() { return getToken(DictationParserParser.GREATER_THAN_EQUAL_MATH, 0); }
		public TerminalNode GREATER_THAN_EQUAL_MATH_SPACE() { return getToken(DictationParserParser.GREATER_THAN_EQUAL_MATH_SPACE, 0); }
		public GreaterThanEqualVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanEqualVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterGreaterThanEqualVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitGreaterThanEqualVars(this);
		}
	}

	public final GreaterThanEqualVarsContext greaterThanEqualVars() throws RecognitionException {
		GreaterThanEqualVarsContext _localctx = new GreaterThanEqualVarsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_greaterThanEqualVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (GREATER_THAN_EQUAL - 69)) | (1L << (GREATER_THAN_EQUAL_MATH - 69)) | (1L << (GREATER_THAN_EQUAL_MATH_SPACE - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachVarsContext extends ParserRuleContext {
		public TerminalNode FOR_EACH() { return getToken(DictationParserParser.FOR_EACH, 0); }
		public TerminalNode FOR_EACH_SPACE() { return getToken(DictationParserParser.FOR_EACH_SPACE, 0); }
		public ForEachVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterForEachVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitForEachVars(this);
		}
	}

	public final ForEachVarsContext forEachVars() throws RecognitionException {
		ForEachVarsContext _localctx = new ForEachVarsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forEachVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if ( !(_la==FOR_EACH || _la==FOR_EACH_SPACE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseVarsContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(DictationParserParser.CASE, 0); }
		public TerminalNode IN_CASE() { return getToken(DictationParserParser.IN_CASE, 0); }
		public CaseVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterCaseVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitCaseVars(this);
		}
	}

	public final CaseVarsContext caseVars() throws RecognitionException {
		CaseVarsContext _localctx = new CaseVarsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_caseVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_la = _input.LA(1);
			if ( !(_la==CASE || _la==IN_CASE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PeriodVarsContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(DictationParserParser.PERIOD, 0); }
		public TerminalNode PERIOD_CHAR() { return getToken(DictationParserParser.PERIOD_CHAR, 0); }
		public PeriodVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).enterPeriodVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictationParserListener ) ((DictationParserListener)listener).exitPeriodVars(this);
		}
	}

	public final PeriodVarsContext periodVars() throws RecognitionException {
		PeriodVarsContext _localctx = new PeriodVarsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_periodVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==PERIOD || _la==PERIOD_CHAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0087\u022e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0087\n\2\3\3\5\3\u008a"+
		"\n\3\3\3\5\3\u008d\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0095\n\3\3\3\5\3\u0098"+
		"\n\3\3\4\3\4\3\5\5\5\u009d\n\5\3\5\3\5\3\6\5\6\u00a2\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00a8\n\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\7\5\7\u00b0\n\7\3\7\3\7\3"+
		"\7\5\7\u00b5\n\7\3\b\5\b\u00b8\n\b\3\b\5\b\u00bb\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00c1\n\b\3\b\3\b\5\b\u00c5\n\b\3\t\3\t\5\t\u00c9\n\t\3\n\3\n\5\n\u00cd"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00da"+
		"\n\f\3\r\3\r\3\r\5\r\u00df\n\r\3\r\5\r\u00e2\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ee\n\17\5\17\u00f0\n\17\3\17\3\17"+
		"\3\17\5\17\u00f5\n\17\5\17\u00f7\n\17\3\17\5\17\u00fa\n\17\3\20\3\20\3"+
		"\20\3\20\5\20\u0100\n\20\3\20\3\20\3\20\5\20\u0105\n\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u010e\n\22\3\22\5\22\u0111\n\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\5\27\u011d\n\27\3\27\3\27\3\30"+
		"\3\30\3\30\5\30\u0124\n\30\3\31\5\31\u0127\n\31\3\31\3\31\3\32\5\32\u012c"+
		"\n\32\3\32\3\32\5\32\u0130\n\32\3\32\5\32\u0133\n\32\3\33\3\33\5\33\u0137"+
		"\n\33\3\34\5\34\u013a\n\34\3\34\5\34\u013d\n\34\3\34\3\34\3\35\3\35\3"+
		"\36\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\5\37\u0150\n\37\3\37\3\37\5\37\u0154\n\37\3\37\5\37\u0157\n\37"+
		"\3\37\3\37\3\37\3\37\5\37\u015d\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0164"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u016f\n \3 \3 \3 \3 \3 \3 \3 \7 \u0178"+
		"\n \f \16 \u017b\13 \3 \3 \3 \3 \5 \u0181\n \3 \3 \3 \5 \u0186\n \3 \3"+
		" \3 \3 \3 \5 \u018d\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0198\n \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u01a4\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ae\n"+
		" \7 \u01b0\n \f \16 \u01b3\13 \3!\3!\5!\u01b7\n!\3!\3!\5!\u01bb\n!\3\""+
		"\3\"\3\"\5\"\u01c0\n\"\3\"\3\"\3#\3#\3#\5#\u01c7\n#\3$\3$\5$\u01cb\n$"+
		"\3$\3$\3$\3$\3$\3$\5$\u01d3\n$\3%\3%\3%\3%\3%\5%\u01da\n%\3&\3&\3&\3\'"+
		"\5\'\u01e0\n\'\3\'\3\'\3(\3(\7(\u01e6\n(\f(\16(\u01e9\13(\3(\3(\3)\3)"+
		"\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\7.\u01fc\n.\f.\16.\u01ff\13.\3"+
		".\3.\3/\3/\3/\5/\u0206\n/\3\60\3\60\3\61\3\61\5\61\u020c\n\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\2\3>A\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\2!\3\2\26\27\4\2\20\20$%\3\2\3\4\3\2\30\31\4\2\36\36!!\3"+
		"\2\37 \4\2\37\37!!\3\2\"#\3\2\24\25\3\2+,\4\2PPWW\3\2]_\3\2\32\33\3\2"+
		"\21\22\3\2\b\r\5\2OOSS\\\\\4\2{\u0084\u0086\u0086\3\2km\3\2Y[\3\2TV\3"+
		"\2./\3\2\60\61\3\2\648\3\29:\3\2;=\3\2>C\3\2DF\3\2GI\3\2ij\3\2yz\3\2)"+
		"*\u025c\2\u0086\3\2\2\2\4\u0089\3\2\2\2\6\u0099\3\2\2\2\b\u009c\3\2\2"+
		"\2\n\u00a1\3\2\2\2\f\u00af\3\2\2\2\16\u00b7\3\2\2\2\20\u00c8\3\2\2\2\22"+
		"\u00cc\3\2\2\2\24\u00d2\3\2\2\2\26\u00d4\3\2\2\2\30\u00db\3\2\2\2\32\u00e3"+
		"\3\2\2\2\34\u00e8\3\2\2\2\36\u0104\3\2\2\2 \u0106\3\2\2\2\"\u0108\3\2"+
		"\2\2$\u0112\3\2\2\2&\u0114\3\2\2\2(\u0116\3\2\2\2*\u0119\3\2\2\2,\u011c"+
		"\3\2\2\2.\u0120\3\2\2\2\60\u0126\3\2\2\2\62\u012b\3\2\2\2\64\u0136\3\2"+
		"\2\2\66\u0139\3\2\2\28\u0140\3\2\2\2:\u0145\3\2\2\2<\u0163\3\2\2\2>\u018c"+
		"\3\2\2\2@\u01ba\3\2\2\2B\u01bf\3\2\2\2D\u01c3\3\2\2\2F\u01c8\3\2\2\2H"+
		"\u01d9\3\2\2\2J\u01db\3\2\2\2L\u01df\3\2\2\2N\u01e7\3\2\2\2P\u01ec\3\2"+
		"\2\2R\u01ef\3\2\2\2T\u01f2\3\2\2\2V\u01f4\3\2\2\2X\u01f6\3\2\2\2Z\u01fd"+
		"\3\2\2\2\\\u0202\3\2\2\2^\u0207\3\2\2\2`\u0209\3\2\2\2b\u020f\3\2\2\2"+
		"d\u0211\3\2\2\2f\u0213\3\2\2\2h\u0215\3\2\2\2j\u0217\3\2\2\2l\u0219\3"+
		"\2\2\2n\u021b\3\2\2\2p\u021d\3\2\2\2r\u021f\3\2\2\2t\u0221\3\2\2\2v\u0223"+
		"\3\2\2\2x\u0225\3\2\2\2z\u0227\3\2\2\2|\u0229\3\2\2\2~\u022b\3\2\2\2\u0080"+
		"\u0087\5\4\3\2\u0081\u0087\5\36\20\2\u0082\u0087\5,\27\2\u0083\u0087\5"+
		"&\24\2\u0084\u0087\5.\30\2\u0085\u0087\5\60\31\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\3\3\2\2\2\u0088\u008a\5\6\4\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\t\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\3\2\2\2\u008e\u0095\5\b"+
		"\5\2\u008f\u0095\5\n\6\2\u0090\u0095\5\f\7\2\u0091\u0095\5\16\b\2\u0092"+
		"\u0095\5\20\t\2\u0093\u0095\5\24\13\2\u0094\u008e\3\2\2\2\u0094\u008f"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5D#\2\u0097\u0096\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\5\3\2\2\2\u0099\u009a\t\3\2\2\u009a\7\3\2"+
		"\2\2\u009b\u009d\5\62\32\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\5F$\2\u009f\t\3\2\2\2\u00a0\u00a2\5\66\34\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\t\4\2\2\u00a4\u00a7\5L\'\2\u00a5\u00a6\t\5\2\2\u00a6\u00a8\5Z.\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00aa\5d"+
		"\63\2\u00aa\u00ab\7\u0087\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\13\3\2\2\2\u00ae\u00b0\5\66\34\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\7\5\2\2\u00b2"+
		"\u00b3\t\5\2\2\u00b3\u00b5\5Z.\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\r\3\2\2\2\u00b6\u00b8\5\66\34\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\7\16\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5^\60\2\u00bd\u00c4"+
		"\5L\'\2\u00be\u00c1\5f\64\2\u00bf\u00c1\5h\65\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\u0087\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\17\3\2\2\2\u00c6"+
		"\u00c9\7\7\2\2\u00c7\u00c9\5\22\n\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cd\5:\36\2\u00cb\u00cd\5<\37\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\23\3\2\2\2\u00ce\u00d3\5\26\f"+
		"\2\u00cf\u00d3\5\30\r\2\u00d0\u00d3\5\32\16\2\u00d1\u00d3\5\34\17\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7\u0087\2\2\u00d6"+
		"\u00d7\7\t\2\2\u00d7\u00d9\7\u0087\2\2\u00d8\u00da\5\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\27\3\2\2\2\u00db\u00dc\7h\2\2\u00dc"+
		"\u00de\5> \2\u00dd\u00df\7Q\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2"+
		"\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5\2\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7Q\2\2\u00e4\u00e5\5\2\2\2\u00e5"+
		"\u00e6\7h\2\2\u00e6\u00e7\5> \2\u00e7\33\3\2\2\2\u00e8\u00e9\7X\2\2\u00e9"+
		"\u00ef\7\u0087\2\2\u00ea\u00ed\7\35\2\2\u00eb\u00ee\5b\62\2\u00ec\u00ee"+
		"\5B\"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ea\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f6\3\2\2\2\u00f1\u00f4\7\34"+
		"\2\2\u00f2\u00f5\5b\62\2\u00f3\u00f5\5B\"\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\5\2\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00ff\5 \21\2\u00fc\u0100\5^\60"+
		"\2\u00fd\u0100\7\6\2\2\u00fe\u0100\7\3\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\7\u0087\2\2\u0102\u0105\3\2\2\2\u0103\u0105\5\"\22\2\u0104\u00fb"+
		"\3\2\2\2\u0104\u0103\3\2\2\2\u0105\37\3\2\2\2\u0106\u0107\t\6\2\2\u0107"+
		"!\3\2\2\2\u0108\u0110\t\7\2\2\u0109\u0111\5B\"\2\u010a\u010e\5^\60\2\u010b"+
		"\u010e\7\6\2\2\u010c\u010e\7\3\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\7\u0087\2\2\u0110\u0109\3\2\2\2\u0110\u010d\3\2\2\2\u0111#\3\2"+
		"\2\2\u0112\u0113\t\b\2\2\u0113%\3\2\2\2\u0114\u0115\5(\25\2\u0115\'\3"+
		"\2\2\2\u0116\u0117\5*\26\2\u0117\u0118\58\35\2\u0118)\3\2\2\2\u0119\u011a"+
		"\t\t\2\2\u011a+\3\2\2\2\u011b\u011d\t\n\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5b\62\2\u011f-\3\2\2\2"+
		"\u0120\u0123\t\13\2\2\u0121\u0124\5`\61\2\u0122\u0124\5B\"\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0122\3\2\2\2\u0124/\3\2\2\2\u0125\u0127\7\'\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5B"+
		"\"\2\u0129\61\3\2\2\2\u012a\u012c\t\f\2\2\u012b\u012a\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\5\66\34\2\u012e\u0130\7d\2\2"+
		"\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133"+
		"\7g\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\63\3\2\2\2\u0134"+
		"\u0137\t\f\2\2\u0135\u0137\7`\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2"+
		"\2\2\u0137\65\3\2\2\2\u0138\u013a\7L\2\2\u0139\u0138\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\7`\2\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\58\35\2\u013f\67\3\2\2"+
		"\2\u0140\u0141\t\r\2\2\u01419\3\2\2\2\u0142\u0144\5\64\33\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\5N(\2\u0149\u014a\7\17"+
		"\2\2\u014a\u014b\7\u0087\2\2\u014b;\3\2\2\2\u014c\u0164\5> \2\u014d\u014f"+
		"\7m\2\2\u014e\u0150\5> \2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0164\3\2\2\2\u0151\u0153\7e\2\2\u0152\u0154\7N\2\2\u0153\u0152\3\2\2"+
		"\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0157\7u\2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0164\3\2\2\2\u0158\u0159\7b\2\2\u0159"+
		"\u0164\5> \2\u015a\u015c\7n\2\2\u015b\u015d\5> \2\u015c\u015b\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u0164\3\2\2\2\u015e\u0164\7x\2\2\u015f\u0164"+
		"\7v\2\2\u0160\u0161\5|?\2\u0161\u0162\5B\"\2\u0162\u0164\3\2\2\2\u0163"+
		"\u014c\3\2\2\2\u0163\u014d\3\2\2\2\u0163\u0151\3\2\2\2\u0163\u0158\3\2"+
		"\2\2\u0163\u015a\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u015f\3\2\2\2\u0163"+
		"\u0160\3\2\2\2\u0164=\3\2\2\2\u0165\u016e\b \1\2\u0166\u016f\5j\66\2\u0167"+
		"\u016f\5l\67\2\u0168\u0169\5j\66\2\u0169\u016a\5j\66\2\u016a\u016f\3\2"+
		"\2\2\u016b\u016c\5l\67\2\u016c\u016d\5l\67\2\u016d\u016f\3\2\2\2\u016e"+
		"\u0166\3\2\2\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016b\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5> \7\u0171\u018d\3\2\2\2\u0172\u018d"+
		"\5@!\2\u0173\u0174\7J\2\2\u0174\u0179\5> \2\u0175\u0176\t\16\2\2\u0176"+
		"\u0178\5> \2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d"+
		"\7K\2\2\u017d\u0180\5\2\2\2\u017e\u017f\7R\2\2\u017f\u0181\5\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u018d\3\2\2\2\u0182\u0185\7\20"+
		"\2\2\u0183\u0186\5> \2\u0184\u0186\5H%\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u018d\3\2\2\2\u0187\u0188\7-\2\2\u0188\u0189\5> \2\u0189"+
		"\u018a\7\34\2\2\u018a\u018b\5> \2\u018b\u018d\3\2\2\2\u018c\u0165\3\2"+
		"\2\2\u018c\u0172\3\2\2\2\u018c\u0173\3\2\2\2\u018c\u0182\3\2\2\2\u018c"+
		"\u0187\3\2\2\2\u018d\u01b1\3\2\2\2\u018e\u0197\f\b\2\2\u018f\u0198\5n"+
		"8\2\u0190\u0198\5p9\2\u0191\u0198\5t;\2\u0192\u0198\5x=\2\u0193\u0198"+
		"\5v<\2\u0194\u0198\5r:\2\u0195\u0198\7\63\2\2\u0196\u0198\7\62\2\2\u0197"+
		"\u018f\3\2\2\2\u0197\u0190\3\2\2\2\u0197\u0191\3\2\2\2\u0197\u0192\3\2"+
		"\2\2\u0197\u0193\3\2\2\2\u0197\u0194\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01b0\5> \t\u019a\u01a3\f\5\2"+
		"\2\u019b\u01a4\5n8\2\u019c\u01a4\5p9\2\u019d\u01a4\5t;\2\u019e\u01a4\5"+
		"x=\2\u019f\u01a4\5v<\2\u01a0\u01a4\5r:\2\u01a1\u01a4\7\63\2\2\u01a2\u01a4"+
		"\7\62\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2\2\2"+
		"\u01a3\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b0\5> \6\u01a6"+
		"\u01ad\f\t\2\2\u01a7\u01a8\5j\66\2\u01a8\u01a9\5j\66\2\u01a9\u01ae\3\2"+
		"\2\2\u01aa\u01ab\5l\67\2\u01ab\u01ac\5l\67\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01a7\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u018e\3\2"+
		"\2\2\u01af\u019a\3\2\2\2\u01af\u01a6\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2?\3\2\2\2\u01b3\u01b1\3\2\2\2"+
		"\u01b4\u01b6\7&\2\2\u01b5\u01b7\5> \2\u01b6\u01b5\3\2\2\2\u01b6\u01b7"+
		"\3\2\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01bb\5B\"\2\u01b9\u01bb\5b\62\2\u01ba"+
		"\u01b4\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbA\3\2\2\2"+
		"\u01bc\u01bd\5H%\2\u01bd\u01be\5~@\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3"+
		"\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5H%\2\u01c2"+
		"C\3\2\2\2\u01c3\u01c6\5X-\2\u01c4\u01c7\5H%\2\u01c5\u01c7\5`\61\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7E\3\2\2\2\u01c8\u01d2\7\6\2\2"+
		"\u01c9\u01cb\5N(\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\7\17\2\2\u01cd\u01d3\7\u0087\2\2\u01ce\u01cf\7\17"+
		"\2\2\u01cf\u01d0\7\u0087\2\2\u01d0\u01d3\5L\'\2\u01d1\u01d3\5N(\2\u01d2"+
		"\u01ca\3\2\2\2\u01d2\u01ce\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3G\3\2\2\2"+
		"\u01d4\u01da\5J&\2\u01d5\u01da\5F$\2\u01d6\u01da\5P)\2\u01d7\u01da\5R"+
		"*\2\u01d8\u01da\5T+\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01d9\u01d6"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01daI\3\2\2\2\u01db"+
		"\u01dc\7O\2\2\u01dc\u01dd\7\u0087\2\2\u01ddK\3\2\2\2\u01de\u01e0\5V,\2"+
		"\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2"+
		"\5N(\2\u01e2M\3\2\2\2\u01e3\u01e4\7\u0087\2\2\u01e4\u01e6\7\32\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7\u0087\2\2\u01eb"+
		"O\3\2\2\2\u01ec\u01ed\7S\2\2\u01ed\u01ee\7\u0087\2\2\u01eeQ\3\2\2\2\u01ef"+
		"\u01f0\7\\\2\2\u01f0\u01f1\7\u0087\2\2\u01f1S\3\2\2\2\u01f2\u01f3\7\u0087"+
		"\2\2\u01f3U\3\2\2\2\u01f4\u01f5\t\17\2\2\u01f5W\3\2\2\2\u01f6\u01f7\t"+
		"\20\2\2\u01f7Y\3\2\2\2\u01f8\u01f9\5\\/\2\u01f9\u01fa\7\32\2\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\5\\"+
		"/\2\u0201[\3\2\2\2\u0202\u0205\5B\"\2\u0203\u0204\7\17\2\2\u0204\u0206"+
		"\7\u0087\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206]\3\2\2\2\u0207"+
		"\u0208\t\21\2\2\u0208_\3\2\2\2\u0209\u020b\7\23\2\2\u020a\u020c\7\24\2"+
		"\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e"+
		"\5b\62\2\u020ea\3\2\2\2\u020f\u0210\t\22\2\2\u0210c\3\2\2\2\u0211\u0212"+
		"\t\23\2\2\u0212e\3\2\2\2\u0213\u0214\t\24\2\2\u0214g\3\2\2\2\u0215\u0216"+
		"\t\25\2\2\u0216i\3\2\2\2\u0217\u0218\t\26\2\2\u0218k\3\2\2\2\u0219\u021a"+
		"\t\27\2\2\u021am\3\2\2\2\u021b\u021c\t\30\2\2\u021co\3\2\2\2\u021d\u021e"+
		"\t\31\2\2\u021eq\3\2\2\2\u021f\u0220\t\32\2\2\u0220s\3\2\2\2\u0221\u0222"+
		"\t\33\2\2\u0222u\3\2\2\2\u0223\u0224\t\34\2\2\u0224w\3\2\2\2\u0225\u0226"+
		"\t\35\2\2\u0226y\3\2\2\2\u0227\u0228\t\36\2\2\u0228{\3\2\2\2\u0229\u022a"+
		"\t\37\2\2\u022a}\3\2\2\2\u022b\u022c\t \2\2\u022c\177\3\2\2\2E\u0086\u0089"+
		"\u008c\u0094\u0097\u009c\u00a1\u00a7\u00ac\u00af\u00b4\u00b7\u00ba\u00c0"+
		"\u00c4\u00c8\u00cc\u00d2\u00d9\u00de\u00e1\u00ed\u00ef\u00f4\u00f6\u00f9"+
		"\u00ff\u0104\u010d\u0110\u011c\u0123\u0126\u012b\u012f\u0132\u0136\u0139"+
		"\u013c\u0145\u014f\u0153\u0156\u015c\u0163\u016e\u0179\u0180\u0185\u018c"+
		"\u0197\u01a3\u01ad\u01af\u01b1\u01b6\u01ba\u01bf\u01c6\u01ca\u01d2\u01d9"+
		"\u01df\u01e7\u01fd\u0205\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}