package com.dictationParser;
// Generated from DictationParser.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DictationParserParser}.
 */
public interface DictationParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DictationParserParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DictationParserParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#creationCommand}.
	 * @param ctx the parse tree
	 */
	void enterCreationCommand(DictationParserParser.CreationCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#creationCommand}.
	 * @param ctx the parse tree
	 */
	void exitCreationCommand(DictationParserParser.CreationCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#creationVerb}.
	 * @param ctx the parse tree
	 */
	void enterCreationVerb(DictationParserParser.CreationVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#creationVerb}.
	 * @param ctx the parse tree
	 */
	void exitCreationVerb(DictationParserParser.CreationVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createField}.
	 * @param ctx the parse tree
	 */
	void enterCreateField(DictationParserParser.CreateFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createField}.
	 * @param ctx the parse tree
	 */
	void exitCreateField(DictationParserParser.CreateFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreateMethod(DictationParserParser.CreateMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreateMethod(DictationParserParser.CreateMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createConstructor}.
	 * @param ctx the parse tree
	 */
	void enterCreateConstructor(DictationParserParser.CreateConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createConstructor}.
	 * @param ctx the parse tree
	 */
	void exitCreateConstructor(DictationParserParser.CreateConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createDataType}.
	 * @param ctx the parse tree
	 */
	void enterCreateDataType(DictationParserParser.CreateDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createDataType}.
	 * @param ctx the parse tree
	 */
	void exitCreateDataType(DictationParserParser.CreateDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createBlock}.
	 * @param ctx the parse tree
	 */
	void enterCreateBlock(DictationParserParser.CreateBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createBlock}.
	 * @param ctx the parse tree
	 */
	void exitCreateBlock(DictationParserParser.CreateBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateBlockStatement(DictationParserParser.CreateBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateBlockStatement(DictationParserParser.CreateBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createLoop}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoop(DictationParserParser.CreateLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createLoop}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoop(DictationParserParser.CreateLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createForEachLoop}.
	 * @param ctx the parse tree
	 */
	void enterCreateForEachLoop(DictationParserParser.CreateForEachLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createForEachLoop}.
	 * @param ctx the parse tree
	 */
	void exitCreateForEachLoop(DictationParserParser.CreateForEachLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterCreateWhileLoop(DictationParserParser.CreateWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitCreateWhileLoop(DictationParserParser.CreateWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterCreateDoWhileLoop(DictationParserParser.CreateDoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createDoWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitCreateDoWhileLoop(DictationParserParser.CreateDoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#createForLoop}.
	 * @param ctx the parse tree
	 */
	void enterCreateForLoop(DictationParserParser.CreateForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#createForLoop}.
	 * @param ctx the parse tree
	 */
	void exitCreateForLoop(DictationParserParser.CreateForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#navigationCommand}.
	 * @param ctx the parse tree
	 */
	void enterNavigationCommand(DictationParserParser.NavigationCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#navigationCommand}.
	 * @param ctx the parse tree
	 */
	void exitNavigationCommand(DictationParserParser.NavigationCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#navigationVerb}.
	 * @param ctx the parse tree
	 */
	void enterNavigationVerb(DictationParserParser.NavigationVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#navigationVerb}.
	 * @param ctx the parse tree
	 */
	void exitNavigationVerb(DictationParserParser.NavigationVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void enterExitCommand(DictationParserParser.ExitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void exitExitCommand(DictationParserParser.ExitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(DictationParserParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(DictationParserParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#modificationCommand}.
	 * @param ctx the parse tree
	 */
	void enterModificationCommand(DictationParserParser.ModificationCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#modificationCommand}.
	 * @param ctx the parse tree
	 */
	void exitModificationCommand(DictationParserParser.ModificationCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#modifyAccessLevel}.
	 * @param ctx the parse tree
	 */
	void enterModifyAccessLevel(DictationParserParser.ModifyAccessLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#modifyAccessLevel}.
	 * @param ctx the parse tree
	 */
	void exitModifyAccessLevel(DictationParserParser.ModifyAccessLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#modificationVerb}.
	 * @param ctx the parse tree
	 */
	void enterModificationVerb(DictationParserParser.ModificationVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#modificationVerb}.
	 * @param ctx the parse tree
	 */
	void exitModificationVerb(DictationParserParser.ModificationVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#selectionCommand}.
	 * @param ctx the parse tree
	 */
	void enterSelectionCommand(DictationParserParser.SelectionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#selectionCommand}.
	 * @param ctx the parse tree
	 */
	void exitSelectionCommand(DictationParserParser.SelectionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#deletionCommand}.
	 * @param ctx the parse tree
	 */
	void enterDeletionCommand(DictationParserParser.DeletionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#deletionCommand}.
	 * @param ctx the parse tree
	 */
	void exitDeletionCommand(DictationParserParser.DeletionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#invocationCommand}.
	 * @param ctx the parse tree
	 */
	void enterInvocationCommand(DictationParserParser.InvocationCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#invocationCommand}.
	 * @param ctx the parse tree
	 */
	void exitInvocationCommand(DictationParserParser.InvocationCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(DictationParserParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(DictationParserParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(DictationParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(DictationParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(DictationParserParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(DictationParserParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#accessLevel}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevel(DictationParserParser.AccessLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#accessLevel}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevel(DictationParserParser.AccessLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(DictationParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(DictationParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DictationParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DictationParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DictationParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DictationParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DictationParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DictationParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#elementsElement}.
	 * @param ctx the parse tree
	 */
	void enterElementsElement(DictationParserParser.ElementsElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#elementsElement}.
	 * @param ctx the parse tree
	 */
	void exitElementsElement(DictationParserParser.ElementsElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#elementLocation}.
	 * @param ctx the parse tree
	 */
	void enterElementLocation(DictationParserParser.ElementLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#elementLocation}.
	 * @param ctx the parse tree
	 */
	void exitElementLocation(DictationParserParser.ElementLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#fieldRef}.
	 * @param ctx the parse tree
	 */
	void enterFieldRef(DictationParserParser.FieldRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#fieldRef}.
	 * @param ctx the parse tree
	 */
	void exitFieldRef(DictationParserParser.FieldRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#elementRef}.
	 * @param ctx the parse tree
	 */
	void enterElementRef(DictationParserParser.ElementRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#elementRef}.
	 * @param ctx the parse tree
	 */
	void exitElementRef(DictationParserParser.ElementRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#classRef}.
	 * @param ctx the parse tree
	 */
	void enterClassRef(DictationParserParser.ClassRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#classRef}.
	 * @param ctx the parse tree
	 */
	void exitClassRef(DictationParserParser.ClassRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#namedElement}.
	 * @param ctx the parse tree
	 */
	void enterNamedElement(DictationParserParser.NamedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#namedElement}.
	 * @param ctx the parse tree
	 */
	void exitNamedElement(DictationParserParser.NamedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#elementsName}.
	 * @param ctx the parse tree
	 */
	void enterElementsName(DictationParserParser.ElementsNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#elementsName}.
	 * @param ctx the parse tree
	 */
	void exitElementsName(DictationParserParser.ElementsNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#enumRef}.
	 * @param ctx the parse tree
	 */
	void enterEnumRef(DictationParserParser.EnumRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#enumRef}.
	 * @param ctx the parse tree
	 */
	void exitEnumRef(DictationParserParser.EnumRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#interfaceRef}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceRef(DictationParserParser.InterfaceRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#interfaceRef}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceRef(DictationParserParser.InterfaceRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#unspecifiedRef}.
	 * @param ctx the parse tree
	 */
	void enterUnspecifiedRef(DictationParserParser.UnspecifiedRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#unspecifiedRef}.
	 * @param ctx the parse tree
	 */
	void exitUnspecifiedRef(DictationParserParser.UnspecifiedRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(DictationParserParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(DictationParserParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#locationRef}.
	 * @param ctx the parse tree
	 */
	void enterLocationRef(DictationParserParser.LocationRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#locationRef}.
	 * @param ctx the parse tree
	 */
	void exitLocationRef(DictationParserParser.LocationRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(DictationParserParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(DictationParserParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(DictationParserParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(DictationParserParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(DictationParserParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(DictationParserParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(DictationParserParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(DictationParserParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DictationParserParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DictationParserParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#returnsVars}.
	 * @param ctx the parse tree
	 */
	void enterReturnsVars(DictationParserParser.ReturnsVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#returnsVars}.
	 * @param ctx the parse tree
	 */
	void exitReturnsVars(DictationParserParser.ReturnsVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#implementsVars}.
	 * @param ctx the parse tree
	 */
	void enterImplementsVars(DictationParserParser.ImplementsVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#implementsVars}.
	 * @param ctx the parse tree
	 */
	void exitImplementsVars(DictationParserParser.ImplementsVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#extendsVars}.
	 * @param ctx the parse tree
	 */
	void enterExtendsVars(DictationParserParser.ExtendsVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#extendsVars}.
	 * @param ctx the parse tree
	 */
	void exitExtendsVars(DictationParserParser.ExtendsVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#plusVars}.
	 * @param ctx the parse tree
	 */
	void enterPlusVars(DictationParserParser.PlusVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#plusVars}.
	 * @param ctx the parse tree
	 */
	void exitPlusVars(DictationParserParser.PlusVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#minusVars}.
	 * @param ctx the parse tree
	 */
	void enterMinusVars(DictationParserParser.MinusVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#minusVars}.
	 * @param ctx the parse tree
	 */
	void exitMinusVars(DictationParserParser.MinusVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#equalsVars}.
	 * @param ctx the parse tree
	 */
	void enterEqualsVars(DictationParserParser.EqualsVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#equalsVars}.
	 * @param ctx the parse tree
	 */
	void exitEqualsVars(DictationParserParser.EqualsVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#isDifferentVars}.
	 * @param ctx the parse tree
	 */
	void enterIsDifferentVars(DictationParserParser.IsDifferentVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#isDifferentVars}.
	 * @param ctx the parse tree
	 */
	void exitIsDifferentVars(DictationParserParser.IsDifferentVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#lessThanVars}.
	 * @param ctx the parse tree
	 */
	void enterLessThanVars(DictationParserParser.LessThanVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#lessThanVars}.
	 * @param ctx the parse tree
	 */
	void exitLessThanVars(DictationParserParser.LessThanVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#lessThanEqualsVars}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqualsVars(DictationParserParser.LessThanEqualsVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#lessThanEqualsVars}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqualsVars(DictationParserParser.LessThanEqualsVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#greaterThanVars}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanVars(DictationParserParser.GreaterThanVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#greaterThanVars}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanVars(DictationParserParser.GreaterThanVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#greaterThanEqualVars}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqualVars(DictationParserParser.GreaterThanEqualVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#greaterThanEqualVars}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqualVars(DictationParserParser.GreaterThanEqualVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#forEachVars}.
	 * @param ctx the parse tree
	 */
	void enterForEachVars(DictationParserParser.ForEachVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#forEachVars}.
	 * @param ctx the parse tree
	 */
	void exitForEachVars(DictationParserParser.ForEachVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#caseVars}.
	 * @param ctx the parse tree
	 */
	void enterCaseVars(DictationParserParser.CaseVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#caseVars}.
	 * @param ctx the parse tree
	 */
	void exitCaseVars(DictationParserParser.CaseVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DictationParserParser#periodVars}.
	 * @param ctx the parse tree
	 */
	void enterPeriodVars(DictationParserParser.PeriodVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DictationParserParser#periodVars}.
	 * @param ctx the parse tree
	 */
	void exitPeriodVars(DictationParserParser.PeriodVarsContext ctx);
}