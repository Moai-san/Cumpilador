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
		PLUS=10, MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, ASSIGN=16, OP_SIMBOLS=17, 
		AND=18, OR=19, NOT=20, EQUAL=21, NOT_EQUAL=22, GREATER=23, LESSER=24, 
		GREATER_OR_EQUAL=25, LESSER_OR_EQUAL=26, BRACE_OPEN=27, BRACE_CLOSE=28, 
		BRACKET_OPEN=29, BRACKET_CLOSE=30, PAR_OPEN=31, PAR_CLOSE=32, SEMICOLON=33, 
		COMMA=34, IF=35, ELSE=36, DO=37, WHILE=38, FOR=39, NULL=40, RETURN=41, 
		CONSTANT=42, VAL_BOOLEAN=43, PI=44, FACT=45, SIN=46, COS=47, NAME_VAR=48, 
		NUMBER=49, WORDS=50, WS=51;
	public static final int
		RULE_program = 0, RULE_codigo = 1, RULE_declaracion = 2, RULE_escribir = 3, 
		RULE_leer = 4, RULE_si = 5, RULE_hacer_mientras = 6, RULE_mientras = 7, 
		RULE_para = 8, RULE_reasignar = 9, RULE_condicion = 10, RULE_calculo = 11, 
		RULE_bloque = 12;
	public static final String[] ruleNames = {
		"program", "codigo", "declaracion", "escribir", "leer", "si", "hacer_mientras", 
		"mientras", "para", "reasignar", "condicion", "calculo", "bloque"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'nyetak'", "'maca'", "'watak'", "'babak'", "'nyata'", 
		"'void'", "'bool'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", 
		null, "'&'", "'|'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'yen'", "'liyane'", 
		"'nggawe'", "'nalika'", "'kangoo'", "'NULL'", "'bali'", "'pancet'", null, 
		"'3,14159265358'", "'FACT'", "'SIN'", "'COS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAIN", "PRINT", "READ", "CHAR", "INT", "REAL", "VOID", "BOOLEAN", 
		"MAT_SIMBOLS", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "ASSIGN", 
		"OP_SIMBOLS", "AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", 
		"GREATER_OR_EQUAL", "LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", 
		"ELSE", "DO", "WHILE", "FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", 
		"PI", "FACT", "SIN", "COS", "NAME_VAR", "NUMBER", "WORDS", "WS"
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
			setState(26);
			match(INT);
			setState(27);
			match(MAIN);
			setState(28);
			match(BRACE_OPEN);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				codigo();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONSTANT) | (1L << NAME_VAR))) != 0) );
			setState(34);
			match(BRACE_CLOSE);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << VOID) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(35);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << VOID) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(NAME_VAR);
				setState(37);
				match(BRACE_OPEN);
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38);
					codigo();
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << CHAR) | (1L << INT) | (1L << REAL) | (1L << BOOLEAN) | (1L << IF) | (1L << DO) | (1L << WHILE) | (1L << FOR) | (1L << CONSTANT) | (1L << NAME_VAR))) != 0) );
				setState(43);
				match(BRACE_CLOSE);
				}
				}
				setState(49);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case REAL:
			case BOOLEAN:
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				declaracion();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				escribir();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				leer();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				si();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				hacer_mientras();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				mientras();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				para();
				}
				break;
			case NAME_VAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(60);
					match(CONSTANT);
					}
				}

				setState(63);
				match(CHAR);
				setState(64);
				match(NAME_VAR);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(65);
					match(ASSIGN);
					setState(66);
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

				setState(69);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(70);
					match(CONSTANT);
					}
				}

				setState(73);
				match(INT);
				setState(74);
				match(NAME_VAR);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(75);
					match(ASSIGN);
					setState(76);
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

				setState(79);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(80);
					match(CONSTANT);
					}
				}

				setState(83);
				match(REAL);
				setState(84);
				match(NAME_VAR);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(85);
					match(ASSIGN);
					setState(86);
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

				setState(89);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(90);
					match(CONSTANT);
					}
				}

				setState(93);
				match(BOOLEAN);
				setState(94);
				match(NAME_VAR);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(95);
					match(ASSIGN);
					setState(96);
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

				setState(99);
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
			setState(102);
			match(PRINT);
			setState(103);
			match(PAR_OPEN);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==NAME_VAR || _la==WORDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			match(PAR_CLOSE);
			setState(106);
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
			setState(108);
			match(READ);
			setState(109);
			match(PAR_OPEN);
			setState(110);
			match(NAME_VAR);
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
			setState(114);
			match(IF);
			setState(115);
			match(PAR_OPEN);
			setState(116);
			condicion(0);
			setState(117);
			match(PAR_CLOSE);
			setState(118);
			match(BRACE_OPEN);
			setState(119);
			bloque();
			setState(120);
			match(BRACE_CLOSE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
				match(BRACE_OPEN);
				setState(123);
				bloque();
				setState(124);
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
			setState(128);
			match(DO);
			setState(129);
			match(BRACE_OPEN);
			setState(130);
			bloque();
			setState(131);
			match(BRACE_CLOSE);
			setState(132);
			match(WHILE);
			setState(133);
			match(PAR_OPEN);
			setState(134);
			condicion(0);
			setState(135);
			match(PAR_CLOSE);
			setState(136);
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
			setState(138);
			match(WHILE);
			setState(139);
			match(PAR_OPEN);
			setState(140);
			condicion(0);
			setState(141);
			match(PAR_CLOSE);
			setState(142);
			match(BRACE_OPEN);
			setState(143);
			bloque();
			setState(144);
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
			setState(146);
			match(FOR);
			setState(147);
			match(PAR_OPEN);
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case INT:
			case REAL:
			case BOOLEAN:
			case CONSTANT:
				{
				setState(148);
				declaracion();
				}
				break;
			case NAME_VAR:
				{
				setState(149);
				match(NAME_VAR);
				}
				break;
			case COMMA:
				break;
			default:
				break;
			}
			setState(152);
			match(COMMA);
			setState(153);
			condicion(0);
			setState(154);
			match(COMMA);
			setState(155);
			calculo(0);
			setState(156);
			match(PAR_CLOSE);
			setState(157);
			match(BRACE_OPEN);
			setState(158);
			bloque();
			setState(159);
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
			setState(161);
			match(NAME_VAR);
			setState(162);
			match(ASSIGN);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORDS:
				{
				setState(163);
				match(WORDS);
				}
				break;
			case VAL_BOOLEAN:
				{
				setState(164);
				match(VAL_BOOLEAN);
				}
				break;
			case PAR_OPEN:
			case NAME_VAR:
			case NUMBER:
				{
				setState(165);
				calculo(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode VAL_BOOLEAN() { return getToken(ParserTParser.VAL_BOOLEAN, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode NOT() { return getToken(ParserTParser.NOT, 0); }
		public TerminalNode OP_SIMBOLS() { return getToken(ParserTParser.OP_SIMBOLS, 0); }
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
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_VAR:
				{
				setState(171);
				match(NAME_VAR);
				}
				break;
			case NUMBER:
				{
				setState(172);
				match(NUMBER);
				}
				break;
			case VAL_BOOLEAN:
				{
				setState(173);
				match(VAL_BOOLEAN);
				}
				break;
			case NOT:
			case PAR_OPEN:
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(174);
					match(NOT);
					}
				}

				setState(177);
				match(PAR_OPEN);
				setState(178);
				condicion(0);
				setState(179);
				match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(183);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(184);
					match(OP_SIMBOLS);
					setState(185);
					condicion(3);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class CalculoContext extends ParserRuleContext {
		public TerminalNode NAME_VAR() { return getToken(ParserTParser.NAME_VAR, 0); }
		public TerminalNode NUMBER() { return getToken(ParserTParser.NUMBER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(ParserTParser.PAR_OPEN, 0); }
		public List<CalculoContext> calculo() {
			return getRuleContexts(CalculoContext.class);
		}
		public CalculoContext calculo(int i) {
			return getRuleContext(CalculoContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(ParserTParser.PAR_CLOSE, 0); }
		public TerminalNode MAT_SIMBOLS() { return getToken(ParserTParser.MAT_SIMBOLS, 0); }
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
		return calculo(0);
	}

	private CalculoContext calculo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CalculoContext _localctx = new CalculoContext(_ctx, _parentState);
		CalculoContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_calculo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_VAR:
				{
				setState(192);
				match(NAME_VAR);
				}
				break;
			case NUMBER:
				{
				setState(193);
				match(NUMBER);
				}
				break;
			case PAR_OPEN:
				{
				setState(194);
				match(PAR_OPEN);
				setState(195);
				calculo(0);
				setState(196);
				match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalculoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_calculo);
					setState(200);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(201);
					match(MAT_SIMBOLS);
					setState(202);
					calculo(3);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 24, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				codigo();
				}
				}
				setState(211); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 11:
			return calculo_sempred((CalculoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean calculo_sempred(CalculoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00d8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\6\2!\n\2\r\2\16\2\"\3"+
		"\2\3\2\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\7\2\60\n\2\f\2\16\2\63\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\5\4@\n\4\3\4\3\4\3\4\3"+
		"\4\5\4F\n\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4\5\4T\n\4"+
		"\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\5\4d\n\4\3"+
		"\4\5\4g\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\n\u0099\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a9\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\3\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c9\n\r\3\r\3\r\3\r\7\r\u00ce\n\r"+
		"\f\r\16\r\u00d1\13\r\3\16\6\16\u00d4\n\16\r\16\16\16\u00d5\3\16\2\4\26"+
		"\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2\6\n\3\2\62\64\3\2\62\63"+
		"\4\2--\62\62\4\2\62\62\64\64\2\u00ed\2\34\3\2\2\2\4<\3\2\2\2\6f\3\2\2"+
		"\2\bh\3\2\2\2\nn\3\2\2\2\ft\3\2\2\2\16\u0082\3\2\2\2\20\u008c\3\2\2\2"+
		"\22\u0094\3\2\2\2\24\u00a3\3\2\2\2\26\u00b7\3\2\2\2\30\u00c8\3\2\2\2\32"+
		"\u00d3\3\2\2\2\34\35\7\7\2\2\35\36\7\3\2\2\36 \7\35\2\2\37!\5\4\3\2 \37"+
		"\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$\61\7\36\2\2%&\t\2"+
		"\2\2&\'\7\62\2\2\')\7\35\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+"+
		",\3\2\2\2,-\3\2\2\2-.\7\36\2\2.\60\3\2\2\2/%\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64=\5\6\4\2\65=\5\b"+
		"\5\2\66=\5\n\6\2\67=\5\f\7\28=\5\16\b\29=\5\20\t\2:=\5\22\n\2;=\5\24\13"+
		"\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2"+
		"<:\3\2\2\2<;\3\2\2\2=\5\3\2\2\2>@\7,\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2"+
		"AB\7\6\2\2BE\7\62\2\2CD\7\22\2\2DF\t\3\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2"+
		"\2Gg\7#\2\2HJ\7,\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\7\2\2LO\7\62\2"+
		"\2MN\7\22\2\2NP\t\4\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Qg\7#\2\2RT\7,\2"+
		"\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\b\2\2VY\7\62\2\2WX\7\22\2\2XZ\t\4"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[g\7#\2\2\\^\7,\2\2]\\\3\2\2\2]^\3\2"+
		"\2\2^_\3\2\2\2_`\7\n\2\2`c\7\62\2\2ab\7\22\2\2bd\t\5\2\2ca\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2eg\7#\2\2f?\3\2\2\2fI\3\2\2\2fS\3\2\2\2f]\3\2\2\2g\7\3"+
		"\2\2\2hi\7\4\2\2ij\7!\2\2jk\t\6\2\2kl\7\"\2\2lm\7#\2\2m\t\3\2\2\2no\7"+
		"\5\2\2op\7!\2\2pq\7\62\2\2qr\7\"\2\2rs\7#\2\2s\13\3\2\2\2tu\7%\2\2uv\7"+
		"!\2\2vw\5\26\f\2wx\7\"\2\2xy\7\35\2\2yz\5\32\16\2z\u0080\7\36\2\2{|\7"+
		"&\2\2|}\7\35\2\2}~\5\32\16\2~\177\7\36\2\2\177\u0081\3\2\2\2\u0080{\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083\7\'\2\2\u0083\u0084"+
		"\7\35\2\2\u0084\u0085\5\32\16\2\u0085\u0086\7\36\2\2\u0086\u0087\7(\2"+
		"\2\u0087\u0088\7!\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\"\2\2\u008a\u008b"+
		"\7#\2\2\u008b\17\3\2\2\2\u008c\u008d\7(\2\2\u008d\u008e\7!\2\2\u008e\u008f"+
		"\5\26\f\2\u008f\u0090\7\"\2\2\u0090\u0091\7\35\2\2\u0091\u0092\5\32\16"+
		"\2\u0092\u0093\7\36\2\2\u0093\21\3\2\2\2\u0094\u0095\7)\2\2\u0095\u0098"+
		"\7!\2\2\u0096\u0099\5\6\4\2\u0097\u0099\7\62\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7$"+
		"\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7$\2\2\u009d\u009e\5\30\r\2\u009e"+
		"\u009f\7\"\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2"+
		"\7\36\2\2\u00a2\23\3\2\2\2\u00a3\u00a4\7\62\2\2\u00a4\u00a8\7\22\2\2\u00a5"+
		"\u00a9\7\64\2\2\u00a6\u00a9\7-\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a5\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\7#\2\2\u00ab\25\3\2\2\2\u00ac\u00ad\b\f\1\2\u00ad\u00b8\7\62\2"+
		"\2\u00ae\u00b8\7\63\2\2\u00af\u00b8\7-\2\2\u00b0\u00b2\7\26\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7!"+
		"\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\"\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00ac\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b1\3\2"+
		"\2\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\f\4\2\2\u00ba\u00bb\7\23\2\2\u00bb"+
		"\u00bd\5\26\f\5\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\b\r\1\2\u00c2\u00c9\7\62\2\2\u00c3\u00c9\7\63\2\2\u00c4\u00c5\7"+
		"!\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\"\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cf\3\2"+
		"\2\2\u00ca\u00cb\f\4\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00ce\5\30\r\5\u00cd"+
		"\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\31\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\4\3\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\33\3\2\2\2\30\"+\61<?EIOSY]cf\u0080\u0098\u00a8\u00b1\u00b7\u00be\u00c8"+
		"\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}