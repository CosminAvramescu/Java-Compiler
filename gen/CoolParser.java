// Generated from E:/OneDrive/OneDrive - Universitatea Politehnica Bucuresti/Cursuri/Anul 4/Semestrul 1/CPL/Tema1/src/cool/compiler/CoolParser.g4 by ANTLR 4.13.1

    package cool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, IF=2, THEN=3, ELSE=4, FI=5, CLASS=6, INHERITS=7, BOOL=8, TYPE=9, 
		ID=10, INT=11, FLOAT=12, STRING=13, SEMI=14, COMMA=15, ASSIGN=16, LPAREN=17, 
		RPAREN=18, LBRACE=19, RBRACE=20, PLUS=21, MINUS=22, MULT=23, DIV=24, EQUAL=25, 
		LT=26, LE=27, LINE_COMMENT=28, BLOCK_COMMENT=29, WS=30;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_formal = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "formal", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'then'", "'else'", "'fi'", "'class'", "'inherits'", 
			null, null, null, null, null, null, "';'", "','", "'='", "'('", "')'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'=='", "'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "IF", "THEN", "ELSE", "FI", "CLASS", "INHERITS", "BOOL", 
			"TYPE", "ID", "INT", "FLOAT", "STRING", "SEMI", "COMMA", "ASSIGN", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", 
			"LT", "LE", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4333380L) != 0)) {
				{
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
				case TYPE:
					{
					setState(8);
					definition();
					}
					break;
				case IF:
				case BOOL:
				case ID:
				case INT:
				case FLOAT:
				case LPAREN:
				case MINUS:
					{
					setState(9);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(12);
				match(SEMI);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	 
		public DefinitionContext() { }
		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends DefinitionContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClassDefContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefContext extends DefinitionContext {
		public Token type;
		public Token name;
		public ExprContext init;
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends DefinitionContext {
		public Token type;
		public Token name;
		public FormalContext formal;
		public List<FormalContext> formals = new ArrayList<FormalContext>();
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public FuncDefContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				((VarDefContext)_localctx).type = match(TYPE);
				setState(22);
				((VarDefContext)_localctx).name = match(ID);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(23);
					match(ASSIGN);
					setState(24);
					((VarDefContext)_localctx).init = expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				((FuncDefContext)_localctx).type = match(TYPE);
				setState(28);
				((FuncDefContext)_localctx).name = match(ID);
				setState(29);
				match(LPAREN);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(30);
					((FuncDefContext)_localctx).formal = formal();
					((FuncDefContext)_localctx).formals.add(((FuncDefContext)_localctx).formal);
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(31);
						match(COMMA);
						setState(32);
						((FuncDefContext)_localctx).formal = formal();
						((FuncDefContext)_localctx).formals.add(((FuncDefContext)_localctx).formal);
						}
						}
						setState(37);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(40);
				match(RPAREN);
				setState(41);
				match(LBRACE);
				setState(42);
				((FuncDefContext)_localctx).body = expr(0);
				setState(43);
				match(RBRACE);
				}
				break;
			case 3:
				_localctx = new ClassDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(CLASS);
				setState(46);
				match(ID);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INHERITS) {
					{
					setState(47);
					match(INHERITS);
					setState(48);
					match(ID);
					}
				}

				setState(51);
				match(LBRACE);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4332804L) != 0)) {
					{
					setState(52);
					expr(0);
					}
				}

				setState(55);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((FormalContext)_localctx).type = match(TYPE);
			setState(59);
			((FormalContext)_localctx).name = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExprContext {
		public Token name;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExprContext {
		public ExprContext e;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public PlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CoolParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext e;
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(CoolParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ExprContext {
		public ExprContext cond;
		public ExprContext thenBranch;
		public ExprContext elseBranch;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public Token name;
		public ExprContext e;
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				((CallContext)_localctx).name = match(ID);
				setState(63);
				match(LPAREN);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4332804L) != 0)) {
					{
					setState(64);
					((CallContext)_localctx).expr = expr(0);
					((CallContext)_localctx).args.add(((CallContext)_localctx).expr);
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(65);
						match(COMMA);
						setState(66);
						((CallContext)_localctx).expr = expr(0);
						((CallContext)_localctx).args.add(((CallContext)_localctx).expr);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(74);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(MINUS);
				setState(76);
				((UnaryMinusContext)_localctx).e = expr(11);
				}
				break;
			case 3:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(IF);
				setState(78);
				((IfContext)_localctx).cond = expr(0);
				setState(79);
				match(THEN);
				setState(80);
				((IfContext)_localctx).thenBranch = expr(0);
				setState(81);
				match(ELSE);
				setState(82);
				((IfContext)_localctx).elseBranch = expr(0);
				setState(83);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				((AssignContext)_localctx).name = match(ID);
				setState(86);
				match(ASSIGN);
				setState(87);
				((AssignContext)_localctx).e = expr(6);
				}
				break;
			case 5:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LPAREN);
				setState(89);
				((ParenContext)_localctx).e = expr(0);
				setState(90);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(FLOAT);
				}
				break;
			case 9:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(99);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						((MultDivContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((PlusMinusContext)_localctx).right = expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(105);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						((RelationalContext)_localctx).right = expr(9);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001eq\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u000b\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000"+
		"\n\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\"\b"+
		"\u0001\n\u0001\f\u0001%\t\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00016\b\u0001\u0001\u0001\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t\u0003\u0003\u0003"+
		"I\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003l\b\u0003"+
		"\n\u0003\f\u0003o\t\u0003\u0001\u0003\u0000\u0001\u0006\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0003\u0001\u0000\u0017\u0018\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0019\u001b\u0082\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"8\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006`\u0001"+
		"\u0000\u0000\u0000\b\u000b\u0003\u0002\u0001\u0000\t\u000b\u0003\u0006"+
		"\u0003\u0000\n\b\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000\u0000\u000b"+
		"\f\u0001\u0000\u0000\u0000\f\r\u0005\u000e\u0000\u0000\r\u000f\u0001\u0000"+
		"\u0000\u0000\u000e\n\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0005\t\u0000\u0000\u0016\u0019\u0005\n\u0000\u0000"+
		"\u0017\u0018\u0005\u0010\u0000\u0000\u0018\u001a\u0003\u0006\u0003\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a9\u0001\u0000\u0000\u0000\u001b\u001c\u0005\t\u0000\u0000\u001c"+
		"\u001d\u0005\n\u0000\u0000\u001d&\u0005\u0011\u0000\u0000\u001e#\u0003"+
		"\u0004\u0002\u0000\u001f \u0005\u000f\u0000\u0000 \"\u0003\u0004\u0002"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\u001e\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0012\u0000\u0000)*\u0005"+
		"\u0013\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0014\u0000\u0000"+
		",9\u0001\u0000\u0000\u0000-.\u0005\u0006\u0000\u0000.1\u0005\n\u0000\u0000"+
		"/0\u0005\u0007\u0000\u000002\u0005\n\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0005\u0013\u0000"+
		"\u000046\u0003\u0006\u0003\u000054\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000079\u0005\u0014\u0000\u00008\u0015"+
		"\u0001\u0000\u0000\u00008\u001b\u0001\u0000\u0000\u00008-\u0001\u0000"+
		"\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005\t\u0000\u0000;<\u0005"+
		"\n\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0006\u0003\uffff\uffff"+
		"\u0000>?\u0005\n\u0000\u0000?H\u0005\u0011\u0000\u0000@E\u0003\u0006\u0003"+
		"\u0000AB\u0005\u000f\u0000\u0000BD\u0003\u0006\u0003\u0000CA\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"H@\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000Ja\u0005\u0012\u0000\u0000KL\u0005\u0016\u0000\u0000La\u0003\u0006"+
		"\u0003\u000bMN\u0005\u0002\u0000\u0000NO\u0003\u0006\u0003\u0000OP\u0005"+
		"\u0003\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005\u0004\u0000\u0000"+
		"RS\u0003\u0006\u0003\u0000ST\u0005\u0005\u0000\u0000Ta\u0001\u0000\u0000"+
		"\u0000UV\u0005\n\u0000\u0000VW\u0005\u0010\u0000\u0000Wa\u0003\u0006\u0003"+
		"\u0006XY\u0005\u0011\u0000\u0000YZ\u0003\u0006\u0003\u0000Z[\u0005\u0012"+
		"\u0000\u0000[a\u0001\u0000\u0000\u0000\\a\u0005\n\u0000\u0000]a\u0005"+
		"\u000b\u0000\u0000^a\u0005\f\u0000\u0000_a\u0005\b\u0000\u0000`=\u0001"+
		"\u0000\u0000\u0000`K\u0001\u0000\u0000\u0000`M\u0001\u0000\u0000\u0000"+
		"`U\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000am\u0001\u0000\u0000\u0000bc\n\n\u0000\u0000cd\u0007\u0000"+
		"\u0000\u0000dl\u0003\u0006\u0003\u000bef\n\t\u0000\u0000fg\u0007\u0001"+
		"\u0000\u0000gl\u0003\u0006\u0003\nhi\n\b\u0000\u0000ij\u0007\u0002\u0000"+
		"\u0000jl\u0003\u0006\u0003\tkb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0007\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000\r\n\u0010\u0019#&158EH`km";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}