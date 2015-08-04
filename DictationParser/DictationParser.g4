grammar DictationParser;

/* Parser */

// Top
command: creationCommand; // | NavigationCommand | ModificationCommand | SelectionCommand;

// Creation Layer
creationCommand: creationVerb (AN | A)? (createField | createMethod | createDataType | createBlock | createStatement) elementLocation?;
creationVerb: CREATE | NEW;
createField: fieldModifier? fieldRef;
createMethod: modifier? (METHOD | FUNCTION) namedElement ((THAT_ACCEPTS | WITH) parametersList)?;
createDataType: modifier? (INNER)? dataType namedElement;
createBlock: BLOCK;
createStatement: createExpression;// | <Create-Control-Flow-Statement>
createExpression: //<Create-Assignment-Expression> | <Create-Method-Invocation-Expression> | <Create-Object-Creation-Expression> | <Create-Increment-Decrement-Expression>;

// Common
fieldModifier: modifier FINAL? TRANSIENT? VOLATILE?;
modifier: STATIC? accessLevel;
accessLevel: PRIVATE | PUBLIC | PROTECTED;

elementLocation: locationRef (elementRef | line);
fieldRef:  FIELD (ElementName? OF_TYPE ElementType | OF_TYPE ElementType namedElement | ElementName);
elementRef: classRef | fieldRef | enumRef | interfaceRef | unspecifiedRef;
classRef: CLASS ElementName;
namedElement: reference? ElementName;
enumRef: ENUM ElementName;
interfaceRef: INTERFACE ElementName;
unspecifiedRef: ElementName;
reference: NAMED | CALLED;
locationRef: INSIDE | IN | AFTER | BEFORE | ABOVE | BELOW;
parametersList: (parameter AND)* parameter;
parameter: ElementName OF_TYPE ElementType;
dataType: CLASS | ENUM | INTERFACE;
line: LINE NUMBER? Number;

/* Lexer */
AND: 'and';

THAT_ACCEPTS: 'that accepts';
WITH: 'with';

METHOD: 'method';
FUNCTION: 'function';

AN: 'an';
A: 'a';

INSIDE: 'inside';
IN: 'in';
AFTER: 'after';
BEFORE: 'before';
ABOVE: 'above';
BELOW: 'below';
INNER: 'inner';

OF_TYPE: 'of type';
CREATE: 'create';
NEW: 'new';
FIELD: 'field';
BLOCK: 'block';
NAMED: 'named';
CALLED: 'called';
LINE: 'line';
NUMBER: 'number';

//ABSTRACT      : 'abstract';
//ASSERT        : 'assert';
//BOOLEAN       : 'boolean';
//BREAK         : 'break';
//BYTE          : 'byte';
//CASE          : 'case';
//CATCH         : 'catch';
//CHAR          : 'char';
CLASS         : 'class';
//CONST         : 'const';
//CONTINUE      : 'continue';
//DEFAULT       : 'default';
//DO            : 'do';
//DOUBLE        : 'double';
//ELSE          : 'else';
ENUM          : 'enum';
//EXTENDS       : 'extends';
FINAL         : 'final';
//FINALLY       : 'finally';
//FLOAT         : 'float';
//FOR           : 'for';
//IF            : 'if';
//GOTO          : 'goto';
//IMPLEMENTS    : 'implements';
//IMPORT        : 'import';
//INSTANCEOF    : 'instanceof';
//INT           : 'int';
INTERFACE     : 'interface';
//LONG          : 'long';
//NATIVE        : 'native';
//NEW           : 'new';
//PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
//RETURN        : 'return';
//SHORT         : 'short';
STATIC        : 'static';
//STRICTFP      : 'strictfp';
//SUPER         : 'super';
//SWITCH        : 'switch';
//SYNCHRONIZED  : 'synchronized';
//THIS          : 'this';
//THROW         : 'throw';
//THROWS        : 'throws';
TRANSIENT     : 'transient';
//TRY           : 'try';
//VOID          : 'void';
VOLATILE      : 'volatile';
//WHILE         : 'while';

Number: [0-9] | 'one' | 'two' | 'three' | 'four' | 'five' | 'six' | 'seven' | 'eight' | 'nine';
ElementType : [a-zA-Z$_]+;
ElementName : [a-zA-Z0-9$_]+;


/*fragment JavaLetter
    :   [a-zA-Z$_]; // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;*/

/*fragment JavaLetterOrDigit
    :   [a-zA-Z0-9$_]; // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;*/

WS  :  [ \t\r\n\u000C]+ -> skip;