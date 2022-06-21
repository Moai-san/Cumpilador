lexer grammar LexerT;

MAIN: 'main' ; // Funcion principal
PRINT: 'nyetak' ; // Impresion
READ: 'maca' ; // Lectura

//Tipos de datos
CHAR: 'watak' ;
INT: 'babak' ; // Numeros enteros positivos y negativos
REAL: 'nyata' ; // Numeros decimales positivos y negativos
VOID: 'void' ;
BOOLEAN: 'bool' ;

//Operadores matematicos
MAT_SIMBOLS: PLUS | MINUS | MULT | DIV | MOD | POW ;

PLUS: '+' ;
MINUS: '-' ;
MULT: '*' ;
DIV: '/' ;
MOD: '%' ;
POW: '^' ;

//Operadores
ASSIGN: '=' ; // Operador de asignacion

OP_SIMBOLS: AND | OR | GREATER | LESSER | GREATER_OR_EQUAL | LESSER_OR_EQUAL | EQUAL | NOT_EQUAL ;

AND: '&' ; // Operador logico
OR: '|' ; // Operador logico
NOT: '!' ; // Operador logico

EQUAL: '==' ;
NOT_EQUAL: '!=' ;

GREATER: '>' ;
LESSER: '<' ;
GREATER_OR_EQUAL: '>=' ;
LESSER_OR_EQUAL: '<=' ;

//Controladores
BRACE_OPEN: '{' ;
BRACE_CLOSE: '}' ;

BRACKET_OPEN: '[' ;
BRACKET_CLOSE: ']' ;

PAR_OPEN: '(' ;
PAR_CLOSE: ')' ;

SEMICOLON: ';' ;
COMMA: ',' ;

//Estructuras condicionales y repetitivas
IF: 'yen' ;
ELSE: 'liyane' ;
DO: 'nggawe' ;
WHILE: 'nalika' ;
FOR: 'kangoo' ;

//Constantes
NULL: 'NULL' ;
RETURN: 'bali' ;
CONSTANT: 'pancet' ;
VAL_BOOLEAN: ('bener' | 'palsu') ; // Valores que puede tomar un booleano, verdadero (bener) y falso (palsu)
PI: '3,14159265358' ;

//Funciones matematicas
FACT: 'FACT' ; // Factorial
SIN: 'SIN' ; // Seno
COS: 'COS' ; // Coseno


NAME_VAR: LOWER_CHAR (LOWER_CHAR | UPPER_CHAR | DIGIT | '_' | '-')* ; // Nombre de variables, parten con letra minuscula obligatoriamente y luego aceptan minusculas, mayusculas, numeros y guiones
NUMBER: '-'? DIGIT+ ('.' DIGIT+)? ; // Numeros negativos y positivos
WORDS: '"' (~["\\] | '\\' .)* '"' ; //Admite oraciones como una sola palabra y espacios pero debe ser obligatoriamente entre " ".

fragment LOWER_CHAR: [a-z] ;
fragment UPPER_CHAR: [A-Z] ; 
fragment DIGIT: [0-9] ;
WS: [ \t\r\n]+ -> skip ;
