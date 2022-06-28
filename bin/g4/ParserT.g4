grammar ParserT;
import LexerT;

program: INT MAIN BRACE_OPEN codigo+ BRACE_CLOSE ((INT | CHAR | REAL | VOID | BOOLEAN) NAME_VAR BRACE_OPEN codigo+ BRACE_CLOSE)* ;

codigo: declaracion | escribir | leer | si | hacer_mientras | mientras | para | reasignar ;

declaracion: CONSTANT? CHAR NAME_VAR (ASSIGN (NAME_VAR | WORDS | NUMBER))? SEMICOLON |
		     CONSTANT? INT NAME_VAR (ASSIGN (NAME_VAR | NUMBER | funcion_matematica))? SEMICOLON |
		     CONSTANT? REAL NAME_VAR (ASSIGN (NAME_VAR | NUMBER))? SEMICOLON |
		     CONSTANT? BOOLEAN NAME_VAR (ASSIGN (NAME_VAR | VAL_BOOLEAN))? SEMICOLON ;

escribir: PRINT PAR_OPEN (NAME_VAR | WORDS) PAR_CLOSE SEMICOLON ;

leer: READ PAR_OPEN NAME_VAR PAR_CLOSE SEMICOLON ;

si: IF PAR_OPEN condicion PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE (ELSE BRACE_OPEN bloque BRACE_CLOSE)? ;

hacer_mientras: DO BRACE_OPEN bloque BRACE_CLOSE WHILE PAR_OPEN condicion PAR_CLOSE SEMICOLON ;

mientras: WHILE PAR_OPEN condicion PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE ;

para: FOR PAR_OPEN (declaracion | NAME_VAR)? COMMA condicion COMMA calculo PAR_CLOSE BRACE_OPEN bloque BRACE_CLOSE ;

reasignar: NAME_VAR ASSIGN (WORDS | VAL_BOOLEAN | calculo | funcion_matematica) SEMICOLON ;

funcion_matematica: MOD PAR_OPEN (NAME_VAR | NUMBER) COMMA (NAME_VAR | NUMBER) PAR_CLOSE |
					FACT PAR_OPEN (NAME_VAR | NUMBER) PAR_CLOSE ;


condicion: NAME_VAR | NUMBER | VAL_BOOLEAN | condicion OP_SIMBOLS condicion | NOT? PAR_OPEN condicion PAR_CLOSE ;
calculo: NAME_VAR | NUMBER | calculo MAT_SIMBOLS calculo | PAR_OPEN calculo PAR_CLOSE ;
bloque: codigo+ ;