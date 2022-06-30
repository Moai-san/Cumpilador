// Generated from ParserT.g4 by ANTLR 4.7.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINT=2, READ=3, CHAR=4, INT=5, REAL=6, VOID=7, BOOLEAN=8, MAT_SIMBOLS=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, POW=14, ASSIGN=15, OP_SIMBOLS=16, 
		AND=17, OR=18, NOT=19, EQUAL=20, NOT_EQUAL=21, GREATER=22, LESSER=23, 
		GREATER_OR_EQUAL=24, LESSER_OR_EQUAL=25, BRACE_OPEN=26, BRACE_CLOSE=27, 
		BRACKET_OPEN=28, BRACKET_CLOSE=29, PAR_OPEN=30, PAR_CLOSE=31, SEMICOLON=32, 
		COMMA=33, IF=34, ELSE=35, DO=36, WHILE=37, FOR=38, NULL=39, RETURN=40, 
		CONSTANT=41, VAL_BOOLEAN=42, PI=43, FACT=44, MOD=45, SIN=46, COS=47, NAME_VAR=48, 
		NUMBER=49, WORDS=50, WS=51;
	public static final int
		RULE_program = 0, RULE_codigo = 1, RULE_declaracion = 2, RULE_escribir = 3, 
		RULE_leer = 4, RULE_si = 5, RULE_hacer_mientras = 6, RULE_mientras = 7, 
		RULE_para = 8, RULE_reasignar = 9, RULE_funcion_matematica = 10, RULE_condicion = 11, 
		RULE_calculo = 12, RULE_bloque = 13;
	public static final String[] ruleNames = {
		"program", "codigo", "declaracion", "escribir", "leer", "si", "hacer_mientras", 
		"mientras", "para", "reasignar", "funcion_matematica", "condicion", "calculo", 
		"bloque"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'nyetak'", "'maca'", "'watak'", "'babak'", "'nyata'", 
		"'void'", "'bool'", null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", null, 
		"'&'", "'|'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "';'", "','", "'yen'", "'liyane'", 
		"'nggawe'", "'nalika'", "'kangoo'", "'NULL'", "'bali'", "'pancet'", null, 
		"'3,14159265358'", "'FACT'", "'MOD'", "'SIN'", "'COS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAIN", "PRINT", "READ", "CHAR", "INT", "REAL", "VOID", "BOOLEAN", 
		"MAT_SIMBOLS", "PLUS", "MINUS", "MULT", "DIV", "POW", "ASSIGN", "OP_SIMBOLS", 
		"AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_OR_EQUAL", 
		"LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", "ELSE", "DO", "WHILE", 
		"FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", "PI", "FACT", "MOD", 
		"SIN", "COS", "NAME_VAR", "NUMBER", "WORDS", "WS"
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
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ParserTParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParserTParser.INT, i);
		}
		public TerminalNode MAIN() { return getToken(ParserTParser.MAIN, 0); }
		public List<TerminalNode> BRACE_OPEN() { return getTokens(ParserTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(ParserTParser.BRACE_OPEN, i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(ParserTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(ParserTParser.BRACE_CLOSE, i);
		}
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(ParserTParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ParserTParser.CHAR, i);
		}
		public List<TerminalNode> REAL() { return getTokens(ParserTParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(ParserTParser.REAL, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ParserTParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ParserTParser.VOID, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(ParserTParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(ParserTParser.BOOLEAN, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(INT);
			setState(29);
			match(MAIN);
			setState(30);
			match(BRACE_OPEN);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				codigo();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONSTANT) | (1L << NAME_VAR))) != 0) );
			setState(36);
			match(BRACE_CLOSE);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << VOID) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << VOID) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				match(NAME_VAR);
				setState(39);
				match(BRACE_OPEN);
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					codigo();
					}
					}
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONSTANT) | (1L << NAME_VAR))) != 0) );
				setState(45);
				match(BRACE_CLOSE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CodigoContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public Hacer_mientrasContext hacer_mientras() {
			return getRuleContext(Hacer_mientrasContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public ReasignarContext reasignar() {
			return getRuleContext(ReasignarContext.class,0);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_codigo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case REAL:
			case BOOLEAN:
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declaracion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				escribir();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				leer();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				si();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				hacer_mientras();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				mientras();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				para();
				}
				break;
			case NAME_VAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				reasignar();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(ParserTParser.CHAR, 0); }
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode CONSTANT() { return getToken(ParserTParser.CONSTANT, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode WORDS() { return getToken(ParserTParser.WORDS, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public Funcion_matematicaContext funcion_matematica() {
			return getRuleContext(Funcion_matematicaContext.class,0);
		}
		public TerminalNode REAL() { return getToken(ParserTParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserTParser.BOOLEAN, 0); }
		public TerminalNode VAL_BOOLEAN() { return getToken(ParserTParser.VAL_BOOLEAN, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(62);
					match(CONSTANT);
					}
				}

				setState(65);
				match(CHAR);
				setState(66);
				match(NAME_VAR);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(67);
					match(ASSIGN);
					setState(68);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME_VAR) | (1L << NUMBER) | (1L << WORDS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(71);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(72);
					match(CONSTANT);
					}
				}

				setState(75);
				match(INT);
				setState(76);
				match(NAME_VAR);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(77);
					match(ASSIGN);
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME_VAR:
						{
						setState(78);
						match(NAME_VAR);
						}
						break;
					case NUMBER:
						{
						setState(79);
						match(NUMBER);
						}
						break;
					case FACT:
					case MOD:
						{
						setState(80);
						funcion_matematica();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(85);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(86);
					match(CONSTANT);
					}
				}

				setState(89);
				match(REAL);
				setState(90);
				match(NAME_VAR);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(91);
					match(ASSIGN);
					setState(92);
					_la = _input.LA(1);
					if ( !(_la==NAME_VAR || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(95);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(96);
					match(CONSTANT);
					}
				}

				setState(99);
				match(BOOLEAN);
				setState(100);
				match(NAME_VAR);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(101);
					match(ASSIGN);
					setState(102);
					_la = _input.LA(1);
					if ( !(_la==VAL_BOOLEAN || _la==NAME_VAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(105);
				match(SEMICOLON);
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ParserTParser.PRINT, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode WORDS() { return getToken(ParserTParser.WORDS, 0); }
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PRINT);
			setState(109);
			match(PAR_OPEN);
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==WORDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			match(PAR_CLOSE);
			setState(112);
			match(SEMICOLON);
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ParserTParser.READ, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(READ);
			setState(115);
			match(PAR_OPEN);
			setState(116);
			match(NAME_VAR);
			setState(117);
			match(PAR_CLOSE);
			setState(118);
			match(SEMICOLON);
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACE_OPEN() { return getTokens(ParserTParser.BRACE_OPEN); }
		public TerminalNode BRACE_OPEN(int i) {
			return getToken(ParserTParser.BRACE_OPEN, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> BRACE_CLOSE() { return getTokens(ParserTParser.BRACE_CLOSE); }
		public TerminalNode BRACE_CLOSE(int i) {
			return getToken(ParserTParser.BRACE_CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(ParserTParser.ELSE, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			match(PAR_OPEN);
			setState(122);
			condicion();
			setState(123);
			match(PAR_CLOSE);
			setState(124);
			match(BRACE_OPEN);
			setState(125);
			bloque();
			setState(126);
			match(BRACE_CLOSE);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(127);
				match(ELSE);
				setState(128);
				match(BRACE_OPEN);
				setState(129);
				bloque();
				setState(130);
				match(BRACE_CLOSE);
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

	public static class Hacer_mientrasContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParserTParser.DO, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public Hacer_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitHacer_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientrasContext hacer_mientras() throws RecognitionException {
		Hacer_mientrasContext _localctx = new Hacer_mientrasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hacer_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DO);
			setState(135);
			match(BRACE_OPEN);
			setState(136);
			bloque();
			setState(137);
			match(BRACE_CLOSE);
			setState(138);
			match(WHILE);
			setState(139);
			match(PAR_OPEN);
			setState(140);
			condicion();
			setState(141);
			match(PAR_CLOSE);
			setState(142);
			match(SEMICOLON);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(WHILE);
			setState(145);
			match(PAR_OPEN);
			setState(146);
			condicion();
			setState(147);
			match(PAR_CLOSE);
			setState(148);
			match(BRACE_OPEN);
			setState(149);
			bloque();
			setState(150);
			match(BRACE_CLOSE);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserTParser.COMMA, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode BRACE_OPEN() { return getToken(ParserTParser.BRACE_OPEN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(ParserTParser.BRACE_CLOSE, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FOR);
			setState(153);
			match(PAR_OPEN);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case REAL:
			case BOOLEAN:
			case CONSTANT:
				{
				setState(154);
				declaracion();
				}
				break;
			case NAME_VAR:
				{
				setState(155);
				match(NAME_VAR);
				}
				break;
			case COMMA:
				break;
			default:
				break;
			}
			setState(158);
			match(COMMA);
			setState(159);
			condicion();
			setState(160);
			match(COMMA);
			setState(161);
			calculo();
			setState(162);
			match(PAR_CLOSE);
			setState(163);
			match(BRACE_OPEN);
			setState(164);
			bloque();
			setState(165);
			match(BRACE_CLOSE);
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

	public static class ReasignarContext extends ParserRuleContext {
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserTParser.SEMICOLON, 0); }
		public TerminalNode WORDS() { return getToken(ParserTParser.WORDS, 0); }
		public TerminalNode VAL_BOOLEAN() { return getToken(ParserTParser.VAL_BOOLEAN, 0); }
		public CalculoContext calculo() {
			return getRuleContext(CalculoContext.class,0);
		}
		public Funcion_matematicaContext funcion_matematica() {
			return getRuleContext(Funcion_matematicaContext.class,0);
		}
		public ReasignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reasignar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitReasignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReasignarContext reasignar() throws RecognitionException {
		ReasignarContext _localctx = new ReasignarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reasignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME_VAR);
			setState(168);
			match(ASSIGN);
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORDS:
				{
				setState(169);
				match(WORDS);
				}
				break;
			case VAL_BOOLEAN:
				{
				setState(170);
				match(VAL_BOOLEAN);
				}
				break;
			case PAR_OPEN:
				{
				setState(171);
				calculo();
				}
				break;
			case FACT:
			case MOD:
				{
				setState(172);
				funcion_matematica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(175);
			match(SEMICOLON);
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

	public static class Funcion_matematicaContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(ParserTParser.MOD, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode COMMA() { return getToken(ParserTParser.COMMA, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public TerminalNode FACT() { return getToken(ParserTParser.FACT, 0); }
		public Funcion_matematicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_matematica; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitFuncion_matematica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_matematicaContext funcion_matematica() throws RecognitionException {
		Funcion_matematicaContext _localctx = new Funcion_matematicaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcion_matematica);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(MOD);
				setState(178);
				match(PAR_OPEN);
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==NAME_VAR || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(COMMA);
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==NAME_VAR || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(PAR_CLOSE);
				}
				break;
			case FACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(FACT);
				setState(184);
				match(PAR_OPEN);
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==NAME_VAR || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				match(PAR_CLOSE);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode OP_SIMBOLS() { return getToken(ParserTParser.OP_SIMBOLS, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public List<TerminalNode> VAL_BOOLEAN() { return getTokens(ParserTParser.VAL_BOOLEAN); }
		public TerminalNode VAL_BOOLEAN(int i) {
			return getToken(ParserTParser.VAL_BOOLEAN, i);
		}
		public TerminalNode NOT() { return getToken(ParserTParser.NOT, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(189);
				match(NOT);
				}
			}

			setState(192);
			match(PAR_OPEN);
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL_BOOLEAN) | (1L << NAME_VAR) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(OP_SIMBOLS);
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAL_BOOLEAN) | (1L << NAME_VAR) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
			match(PAR_CLOSE);
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

	public static class CalculoContext extends ParserRuleContext {
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public TerminalNode MAT_SIMBOLS() { return getToken(ParserTParser.MAT_SIMBOLS, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public List<TerminalNode> NAME_VAR() { return getTokens(ParserTParser.NAME_VAR); }
		public TerminalNode NAME_VAR(int i) {
			return getToken(ParserTParser.NAME_VAR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ParserTParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserTParser.NUMBER, i);
		}
		public CalculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCalculo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculoContext calculo() throws RecognitionException {
		CalculoContext _localctx = new CalculoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_calculo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(PAR_OPEN);
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			match(MAT_SIMBOLS);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(PAR_CLOSE);
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

	public static class BloqueContext extends ParserRuleContext {
		public List<CodigoContext> codigo() {
			return getRuleContexts(CodigoContext.class);
		}
		public CodigoContext codigo(int i) {
			return getRuleContext(CodigoContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				codigo();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONSTANT) | (1L << NAME_VAR))) != 0) );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\2\3\2\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\7\2\62\n\2\f\2\16"+
		"\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\5\4B\n\4\3\4\3"+
		"\4\3\4\3\4\5\4H\n\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4"+
		"\5\4V\n\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\5\4d\n\4\3"+
		"\4\3\4\3\4\3\4\5\4j\n\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0087"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00be\n\f\3\r\5\r\u00c1\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u00d0\n\17\r\17"+
		"\16\17\u00d1\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\b\3\2\6"+
		"\n\3\2\62\64\3\2\62\63\4\2,,\62\62\4\2\62\62\64\64\4\2,,\62\63\2\u00e5"+
		"\2\36\3\2\2\2\4>\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2\nt\3\2\2\2\fz\3\2\2\2\16"+
		"\u0088\3\2\2\2\20\u0092\3\2\2\2\22\u009a\3\2\2\2\24\u00a9\3\2\2\2\26\u00bd"+
		"\3\2\2\2\30\u00c0\3\2\2\2\32\u00c8\3\2\2\2\34\u00cf\3\2\2\2\36\37\7\7"+
		"\2\2\37 \7\3\2\2 \"\7\34\2\2!#\5\4\3\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2"+
		"$%\3\2\2\2%&\3\2\2\2&\63\7\35\2\2\'(\t\2\2\2()\7\62\2\2)+\7\34\2\2*,\5"+
		"\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\35\2\2"+
		"\60\62\3\2\2\2\61\'\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\3\3\2\2\2\65\63\3\2\2\2\66?\5\6\4\2\67?\5\b\5\28?\5\n\6\29?\5\f\7"+
		"\2:?\5\16\b\2;?\5\20\t\2<?\5\22\n\2=?\5\24\13\2>\66\3\2\2\2>\67\3\2\2"+
		"\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\5\3\2"+
		"\2\2@B\7+\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\6\2\2DG\7\62\2\2EF\7\21"+
		"\2\2FH\t\3\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2Im\7\"\2\2JL\7+\2\2KJ\3\2"+
		"\2\2KL\3\2\2\2LM\3\2\2\2MN\7\7\2\2NU\7\62\2\2OS\7\21\2\2PT\7\62\2\2QT"+
		"\7\63\2\2RT\5\26\f\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TV\3\2\2\2UO\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2Wm\7\"\2\2XZ\7+\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2"+
		"[\\\7\b\2\2\\_\7\62\2\2]^\7\21\2\2^`\t\4\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2am\7\"\2\2bd\7+\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\n\2\2fi\7\62"+
		"\2\2gh\7\21\2\2hj\t\5\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\"\2\2lA\3"+
		"\2\2\2lK\3\2\2\2lY\3\2\2\2lc\3\2\2\2m\7\3\2\2\2no\7\4\2\2op\7 \2\2pq\t"+
		"\6\2\2qr\7!\2\2rs\7\"\2\2s\t\3\2\2\2tu\7\5\2\2uv\7 \2\2vw\7\62\2\2wx\7"+
		"!\2\2xy\7\"\2\2y\13\3\2\2\2z{\7$\2\2{|\7 \2\2|}\5\30\r\2}~\7!\2\2~\177"+
		"\7\34\2\2\177\u0080\5\34\17\2\u0080\u0086\7\35\2\2\u0081\u0082\7%\2\2"+
		"\u0082\u0083\7\34\2\2\u0083\u0084\5\34\17\2\u0084\u0085\7\35\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0087\3\2\2\2\u0087\r\3\2\2\2"+
		"\u0088\u0089\7&\2\2\u0089\u008a\7\34\2\2\u008a\u008b\5\34\17\2\u008b\u008c"+
		"\7\35\2\2\u008c\u008d\7\'\2\2\u008d\u008e\7 \2\2\u008e\u008f\5\30\r\2"+
		"\u008f\u0090\7!\2\2\u0090\u0091\7\"\2\2\u0091\17\3\2\2\2\u0092\u0093\7"+
		"\'\2\2\u0093\u0094\7 \2\2\u0094\u0095\5\30\r\2\u0095\u0096\7!\2\2\u0096"+
		"\u0097\7\34\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\35\2\2\u0099\21\3"+
		"\2\2\2\u009a\u009b\7(\2\2\u009b\u009e\7 \2\2\u009c\u009f\5\6\4\2\u009d"+
		"\u009f\7\62\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\5\30\r\2\u00a2"+
		"\u00a3\7#\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\34"+
		"\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a8\7\35\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00aa\7\62\2\2\u00aa\u00af\7\21\2\2\u00ab\u00b0\7\64\2\2\u00ac\u00b0"+
		"\7,\2\2\u00ad\u00b0\5\32\16\2\u00ae\u00b0\5\26\f\2\u00af\u00ab\3\2\2\2"+
		"\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\7\"\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4"+
		"\u00b5\7 \2\2\u00b5\u00b6\t\4\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\t\4\2"+
		"\2\u00b8\u00be\7!\2\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc"+
		"\t\4\2\2\u00bc\u00be\7!\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c1\7\25\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3\u00c4\t\7\2\2\u00c4\u00c5"+
		"\7\22\2\2\u00c5\u00c6\t\7\2\2\u00c6\u00c7\7!\2\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00c9\7 \2\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc\t\4"+
		"\2\2\u00cc\u00cd\7!\2\2\u00cd\33\3\2\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\35\3\2\2\2\26$-\63>AGKSUY_cil\u0086\u009e\u00af\u00bd\u00c0\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}