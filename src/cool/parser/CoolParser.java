// Generated from E:/OneDrive/OneDrive - Universitatea Politehnica Bucuresti/Cursuri/Anul 4/Semestrul 1/CPL/Tema1/src/cool/parser/CoolParser.g4 by ANTLR 4.13.1

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
		ERROR=1, IF=2, THEN=3, ELSE=4, FI=5, CLASS=6, INHERITS=7, WHILE=8, LOOP=9, 
		POOL=10, NOT=11, ISVOID=12, NEW=13, SELF=14, ATSIGN=15, LET=16, IN=17, 
		CASE=18, OF=19, ESAC=20, BOOL=21, TYPE=22, ID=23, INT=24, FLOAT=25, STRING=26, 
		SEMI=27, DOT=28, COLON=29, COMMA=30, ASSIGN=31, TILDE=32, EQUAL=33, LPAREN=34, 
		RPAREN=35, LBRACE=36, RBRACE=37, PLUS=38, MINUS=39, MULT=40, DIV=41, LT=42, 
		LE=43, ARROW=44, LINE_COMMENT=45, BLOCK_COMMENT=46, UNMATCHED_COMMENT=47, 
		EOF_COMMENT=48, INVALID_CHARACTER=49, WS=50;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_feature = 2, RULE_block = 3, 
		RULE_formal = 4, RULE_branch = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "feature", "block", "formal", "branch", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'then'", "'else'", "'fi'", "'class'", "'inherits'", 
			"'while'", "'loop'", "'pool'", "'not'", "'isvoid'", "'new'", "'self'", 
			"'@'", "'let'", "'in'", "'case'", "'of'", "'esac'", null, null, null, 
			null, null, null, "';'", "'.'", "':'", "','", "'<-'", "'~'", "'='", "'('", 
			"')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "IF", "THEN", "ELSE", "FI", "CLASS", "INHERITS", "WHILE", 
			"LOOP", "POOL", "NOT", "ISVOID", "NEW", "SELF", "ATSIGN", "LET", "IN", 
			"CASE", "OF", "ESAC", "BOOL", "TYPE", "ID", "INT", "FLOAT", "STRING", 
			"SEMI", "DOT", "COLON", "COMMA", "ASSIGN", "TILDE", "EQUAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", "DIV", "LT", "LE", 
			"ARROW", "LINE_COMMENT", "BLOCK_COMMENT", "UNMATCHED_COMMENT", "EOF_COMMENT", 
			"INVALID_CHARACTER", "WS"
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
		public DefinitionContext definition;
		public List<DefinitionContext> defns = new ArrayList<DefinitionContext>();
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(14);
				((ProgramContext)_localctx).definition = definition();
				((ProgramContext)_localctx).defns.add(((ProgramContext)_localctx).definition);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
		public Token className;
		public Token inheritedClass;
		public FeatureContext feature;
		public List<FeatureContext> defns = new ArrayList<FeatureContext>();
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
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

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			_localctx = new ClassDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(CLASS);
			setState(23);
			((ClassDefContext)_localctx).className = match(ID);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(24);
				match(INHERITS);
				setState(25);
				((ClassDefContext)_localctx).inheritedClass = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==ID) ) {
					((ClassDefContext)_localctx).inheritedClass = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(28);
			match(LBRACE);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(29);
				((ClassDefContext)_localctx).feature = feature();
				((ClassDefContext)_localctx).defns.add(((ClassDefContext)_localctx).feature);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(RBRACE);
			setState(36);
			match(SEMI);
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
	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefContext extends FeatureContext {
		public Token name;
		public Token type;
		public ExprContext init;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(FeatureContext ctx) { copyFrom(ctx); }
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
	public static class FuncDefContext extends FeatureContext {
		public Token name;
		public FormalContext formal;
		public List<FormalContext> formals = new ArrayList<FormalContext>();
		public Token type;
		public BlockContext bodyBlock;
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		public FuncDefContext(FeatureContext ctx) { copyFrom(ctx); }
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

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((FuncDefContext)_localctx).name = match(ID);
				setState(39);
				match(LPAREN);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(40);
					((FuncDefContext)_localctx).formal = formal();
					((FuncDefContext)_localctx).formals.add(((FuncDefContext)_localctx).formal);
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(41);
						match(COMMA);
						setState(42);
						((FuncDefContext)_localctx).formal = formal();
						((FuncDefContext)_localctx).formals.add(((FuncDefContext)_localctx).formal);
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(50);
				match(RPAREN);
				setState(51);
				match(COLON);
				setState(52);
				((FuncDefContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==ID) ) {
					((FuncDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(53);
				match(LBRACE);
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(54);
					((FuncDefContext)_localctx).bodyBlock = block();
					}
					break;
				case IF:
				case WHILE:
				case NOT:
				case ISVOID:
				case NEW:
				case SELF:
				case LET:
				case CASE:
				case BOOL:
				case ID:
				case INT:
				case STRING:
				case TILDE:
				case LPAREN:
					{
					setState(55);
					((FuncDefContext)_localctx).body = expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58);
				match(RBRACE);
				setState(59);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((VarDefContext)_localctx).name = match(ID);
				setState(62);
				match(COLON);
				setState(63);
				((VarDefContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TYPE || _la==ID) ) {
					((VarDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(64);
					match(ASSIGN);
					setState(65);
					((VarDefContext)_localctx).init = expr(0);
					}
				}

				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(68);
					match(SEMI);
					}
				}

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
	public static class BlockContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> exprs = new ArrayList<ExprContext>();
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LBRACE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21569566980L) != 0)) {
				{
				{
				setState(74);
				((BlockContext)_localctx).expr = expr(0);
				((BlockContext)_localctx).exprs.add(((BlockContext)_localctx).expr);
				setState(75);
				match(SEMI);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RBRACE);
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
		public Token name;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
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
		enterRule(_localctx, 8, RULE_formal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((FormalContext)_localctx).name = match(ID);
			setState(85);
			match(COLON);
			setState(86);
			((FormalContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==ID) ) {
				((FormalContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BranchContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public ExprContext e;
		public BlockContext blockBody;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ARROW() { return getToken(CoolParser.ARROW, 0); }
		public TerminalNode SEMI() { return getToken(CoolParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((BranchContext)_localctx).name = match(ID);
			setState(89);
			match(COLON);
			setState(90);
			((BranchContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==ID) ) {
				((BranchContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(91);
			match(ARROW);
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case NOT:
			case ISVOID:
			case NEW:
			case SELF:
			case LET:
			case CASE:
			case BOOL:
			case ID:
			case INT:
			case STRING:
			case TILDE:
			case LPAREN:
				{
				setState(92);
				((BranchContext)_localctx).e = expr(0);
				}
				break;
			case LBRACE:
				{
				setState(93);
				((BranchContext)_localctx).blockBody = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(96);
			match(SEMI);
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
	public static class DispatchContext extends ExprContext {
		public ExprContext caller;
		public Token specifiedClass;
		public Token called;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ATSIGN() { return getToken(CoolParser.ATSIGN, 0); }
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitDispatch(this);
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
	public static class IsvoidContext extends ExprContext {
		public ExprContext e;
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjContext extends ExprContext {
		public Token name;
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public NewObjContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNewObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNewObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNewObj(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ExprContext {
		public ExprContext cond;
		public ExprContext e;
		public BlockContext blockBody;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhile(this);
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
	public static class StrContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitStr(this);
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
	public static class NegateContext extends ExprContext {
		public ExprContext e;
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext e;
		public TerminalNode TILDE() { return getToken(CoolParser.TILDE, 0); }
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
	public static class SelfContext extends ExprContext {
		public TerminalNode SELF() { return getToken(CoolParser.SELF, 0); }
		public SelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExprContext {
		public FeatureContext feature;
		public List<FeatureContext> vars = new ArrayList<FeatureContext>();
		public ExprContext e;
		public BlockContext blockBody;
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLet(this);
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
	public static class CaseContext extends ExprContext {
		public ExprContext cond;
		public BranchContext branch;
		public List<BranchContext> branches = new ArrayList<BranchContext>();
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(99);
				match(LPAREN);
				setState(100);
				((ParenContext)_localctx).e = expr(0);
				setState(101);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(TILDE);
				setState(104);
				((UnaryMinusContext)_localctx).e = expr(17);
				}
				break;
			case 3:
				{
				_localctx = new NewObjContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(NEW);
				setState(106);
				((NewObjContext)_localctx).name = match(ID);
				}
				break;
			case 4:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(ISVOID);
				setState(108);
				((IsvoidContext)_localctx).e = expr(15);
				}
				break;
			case 5:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(IF);
				setState(110);
				((IfContext)_localctx).cond = expr(0);
				setState(111);
				match(THEN);
				setState(112);
				((IfContext)_localctx).thenBranch = expr(0);
				setState(113);
				match(ELSE);
				setState(114);
				((IfContext)_localctx).elseBranch = expr(0);
				setState(115);
				match(FI);
				}
				break;
			case 6:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(WHILE);
				setState(118);
				((WhileContext)_localctx).cond = expr(0);
				setState(119);
				match(LOOP);
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(120);
					match(LBRACE);
					}
					break;
				}
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case NOT:
				case ISVOID:
				case NEW:
				case SELF:
				case LET:
				case CASE:
				case BOOL:
				case ID:
				case INT:
				case STRING:
				case TILDE:
				case LPAREN:
					{
					setState(123);
					((WhileContext)_localctx).e = expr(0);
					}
					break;
				case LBRACE:
					{
					setState(124);
					((WhileContext)_localctx).blockBody = block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RBRACE) {
					{
					setState(127);
					match(RBRACE);
					}
				}

				setState(130);
				match(POOL);
				}
				break;
			case 7:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(LET);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(133);
					((LetContext)_localctx).feature = feature();
					((LetContext)_localctx).vars.add(((LetContext)_localctx).feature);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(134);
						match(COMMA);
						setState(135);
						((LetContext)_localctx).feature = feature();
						((LetContext)_localctx).vars.add(((LetContext)_localctx).feature);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(143);
				match(IN);
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(144);
					match(LBRACE);
					}
					break;
				}
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case WHILE:
				case NOT:
				case ISVOID:
				case NEW:
				case SELF:
				case LET:
				case CASE:
				case BOOL:
				case ID:
				case INT:
				case STRING:
				case TILDE:
				case LPAREN:
					{
					setState(147);
					((LetContext)_localctx).e = expr(0);
					}
					break;
				case LBRACE:
					{
					setState(148);
					((LetContext)_localctx).blockBody = block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(151);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(CASE);
				setState(155);
				((CaseContext)_localctx).cond = expr(0);
				setState(156);
				match(OF);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					((CaseContext)_localctx).branch = branch();
					((CaseContext)_localctx).branches.add(((CaseContext)_localctx).branch);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(162);
				match(ESAC);
				}
				break;
			case 9:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(NOT);
				setState(165);
				((NegateContext)_localctx).e = expr(7);
				}
				break;
			case 10:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				((AssignContext)_localctx).name = match(ID);
				setState(167);
				match(ASSIGN);
				setState(168);
				((AssignContext)_localctx).e = expr(6);
				}
				break;
			case 11:
				{
				_localctx = new SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(SELF);
				}
				break;
			case 12:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(177);
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
						setState(178);
						((MultDivContext)_localctx).right = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						((PlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
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
						setState(181);
						((PlusMinusContext)_localctx).right = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						((RelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13202729467904L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						((RelationalContext)_localctx).right = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new DispatchContext(new ExprContext(_parentctx, _parentState));
						((DispatchContext)_localctx).caller = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSIGN) {
							{
							setState(186);
							match(ATSIGN);
							setState(187);
							((DispatchContext)_localctx).specifiedClass = match(ID);
							}
						}

						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOT) {
							{
							setState(190);
							match(DOT);
							setState(191);
							((DispatchContext)_localctx).called = match(ID);
							}
						}

						setState(194);
						match(LPAREN);
						setState(203);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21569566980L) != 0)) {
							{
							setState(195);
							((DispatchContext)_localctx).expr = expr(0);
							((DispatchContext)_localctx).args.add(((DispatchContext)_localctx).expr);
							setState(200);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(196);
								match(COMMA);
								setState(197);
								((DispatchContext)_localctx).expr = expr(0);
								((DispatchContext)_localctx).args.add(((DispatchContext)_localctx).expr);
								}
								}
								setState(202);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(205);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002\u0003"+
		"\u00021\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002C\b\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0003\u0002H\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003N\b\u0003"+
		"\n\u0003\f\u0003Q\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"z\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0081\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c\t\u0006"+
		"\u0003\u0006\u008e\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0092\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0096\b\u0006\u0001\u0006\u0003"+
		"\u0006\u0099\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u009f\b\u0006\u000b\u0006\f\u0006\u00a0\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00af\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00bd\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c1\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c7"+
		"\b\u0006\n\u0006\f\u0006\u00ca\t\u0006\u0003\u0006\u00cc\b\u0006\u0001"+
		"\u0006\u0005\u0006\u00cf\b\u0006\n\u0006\f\u0006\u00d2\t\u0006\u0001\u0006"+
		"\u0000\u0001\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000"+
		"\u0016\u0017\u0001\u0000()\u0001\u0000&\'\u0002\u0000!!*+\u00f6\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004"+
		"G\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bT\u0001\u0000"+
		"\u0000\u0000\nX\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001"+
		"\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000"+
		"\u0017\u001a\u0005\u0017\u0000\u0000\u0018\u0019\u0005\u0007\u0000\u0000"+
		"\u0019\u001b\u0007\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c \u0005$\u0000\u0000\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d"+
		"\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000#$\u0005%\u0000\u0000$%\u0005\u001b\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u0017\u0000\u0000\'0\u0005\""+
		"\u0000\u0000(-\u0003\b\u0004\u0000)*\u0005\u001e\u0000\u0000*,\u0003\b"+
		"\u0004\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0005#\u0000\u000034\u0005\u001d\u0000"+
		"\u000045\u0007\u0000\u0000\u000058\u0005$\u0000\u000069\u0003\u0006\u0003"+
		"\u000079\u0003\f\u0006\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0005%\u0000\u0000;<\u0005\u001b\u0000"+
		"\u0000<H\u0001\u0000\u0000\u0000=>\u0005\u0017\u0000\u0000>?\u0005\u001d"+
		"\u0000\u0000?B\u0007\u0000\u0000\u0000@A\u0005\u001f\u0000\u0000AC\u0003"+
		"\f\u0006\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001"+
		"\u0000\u0000\u0000DF\u0005\u001b\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000G&\u0001\u0000\u0000"+
		"\u0000G=\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IO\u0005"+
		"$\u0000\u0000JK\u0003\f\u0006\u0000KL\u0005\u001b\u0000\u0000LN\u0001"+
		"\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000RS\u0005%\u0000\u0000S\u0007\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0017\u0000\u0000UV\u0005\u001d\u0000\u0000VW\u0007"+
		"\u0000\u0000\u0000W\t\u0001\u0000\u0000\u0000XY\u0005\u0017\u0000\u0000"+
		"YZ\u0005\u001d\u0000\u0000Z[\u0007\u0000\u0000\u0000[^\u0005,\u0000\u0000"+
		"\\_\u0003\f\u0006\u0000]_\u0003\u0006\u0003\u0000^\\\u0001\u0000\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\u001b"+
		"\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0006\u0006\uffff\uffff"+
		"\u0000cd\u0005\"\u0000\u0000de\u0003\f\u0006\u0000ef\u0005#\u0000\u0000"+
		"f\u00af\u0001\u0000\u0000\u0000gh\u0005 \u0000\u0000h\u00af\u0003\f\u0006"+
		"\u0011ij\u0005\r\u0000\u0000j\u00af\u0005\u0017\u0000\u0000kl\u0005\f"+
		"\u0000\u0000l\u00af\u0003\f\u0006\u000fmn\u0005\u0002\u0000\u0000no\u0003"+
		"\f\u0006\u0000op\u0005\u0003\u0000\u0000pq\u0003\f\u0006\u0000qr\u0005"+
		"\u0004\u0000\u0000rs\u0003\f\u0006\u0000st\u0005\u0005\u0000\u0000t\u00af"+
		"\u0001\u0000\u0000\u0000uv\u0005\b\u0000\u0000vw\u0003\f\u0006\u0000w"+
		"y\u0005\t\u0000\u0000xz\u0005$\u0000\u0000yx\u0001\u0000\u0000\u0000y"+
		"z\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{~\u0003\f\u0006\u0000"+
		"|~\u0003\u0006\u0003\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u0080\u0001\u0000\u0000\u0000\u007f\u0081\u0005%\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083\u00af"+
		"\u0001\u0000\u0000\u0000\u0084\u008d\u0005\u0010\u0000\u0000\u0085\u008a"+
		"\u0003\u0004\u0002\u0000\u0086\u0087\u0005\u001e\u0000\u0000\u0087\u0089"+
		"\u0003\u0004\u0002\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0005\u0011\u0000\u0000\u0090\u0092\u0005$\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0003\f\u0006\u0000\u0094\u0096\u0003\u0006"+
		"\u0003\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0099\u0005%\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u00af\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0012\u0000"+
		"\u0000\u009b\u009c\u0003\f\u0006\u0000\u009c\u009e\u0005\u0013\u0000\u0000"+
		"\u009d\u009f\u0003\n\u0005\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0014\u0000\u0000\u00a3\u00af\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u000b\u0000\u0000\u00a5\u00af\u0003\f\u0006\u0007\u00a6\u00a7"+
		"\u0005\u0017\u0000\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00af"+
		"\u0003\f\u0006\u0006\u00a9\u00af\u0005\u000e\u0000\u0000\u00aa\u00af\u0005"+
		"\u0017\u0000\u0000\u00ab\u00af\u0005\u0018\u0000\u0000\u00ac\u00af\u0005"+
		"\u001a\u0000\u0000\u00ad\u00af\u0005\u0015\u0000\u0000\u00aeb\u0001\u0000"+
		"\u0000\u0000\u00aeg\u0001\u0000\u0000\u0000\u00aei\u0001\u0000\u0000\u0000"+
		"\u00aek\u0001\u0000\u0000\u0000\u00aem\u0001\u0000\u0000\u0000\u00aeu"+
		"\u0001\u0000\u0000\u0000\u00ae\u0084\u0001\u0000\u0000\u0000\u00ae\u009a"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a4\u0001\u0000\u0000\u0000\u00ae\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00ae\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00d0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\n\u000e\u0000\u0000\u00b1\u00b2\u0007"+
		"\u0001\u0000\u0000\u00b2\u00cf\u0003\f\u0006\u000f\u00b3\u00b4\n\r\u0000"+
		"\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000\u00b5\u00cf\u0003\f\u0006\u000e"+
		"\u00b6\u00b7\n\f\u0000\u0000\u00b7\u00b8\u0007\u0003\u0000\u0000\u00b8"+
		"\u00cf\u0003\f\u0006\r\u00b9\u00bc\n\u0013\u0000\u0000\u00ba\u00bb\u0005"+
		"\u000f\u0000\u0000\u00bb\u00bd\u0005\u0017\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u001c\u0000\u0000\u00bf\u00c1\u0005"+
		"\u0017\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00cb\u0005"+
		"\"\u0000\u0000\u00c3\u00c8\u0003\f\u0006\u0000\u00c4\u00c5\u0005\u001e"+
		"\u0000\u0000\u00c5\u00c7\u0003\f\u0006\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0005#\u0000\u0000\u00ce\u00b0\u0001\u0000\u0000\u0000"+
		"\u00ce\u00b3\u0001\u0000\u0000\u0000\u00ce\u00b6\u0001\u0000\u0000\u0000"+
		"\u00ce\u00b9\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\r\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u001b"+
		"\u0011\u001a -08BEGO^y}\u0080\u008a\u008d\u0091\u0095\u0098\u00a0\u00ae"+
		"\u00bc\u00c0\u00c8\u00cb\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}