// Generated from CubexParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubexParser2 extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		APPEND=42, CLASS=11, STAR=31, LRTHR=46, THR=43, WHILE=4, LONW=48, CLSINTF=17, 
		COMMENTS_POND=55, ONW=47, LANGLE=36, GTE=50, LBRACE=29, THING=13, FOR=5, 
		SPACE=56, LTE=49, LPAREN=25, IF=2, LBRACKET=21, RPAREN=26, LTHR=44, SLASH=32, 
		IN=6, COMMENTS=54, COMMA=27, EQUAL=24, RETURN=7, NOTHING=14, PLUS=34, 
		PIPE=40, VAR=19, SUPER=12, RBRACKET=22, RANGLE=37, DOT=41, RTHR=45, INTEGER=20, 
		INEQUAL=52, RBRACE=30, PERCENT=33, DASH=35, ELSE=3, AMPERSAND=39, SEMICOLON=28, 
		BANG=38, ERROR=57, TRUE=15, COLON=23, EQEQUAL=51, ASSIGN=53, INTERFACE=8, 
		TPARA=18, FUN=10, FALSE=16, EXTENDS=9, STRING=1;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", 
		"'interface'", "'extends'", "'fun'", "'class'", "'super'", "'Thing'", 
		"'Nothing'", "'true'", "'false'", "CLSINTF", "TPARA", "VAR", "INTEGER", 
		"'['", "']'", "':'", "'='", "'('", "')'", "','", "';'", "'{'", "'}'", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'!'", "'&'", "'|'", 
		"'.'", "'++'", "'..'", "'<.'", "'.<'", "'<<'", "'...'", "'<..'", "'<='", 
		"'>='", "'=='", "'!='", "':='", "COMMENTS", "COMMENTS_POND", "SPACE", 
		"ERROR"
	};
	public static final int
		RULE_vvc = 0, RULE_kindcontext = 1, RULE_vvt = 2, RULE_typecontext = 3, 
		RULE_paratype = 4, RULE_type = 5, RULE_typescheme = 6, RULE_expr = 7, 
		RULE_exprs = 8, RULE_stat = 9, RULE_stats = 10, RULE_intf = 11, RULE_cls = 12, 
		RULE_program = 13, RULE_top = 14, RULE_functxt = 15, RULE_clsctxt = 16;
	public static final String[] ruleNames = {
		"vvc", "kindcontext", "vvt", "typecontext", "paratype", "type", "typescheme", 
		"expr", "exprs", "stat", "stats", "intf", "cls", "program", "top", "functxt", 
		"clsctxt"
	};

	@Override
	public String getGrammarFileName() { return "CubexParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CubexParser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VvcContext extends ParserRuleContext {
		public CuVvc v;
		public Token vv;
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public VvcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vvc; }
	}

	public final VvcContext vvc() throws RecognitionException {
		VvcContext _localctx = new VvcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vvc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((VvcContext)_localctx).vv = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CLSINTF || _la==VAR) ) {
				((VvcContext)_localctx).vv = (Token)_errHandler.recoverInline(this);
			}
			consume();
			((VvcContext)_localctx).v =  new Vvc((((VvcContext)_localctx).vv!=null?((VvcContext)_localctx).vv.getText():null));
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

	public static class KindcontextContext extends ParserRuleContext {
		public List<String> kc;
		public Token TPARA;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TerminalNode> TPARA() { return getTokens(CubexParser2.TPARA); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode TPARA(int i) {
			return getToken(CubexParser2.TPARA, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public KindcontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kindcontext; }
	}

	public final KindcontextContext kindcontext() throws RecognitionException {
		KindcontextContext _localctx = new KindcontextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kindcontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((KindcontextContext)_localctx).kc =  new ArrayList<String>();
			setState(52);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(38); match(LANGLE);
				setState(49);
				_la = _input.LA(1);
				if (_la==TPARA) {
					{
					setState(39); ((KindcontextContext)_localctx).TPARA = match(TPARA);
					 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(41); match(COMMA);
						setState(42); ((KindcontextContext)_localctx).TPARA = match(TPARA);
						 _localctx.kc.add((((KindcontextContext)_localctx).TPARA!=null?((KindcontextContext)_localctx).TPARA.getText():null)); 
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(51); match(RANGLE);
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

	public static class VvtContext extends ParserRuleContext {
		public CuVvt cu;
		public Token VAR;
		public TypeContext t;
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CubexParser2.COLON, 0); }
		public VvtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vvt; }
	}

	public final VvtContext vvt() throws RecognitionException {
		VvtContext _localctx = new VvtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vvt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); ((VvtContext)_localctx).VAR = match(VAR);
			setState(55); match(COLON);
			setState(56); ((VvtContext)_localctx).t = type(0);
			 ((VvtContext)_localctx).cu =  new Vvt((((VvtContext)_localctx).VAR!=null?((VvtContext)_localctx).VAR.getText():null), ((VvtContext)_localctx).t.t); 
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

	public static class TypecontextContext extends ParserRuleContext {
		public List<CuVvt> tc;
		public VvtContext v;
		public List<VvtContext> vvt() {
			return getRuleContexts(VvtContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public VvtContext vvt(int i) {
			return getRuleContext(VvtContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TypecontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecontext; }
	}

	public final TypecontextContext typecontext() throws RecognitionException {
		TypecontextContext _localctx = new TypecontextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typecontext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TypecontextContext)_localctx).tc =  new ArrayList<CuVvt>(); 
			setState(60); match(LPAREN);
			setState(72);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(61); ((TypecontextContext)_localctx).v = vvt();
				 _localctx.tc.add(((TypecontextContext)_localctx).v.cu); 
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63); match(COMMA);
					setState(64); ((TypecontextContext)_localctx).v = vvt();
					 _localctx.tc.add(((TypecontextContext)_localctx).v.cu); 
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(74); match(RPAREN);
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

	public static class ParatypeContext extends ParserRuleContext {
		public List<CuType> pt;
		public TypeContext t;
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public ParatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paratype; }
	}

	public final ParatypeContext paratype() throws RecognitionException {
		ParatypeContext _localctx = new ParatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paratype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ParatypeContext)_localctx).pt =  new ArrayList<CuType>(); 
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77); match(LANGLE);
				setState(89);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << CLSINTF) | (1L << TPARA))) != 0)) {
					{
					setState(78); ((ParatypeContext)_localctx).t = type(0);
					_localctx.pt.add(((ParatypeContext)_localctx).t.t);
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(80); match(COMMA);
						setState(81); ((ParatypeContext)_localctx).t = type(0);
						_localctx.pt.add(((ParatypeContext)_localctx).t.t);
						}
						}
						setState(88);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(91); match(RANGLE);
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

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public CuType t;
		public TypeContext l;
		public Token v;
		public Token CLSINTF;
		public ParatypeContext p;
		public TypeContext r;
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode TPARA() { return getToken(CubexParser2.TPARA, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode THING() { return getToken(CubexParser2.THING, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode NOTHING() { return getToken(CubexParser2.NOTHING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch (_input.LA(1)) {
			case THING:
			case NOTHING:
			case TPARA:
				{
				setState(95);
				((TypeContext)_localctx).v = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THING) | (1L << NOTHING) | (1L << TPARA))) != 0)) ) {
					((TypeContext)_localctx).v = (Token)_errHandler.recoverInline(this);
				}
				consume();
				((TypeContext)_localctx).t =  (((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getType():0)== TPARA ? new VTypePara((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null)) : new VTopBot((((TypeContext)_localctx).v!=null?((TypeContext)_localctx).v.getText():null));
				}
				break;
			case CLSINTF:
				{
				setState(97); ((TypeContext)_localctx).CLSINTF = match(CLSINTF);
				setState(98); ((TypeContext)_localctx).p = paratype();
				((TypeContext)_localctx).t =  new VClass((((TypeContext)_localctx).CLSINTF!=null?((TypeContext)_localctx).CLSINTF.getText():null), ((TypeContext)_localctx).p.pt);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState, _p);
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(103);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(104); match(AMPERSAND);
					setState(105); ((TypeContext)_localctx).r = type(2);
					((TypeContext)_localctx).t =  new VTypeInter(((TypeContext)_localctx).l.t, ((TypeContext)_localctx).r.t);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class TypeschemeContext extends ParserRuleContext {
		public CuTypeScheme ts;
		public KindcontextContext kc;
		public TypecontextContext tc;
		public TypeContext t;
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CubexParser2.COLON, 0); }
		public TypeschemeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typescheme; }
	}

	public final TypeschemeContext typescheme() throws RecognitionException {
		TypeschemeContext _localctx = new TypeschemeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typescheme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); ((TypeschemeContext)_localctx).kc = kindcontext();
			setState(114); ((TypeschemeContext)_localctx).tc = typecontext();
			setState(115); match(COLON);
			setState(116); ((TypeschemeContext)_localctx).t = type(0);
			((TypeschemeContext)_localctx).ts =  new TypeScheme(((TypeschemeContext)_localctx).kc.kc, ((TypeschemeContext)_localctx).tc.tc, ((TypeschemeContext)_localctx).t.t);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public CuExpr e;
		public ExprContext ex;
		public ExprContext l;
		public Token op;
		public Token VAR;
		public ParatypeContext pt;
		public ExprsContext es;
		public Token CLSINTF;
		public Token INTEGER;
		public Token STRING;
		public ExprContext r;
		public TerminalNode APPEND() { return getToken(CubexParser2.APPEND, 0); }
		public TerminalNode TRUE() { return getToken(CubexParser2.TRUE, 0); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public TerminalNode LANGLE() { return getToken(CubexParser2.LANGLE, 0); }
		public TerminalNode STAR() { return getToken(CubexParser2.STAR, 0); }
		public TerminalNode RBRACKET() { return getToken(CubexParser2.RBRACKET, 0); }
		public TerminalNode AMPERSAND() { return getToken(CubexParser2.AMPERSAND, 0); }
		public TerminalNode RTHR() { return getToken(CubexParser2.RTHR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CubexParser2.PLUS, 0); }
		public TerminalNode LRTHR() { return getToken(CubexParser2.LRTHR, 0); }
		public TerminalNode ONW() { return getToken(CubexParser2.ONW, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(CubexParser2.PIPE, 0); }
		public TerminalNode GTE() { return getToken(CubexParser2.GTE, 0); }
		public TerminalNode PERCENT() { return getToken(CubexParser2.PERCENT, 0); }
		public TerminalNode LTE() { return getToken(CubexParser2.LTE, 0); }
		public TerminalNode BANG() { return getToken(CubexParser2.BANG, 0); }
		public TerminalNode DASH() { return getToken(CubexParser2.DASH, 0); }
		public TerminalNode LBRACKET() { return getToken(CubexParser2.LBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode INEQUAL() { return getToken(CubexParser2.INEQUAL, 0); }
		public TerminalNode EQEQUAL() { return getToken(CubexParser2.EQEQUAL, 0); }
		public TerminalNode RANGLE() { return getToken(CubexParser2.RANGLE, 0); }
		public TerminalNode DOT() { return getToken(CubexParser2.DOT, 0); }
		public TerminalNode LONW() { return getToken(CubexParser2.LONW, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode LTHR() { return getToken(CubexParser2.LTHR, 0); }
		public ParatypeContext paratype() {
			return getRuleContext(ParatypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CubexParser2.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CubexParser2.STRING, 0); }
		public TerminalNode SLASH() { return getToken(CubexParser2.SLASH, 0); }
		public TerminalNode FALSE() { return getToken(CubexParser2.FALSE, 0); }
		public TerminalNode THR() { return getToken(CubexParser2.THR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			switch (_input.LA(1)) {
			case DASH:
			case BANG:
				{
				setState(120);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DASH || _la==BANG) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(121); ((ExprContext)_localctx).ex = expr(15);
				 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == DASH ? new NegativeExpr(((ExprContext)_localctx).ex.e) : new NegateExpr(((ExprContext)_localctx).ex.e); 
				}
				break;
			case LPAREN:
				{
				setState(124); match(LPAREN);
				setState(125); ((ExprContext)_localctx).ex = expr(0);
				setState(126); match(RPAREN);
				((ExprContext)_localctx).e =  ((ExprContext)_localctx).ex.e;
				}
				break;
			case VAR:
				{
				setState(129); ((ExprContext)_localctx).VAR = match(VAR);
				((ExprContext)_localctx).e =  new VvExp((((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null));
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(131); ((ExprContext)_localctx).pt = paratype();
					setState(132); match(LPAREN);
					setState(133); ((ExprContext)_localctx).es = exprs();
					setState(134); match(RPAREN);
					_localctx.e.add(((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
					}
					break;
				}
				}
				break;
			case CLSINTF:
				{
				setState(139); ((ExprContext)_localctx).CLSINTF = match(CLSINTF);
				setState(140); ((ExprContext)_localctx).pt = paratype();
				setState(141); match(LPAREN);
				setState(142); ((ExprContext)_localctx).es = exprs();
				setState(143); match(RPAREN);
				((ExprContext)_localctx).e =  new VcExp((((ExprContext)_localctx).CLSINTF!=null?((ExprContext)_localctx).CLSINTF.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
				}
				break;
			case LBRACKET:
				{
				setState(146); match(LBRACKET);
				setState(147); ((ExprContext)_localctx).es = exprs();
				setState(148); match(RBRACKET);
				((ExprContext)_localctx).e =  new BrkExpr(((ExprContext)_localctx).es.cu);
				}
				break;
			case TRUE:
				{
				setState(151); match(TRUE);
				((ExprContext)_localctx).e =  new CBoolean(true);
				}
				break;
			case FALSE:
				{
				setState(153); match(FALSE);
				((ExprContext)_localctx).e =  new CBoolean(false);
				}
				break;
			case INTEGER:
				{
				setState(155); ((ExprContext)_localctx).INTEGER = match(INTEGER);
				((ExprContext)_localctx).e =  new CInteger((((ExprContext)_localctx).INTEGER!=null?Integer.valueOf(((ExprContext)_localctx).INTEGER.getText()):0));
				}
				break;
			case STRING:
				{
				setState(157); ((ExprContext)_localctx).STRING = match(STRING);
				((ExprContext)_localctx).e =  new CString((((ExprContext)_localctx).STRING!=null?((ExprContext)_localctx).STRING.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(213);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(162);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << SLASH) | (1L << PERCENT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(163); ((ExprContext)_localctx).r = expr(15);
						 ((ExprContext)_localctx).e =  (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == STAR

						                         ? new TimesExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                         : (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == SLASH

						                         ? new DivideExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                         : new ModuloExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(167);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==DASH) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(168); ((ExprContext)_localctx).r = expr(14);
						 ((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == PLUS)

						                       ? new PlusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e)

						                       : new MinusExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(172);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THR) | (1L << LTHR) | (1L << RTHR) | (1L << LRTHR))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(173); ((ExprContext)_localctx).r = expr(13);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == THR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RTHR) ? new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true, false) : new ThroughExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false, false);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(177);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANGLE) | (1L << RANGLE) | (1L << LTE) | (1L << GTE))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(178); ((ExprContext)_localctx).r = expr(11);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LANGLE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == LTE) ? new LessThanExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false) : ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == RANGLE) ? new LessThanExpr(((ExprContext)_localctx).r.e, ((ExprContext)_localctx).l.e, true) : new LessThanExpr(((ExprContext)_localctx).r.e, ((ExprContext)_localctx).l.e, false);
						}
						break;

					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(182);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQEQUAL || _la==INEQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(183); ((ExprContext)_localctx).r = expr(10);
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == EQEQUAL) ? new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, true) : new EqualExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e, false);
						}
						break;

					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(187); match(AMPERSAND);
						setState(188); ((ExprContext)_localctx).r = expr(9);
						 ((ExprContext)_localctx).e =  new AndExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(192); match(PIPE);
						setState(193); ((ExprContext)_localctx).r = expr(8);
						 ((ExprContext)_localctx).e =  new OrExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e); 
						}
						break;

					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(197); match(APPEND);
						setState(198); ((ExprContext)_localctx).r = expr(6);
						((ExprContext)_localctx).e =  new AppExpr(((ExprContext)_localctx).l.e, ((ExprContext)_localctx).r.e);
						}
						break;

					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(202); match(DOT);
						setState(203); ((ExprContext)_localctx).VAR = match(VAR);
						setState(204); ((ExprContext)_localctx).pt = paratype();
						setState(205); match(LPAREN);
						setState(206); ((ExprContext)_localctx).es = exprs();
						setState(207); match(RPAREN);
						((ExprContext)_localctx).e =  new VarExpr(((ExprContext)_localctx).ex.e, (((ExprContext)_localctx).VAR!=null?((ExprContext)_localctx).VAR.getText():null), ((ExprContext)_localctx).pt.pt, ((ExprContext)_localctx).es.cu);
						}
						break;

					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(211);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ONW || _la==LONW) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						((ExprContext)_localctx).e =  ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0) == ONW) ? new OnwardsExpr(((ExprContext)_localctx).ex.e, true) : new OnwardsExpr(((ExprContext)_localctx).ex.e, false);
						}
						break;
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<CuExpr> cu;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExprsContext)_localctx).cu =  new ArrayList<CuExpr>();
			setState(230);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << CLSINTF) | (1L << VAR) | (1L << INTEGER) | (1L << LBRACKET) | (1L << LPAREN) | (1L << DASH) | (1L << BANG))) != 0)) {
				{
				setState(219); ((ExprsContext)_localctx).e = expr(0);
				_localctx.cu.add(((ExprsContext)_localctx).e.e);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221); match(COMMA);
					setState(222); ((ExprsContext)_localctx).e = expr(0);
					_localctx.cu.add(((ExprsContext)_localctx).e.e);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StatContext extends ParserRuleContext {
		public CuStat s;
		public StatsContext ss;
		public Token VAR;
		public ExprContext e;
		public StatContext l;
		public StatContext r;
		public StatContext st;
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(CubexParser2.EQUAL, 0); }
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode IN() { return getToken(CubexParser2.IN, 0); }
		public TerminalNode WHILE() { return getToken(CubexParser2.WHILE, 0); }
		public TerminalNode IF() { return getToken(CubexParser2.IF, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode FOR() { return getToken(CubexParser2.FOR, 0); }
		public TerminalNode ELSE() { return getToken(CubexParser2.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CubexParser2.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(CubexParser2.VAR, 0); }
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TerminalNode RETURN() { return getToken(CubexParser2.RETURN, 0); }
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stat);
		int _la;
		try {
			setState(276);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(LBRACE);
				setState(233); ((StatContext)_localctx).ss = stats();
				setState(234); match(RBRACE);
				((StatContext)_localctx).s =  new Stats(((StatContext)_localctx).ss.cu);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); ((StatContext)_localctx).VAR = match(VAR);
				setState(238); match(ASSIGN);
				setState(239); ((StatContext)_localctx).e = expr(0);
				setState(240); match(SEMICOLON);
				((StatContext)_localctx).s =  new AssignStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); match(IF);
				setState(244); match(LPAREN);
				setState(245); ((StatContext)_localctx).e = expr(0);
				setState(246); match(RPAREN);
				setState(247); ((StatContext)_localctx).l = stat();
				((StatContext)_localctx).s =  new IfStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).l.s);
				setState(253);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(249); match(ELSE);
					setState(250); ((StatContext)_localctx).r = stat();
					_localctx.s.add(((StatContext)_localctx).r.s);
					}
					break;
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(255); match(WHILE);
				setState(256); match(LPAREN);
				setState(257); ((StatContext)_localctx).e = expr(0);
				setState(258); match(RPAREN);
				setState(259); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new WhileStat(((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(262); match(FOR);
				setState(263); match(LPAREN);
				setState(264); ((StatContext)_localctx).VAR = match(VAR);
				setState(265); match(IN);
				setState(266); ((StatContext)_localctx).e = expr(0);
				setState(267); match(RPAREN);
				setState(268); ((StatContext)_localctx).st = stat();
				((StatContext)_localctx).s =  new ForStat((((StatContext)_localctx).VAR!=null?((StatContext)_localctx).VAR.getText():null), ((StatContext)_localctx).e.e, ((StatContext)_localctx).st.s);
				}
				break;
			case RETURN:
			case EQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==RETURN || _la==EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(272); ((StatContext)_localctx).e = expr(0);
				setState(273); match(SEMICOLON);
				((StatContext)_localctx).s =  new ReturnStat(((StatContext)_localctx).e.e);
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

	public static class StatsContext extends ParserRuleContext {
		public List<CuStat> cu;
		public StatContext s;
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((StatsContext)_localctx).cu =  new ArrayList<CuStat>();
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(279); ((StatsContext)_localctx).s = stat();
				_localctx.cu.add(((StatsContext)_localctx).s.s);
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(281); ((StatsContext)_localctx).s = stat();
						_localctx.cu.add(((StatsContext)_localctx).s.s);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
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

	public static class IntfContext extends ParserRuleContext {
		public CuInterface i;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public Token VAR;
		public TypeschemeContext ts;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public TerminalNode INTERFACE() { return getToken(CubexParser2.INTERFACE, 0); }
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public IntfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intf; }
	}

	public final IntfContext intf() throws RecognitionException {
		IntfContext _localctx = new IntfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(INTERFACE);
			setState(292); ((IntfContext)_localctx).CLSINTF = match(CLSINTF);
			setState(293); ((IntfContext)_localctx).p = kindcontext();
			((IntfContext)_localctx).i =  new Intf((((IntfContext)_localctx).CLSINTF!=null?((IntfContext)_localctx).CLSINTF.getText():null), ((IntfContext)_localctx).p.kc);
			setState(312);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(295); match(EXTENDS);
				setState(296); ((IntfContext)_localctx).t = type(0);
				_localctx.i.add(((IntfContext)_localctx).t.t);
				setState(298); match(LBRACE);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(299); match(FUN);
					setState(300); ((IntfContext)_localctx).VAR = match(VAR);
					setState(301); ((IntfContext)_localctx).ts = typescheme();
					setState(302); match(SEMICOLON);
					_localctx.i.add((((IntfContext)_localctx).VAR!=null?((IntfContext)_localctx).VAR.getText():null), ((IntfContext)_localctx).ts.ts);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310); match(RBRACE);
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

	public static class ClsContext extends ParserRuleContext {
		public CuClass c;
		public Token CLSINTF;
		public KindcontextContext pk;
		public TypecontextContext pt;
		public TypeContext t;
		public StatContext s;
		public ExprsContext es;
		public Token VAR;
		public TypeschemeContext ts;
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode LBRACE() { return getToken(CubexParser2.LBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CubexParser2.SEMICOLON, 0); }
		public TerminalNode SUPER() { return getToken(CubexParser2.SUPER, 0); }
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TerminalNode CLSINTF() { return getToken(CubexParser2.CLSINTF, 0); }
		public KindcontextContext kindcontext() {
			return getRuleContext(KindcontextContext.class,0);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode RBRACE() { return getToken(CubexParser2.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(CubexParser2.LPAREN, 0); }
		public TerminalNode CLASS() { return getToken(CubexParser2.CLASS, 0); }
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CubexParser2.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public TerminalNode EXTENDS() { return getToken(CubexParser2.EXTENDS, 0); }
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(CLASS);
			setState(315); ((ClsContext)_localctx).CLSINTF = match(CLSINTF);
			setState(316); ((ClsContext)_localctx).pk = kindcontext();
			setState(317); ((ClsContext)_localctx).pt = typecontext();
			((ClsContext)_localctx).c =  new Cls((((ClsContext)_localctx).CLSINTF!=null?((ClsContext)_localctx).CLSINTF.getText():null), ((ClsContext)_localctx).pk.kc, ((ClsContext)_localctx).pt.tc);
			setState(353);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(319); match(EXTENDS);
				setState(320); ((ClsContext)_localctx).t = type(0);
				_localctx.c.add(((ClsContext)_localctx).t.t);
				setState(322); match(LBRACE);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(323); ((ClsContext)_localctx).s = stat();
					_localctx.c.add(((ClsContext)_localctx).s.s);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				_la = _input.LA(1);
				if (_la==SUPER) {
					{
					setState(331); match(SUPER);
					setState(332); match(LPAREN);
					setState(333); ((ClsContext)_localctx).es = exprs();
					setState(334); match(RPAREN);
					setState(335); match(SEMICOLON);
					_localctx.c.add(((ClsContext)_localctx).es.cu);
					}
				}

				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUN) {
					{
					{
					setState(340); match(FUN);
					setState(341); ((ClsContext)_localctx).VAR = match(VAR);
					setState(342); ((ClsContext)_localctx).ts = typescheme();
					setState(343); ((ClsContext)_localctx).s = stat();
					_localctx.c.add((((ClsContext)_localctx).VAR!=null?((ClsContext)_localctx).VAR.getText():null), ((ClsContext)_localctx).ts.ts, ((ClsContext)_localctx).s.s);
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351); match(RBRACE);
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

	public static class ProgramContext extends ParserRuleContext {
		public CuProgr p;
		public StatContext s;
		public StatsContext ss;
		public ProgramContext pr;
		public Token VAR;
		public TypeschemeContext ts;
		public IntfContext i;
		public ClsContext c;
		public IntfContext intf() {
			return getRuleContext(IntfContext.class,0);
		}
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ClsContext cls() {
			return getRuleContext(ClsContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public List<TerminalNode> FUN() { return getTokens(CubexParser2.FUN); }
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FUN(int i) {
			return getToken(CubexParser2.FUN, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_program);
		int _la;
		try {
			int _alt;
			setState(390);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case FOR:
			case RETURN:
			case VAR:
			case EQUAL:
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new StatPrg(((ProgramContext)_localctx).s.s);
				setState(361);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << INTERFACE) | (1L << FUN) | (1L << CLASS) | (1L << VAR) | (1L << EQUAL) | (1L << LBRACE))) != 0)) {
					{
					setState(357); ((ProgramContext)_localctx).ss = stats();
					setState(358); ((ProgramContext)_localctx).pr = program();
					_localctx.p.add(((ProgramContext)_localctx).ss.cu, ((ProgramContext)_localctx).pr.p);
					}
				}

				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); match(FUN);
				setState(364); ((ProgramContext)_localctx).VAR = match(VAR);
				setState(365); ((ProgramContext)_localctx).ts = typescheme();
				setState(366); ((ProgramContext)_localctx).s = stat();
				((ProgramContext)_localctx).p =  new FunPrg((((ProgramContext)_localctx).VAR!=null?((ProgramContext)_localctx).VAR.getText():null), ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(368); match(FUN);
						setState(369); ((ProgramContext)_localctx).VAR = match(VAR);
						setState(370); ((ProgramContext)_localctx).ts = typescheme();
						setState(371); ((ProgramContext)_localctx).s = stat();
						_localctx.p.add((((ProgramContext)_localctx).VAR!=null?((ProgramContext)_localctx).VAR.getText():null), ((ProgramContext)_localctx).ts.ts, ((ProgramContext)_localctx).s.s);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(379); ((ProgramContext)_localctx).pr = program();
				_localctx.p.add(((ProgramContext)_localctx).pr.p);
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(382); ((ProgramContext)_localctx).i = intf();
				setState(383); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new IntfPrg(((ProgramContext)_localctx).i.i, ((ProgramContext)_localctx).pr.p);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(386); ((ProgramContext)_localctx).c = cls();
				setState(387); ((ProgramContext)_localctx).pr = program();
				((ProgramContext)_localctx).p =  new ClassPrg(((ProgramContext)_localctx).c.c, ((ProgramContext)_localctx).pr.p);
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

	public static class TopContext extends ParserRuleContext {
		public CuTop cu;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CubexParser2.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); ((TopContext)_localctx).p = program();
			setState(393); match(EOF);
			((TopContext)_localctx).cu =  new Top(((TopContext)_localctx).p.p);
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

	public static class FunctxtContext extends ParserRuleContext {
		public CuFunC f;
		public VvcContext v;
		public TypeschemeContext ts;
		public List<VvcContext> vvc() {
			return getRuleContexts(VvcContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public VvcContext vvc(int i) {
			return getRuleContext(VvcContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public FunctxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functxt; }
	}

	public final FunctxtContext functxt() throws RecognitionException {
		FunctxtContext _localctx = new FunctxtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functxt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctxtContext)_localctx).f =  new FunCtxt();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397); match(COMMA);
				setState(398); ((FunctxtContext)_localctx).v = vvc();
				setState(399); ((FunctxtContext)_localctx).ts = typescheme();
				_localctx.f.add(((FunctxtContext)_localctx).v.v, ((FunctxtContext)_localctx).ts.ts);
				}
				}
				setState(406);
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

	public static class ClsctxtContext extends ParserRuleContext {
		public CuClassC c;
		public Token k;
		public Token CLSINTF;
		public KindcontextContext p;
		public TypeContext t;
		public Token VAR;
		public TypeschemeContext ts;
		public TerminalNode VAR(int i) {
			return getToken(CubexParser2.VAR, i);
		}
		public TerminalNode RBRACE(int i) {
			return getToken(CubexParser2.RBRACE, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(CubexParser2.LBRACE); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CubexParser2.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CubexParser2.SEMICOLON, i);
		}
		public TerminalNode CLASS(int i) {
			return getToken(CubexParser2.CLASS, i);
		}
		public List<TerminalNode> CLSINTF() { return getTokens(CubexParser2.CLSINTF); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<KindcontextContext> kindcontext() {
			return getRuleContexts(KindcontextContext.class);
		}
		public List<TypeschemeContext> typescheme() {
			return getRuleContexts(TypeschemeContext.class);
		}
		public TerminalNode INTERFACE(int i) {
			return getToken(CubexParser2.INTERFACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(CubexParser2.RBRACE); }
		public TerminalNode COMMA(int i) {
			return getToken(CubexParser2.COMMA, i);
		}
		public List<TerminalNode> CLASS() { return getTokens(CubexParser2.CLASS); }
		public List<TerminalNode> VAR() { return getTokens(CubexParser2.VAR); }
		public List<TerminalNode> COMMA() { return getTokens(CubexParser2.COMMA); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeschemeContext typescheme(int i) {
			return getRuleContext(TypeschemeContext.class,i);
		}
		public TerminalNode CLSINTF(int i) {
			return getToken(CubexParser2.CLSINTF, i);
		}
		public List<TerminalNode> INTERFACE() { return getTokens(CubexParser2.INTERFACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CubexParser2.LBRACE, i);
		}
		public List<TerminalNode> EXTENDS() { return getTokens(CubexParser2.EXTENDS); }
		public KindcontextContext kindcontext(int i) {
			return getRuleContext(KindcontextContext.class,i);
		}
		public TerminalNode EXTENDS(int i) {
			return getToken(CubexParser2.EXTENDS, i);
		}
		public ClsctxtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsctxt; }
	}

	public final ClsctxtContext clsctxt() throws RecognitionException {
		ClsctxtContext _localctx = new ClsctxtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clsctxt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ClsctxtContext)_localctx).c =  new ClassCtxt();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408); match(COMMA);
				setState(409);
				((ClsctxtContext)_localctx).k = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTERFACE || _la==CLASS) ) {
					((ClsctxtContext)_localctx).k = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(410); ((ClsctxtContext)_localctx).CLSINTF = match(CLSINTF);
				setState(411); ((ClsctxtContext)_localctx).p = kindcontext();
				_localctx.c.add((((ClsctxtContext)_localctx).k!=null?((ClsctxtContext)_localctx).k.getText():null), (((ClsctxtContext)_localctx).CLSINTF!=null?((ClsctxtContext)_localctx).CLSINTF.getText():null), ((ClsctxtContext)_localctx).p.kc);
				setState(429);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(413); match(EXTENDS);
					setState(414); ((ClsctxtContext)_localctx).t = type(0);
					_localctx.c.add(((ClsctxtContext)_localctx).t.t);
					setState(416); match(LBRACE);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VAR) {
						{
						{
						setState(417); ((ClsctxtContext)_localctx).VAR = match(VAR);
						setState(418); ((ClsctxtContext)_localctx).ts = typescheme();
						setState(419); match(SEMICOLON);
						_localctx.c.add((((ClsctxtContext)_localctx).VAR!=null?((ClsctxtContext)_localctx).VAR.getText():null), ((ClsctxtContext)_localctx).ts.ts);
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(427); match(RBRACE);
					}
				}

				}
				}
				setState(435);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return type_sempred((TypeContext)_localctx, predIndex);

		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 14 >= _localctx._p;

		case 2: return 13 >= _localctx._p;

		case 3: return 12 >= _localctx._p;

		case 4: return 10 >= _localctx._p;

		case 5: return 9 >= _localctx._p;

		case 6: return 8 >= _localctx._p;

		case 7: return 7 >= _localctx._p;

		case 8: return 5 >= _localctx._p;

		case 9: return 16 >= _localctx._p;

		case 10: return 11 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u01b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\5\3"+
		"\64\n\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\5\6\\\n\6\3\6\5\6_\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d8"+
		"\n\t\f\t\16\t\u00db\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e4\n\n\f\n"+
		"\16\n\u00e7\13\n\5\n\u00e9\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0100\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0117\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u011f\n\f\f\f\16\f\u0122\13\f\5\f\u0124\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0134\n\r\f\r\16"+
		"\r\u0137\13\r\3\r\3\r\5\r\u013b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0149\n\16\f\16\16\16\u014c\13\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0155\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u015d\n\16\f\16\16\16\u0160\13\16\3\16\3\16\5\16\u0164\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u016c\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0179\n\17\f\17\16\17\u017c\13\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0189\n\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0195\n\21\f\21"+
		"\16\21\u0198\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u01a9\n\22\f\22\16\22\u01ac\13\22\3\22\3"+
		"\22\5\22\u01b0\n\22\7\22\u01b2\n\22\f\22\16\22\u01b5\13\22\3\22\2\23\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\r\4\2\23\23\25\25\4\2\17\20"+
		"\24\24\4\2%%((\3\2!#\3\2$%\3\2-\60\4\2&\'\63\64\3\2\65\66\3\2\61\62\4"+
		"\2\t\t\32\32\4\2\n\n\r\r\u01db\2$\3\2\2\2\4\'\3\2\2\2\68\3\2\2\2\b=\3"+
		"\2\2\2\nN\3\2\2\2\fg\3\2\2\2\16s\3\2\2\2\20\u00a1\3\2\2\2\22\u00dc\3\2"+
		"\2\2\24\u0116\3\2\2\2\26\u0118\3\2\2\2\30\u0125\3\2\2\2\32\u013c\3\2\2"+
		"\2\34\u0188\3\2\2\2\36\u018a\3\2\2\2 \u018e\3\2\2\2\"\u0199\3\2\2\2$%"+
		"\t\2\2\2%&\b\2\1\2&\3\3\2\2\2\'\66\b\3\1\2(\63\7&\2\2)*\7\24\2\2*\60\b"+
		"\3\1\2+,\7\35\2\2,-\7\24\2\2-/\b\3\1\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63)\3\2\2\2\63\64\3\2\2\2"+
		"\64\65\3\2\2\2\65\67\7\'\2\2\66(\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\289"+
		"\7\25\2\29:\7\31\2\2:;\5\f\7\2;<\b\4\1\2<\7\3\2\2\2=>\b\5\1\2>J\7\33\2"+
		"\2?@\5\6\4\2@G\b\5\1\2AB\7\35\2\2BC\5\6\4\2CD\b\5\1\2DF\3\2\2\2EA\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J?\3\2\2\2JK\3\2"+
		"\2\2KL\3\2\2\2LM\7\34\2\2M\t\3\2\2\2N^\b\6\1\2O[\7&\2\2PQ\5\f\7\2QX\b"+
		"\6\1\2RS\7\35\2\2ST\5\f\7\2TU\b\6\1\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV"+
		"\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[P\3\2\2\2[\\\3\2\2\2\\]\3\2\2"+
		"\2]_\7\'\2\2^O\3\2\2\2^_\3\2\2\2_\13\3\2\2\2`a\b\7\1\2ab\t\3\2\2bh\b\7"+
		"\1\2cd\7\23\2\2de\5\n\6\2ef\b\7\1\2fh\3\2\2\2g`\3\2\2\2gc\3\2\2\2hp\3"+
		"\2\2\2ij\6\7\2\3jk\7)\2\2kl\5\f\7\2lm\b\7\1\2mo\3\2\2\2ni\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\5\4\3\2tu\5\b\5\2uv"+
		"\7\31\2\2vw\5\f\7\2wx\b\b\1\2x\17\3\2\2\2yz\b\t\1\2z{\t\4\2\2{|\5\20\t"+
		"\2|}\b\t\1\2}\u00a2\3\2\2\2~\177\7\33\2\2\177\u0080\5\20\t\2\u0080\u0081"+
		"\7\34\2\2\u0081\u0082\b\t\1\2\u0082\u00a2\3\2\2\2\u0083\u0084\7\25\2\2"+
		"\u0084\u008b\b\t\1\2\u0085\u0086\5\n\6\2\u0086\u0087\7\33\2\2\u0087\u0088"+
		"\5\22\n\2\u0088\u0089\7\34\2\2\u0089\u008a\b\t\1\2\u008a\u008c\3\2\2\2"+
		"\u008b\u0085\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u00a2\3\2\2\2\u008d\u008e"+
		"\7\23\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7\33\2\2\u0090\u0091\5\22\n"+
		"\2\u0091\u0092\7\34\2\2\u0092\u0093\b\t\1\2\u0093\u00a2\3\2\2\2\u0094"+
		"\u0095\7\27\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\30\2\2\u0097\u0098"+
		"\b\t\1\2\u0098\u00a2\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u00a2\b\t\1\2"+
		"\u009b\u009c\7\22\2\2\u009c\u00a2\b\t\1\2\u009d\u009e\7\26\2\2\u009e\u00a2"+
		"\b\t\1\2\u009f\u00a0\7\3\2\2\u00a0\u00a2\b\t\1\2\u00a1y\3\2\2\2\u00a1"+
		"~\3\2\2\2\u00a1\u0083\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0094\3\2\2\2"+
		"\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00d9\3\2\2\2\u00a3\u00a4\6\t\3\3\u00a4\u00a5\t\5\2\2\u00a5"+
		"\u00a6\5\20\t\2\u00a6\u00a7\b\t\1\2\u00a7\u00d8\3\2\2\2\u00a8\u00a9\6"+
		"\t\4\3\u00a9\u00aa\t\6\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\b\t\1\2\u00ac"+
		"\u00d8\3\2\2\2\u00ad\u00ae\6\t\5\3\u00ae\u00af\t\7\2\2\u00af\u00b0\5\20"+
		"\t\2\u00b0\u00b1\b\t\1\2\u00b1\u00d8\3\2\2\2\u00b2\u00b3\6\t\6\3\u00b3"+
		"\u00b4\t\b\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6\b\t\1\2\u00b6\u00d8\3"+
		"\2\2\2\u00b7\u00b8\6\t\7\3\u00b8\u00b9\t\t\2\2\u00b9\u00ba\5\20\t\2\u00ba"+
		"\u00bb\b\t\1\2\u00bb\u00d8\3\2\2\2\u00bc\u00bd\6\t\b\3\u00bd\u00be\7)"+
		"\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\b\t\1\2\u00c0\u00d8\3\2\2\2\u00c1"+
		"\u00c2\6\t\t\3\u00c2\u00c3\7*\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\b\t"+
		"\1\2\u00c5\u00d8\3\2\2\2\u00c6\u00c7\6\t\n\3\u00c7\u00c8\7,\2\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00ca\b\t\1\2\u00ca\u00d8\3\2\2\2\u00cb\u00cc\6"+
		"\t\13\3\u00cc\u00cd\7+\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\5\n\6\2\u00cf"+
		"\u00d0\7\33\2\2\u00d0\u00d1\5\22\n\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3"+
		"\b\t\1\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\6\t\f\3\u00d5\u00d6\t\n\2\2\u00d6"+
		"\u00d8\b\t\1\2\u00d7\u00a3\3\2\2\2\u00d7\u00a8\3\2\2\2\u00d7\u00ad\3\2"+
		"\2\2\u00d7\u00b2\3\2\2\2\u00d7\u00b7\3\2\2\2\u00d7\u00bc\3\2\2\2\u00d7"+
		"\u00c1\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00d4\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\21\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e8\b\n\1\2\u00dd\u00de\5\20\t"+
		"\2\u00de\u00e5\b\n\1\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\5\20\t\2\u00e1"+
		"\u00e2\b\n\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\23\3\2\2"+
		"\2\u00ea\u00eb\7\37\2\2\u00eb\u00ec\5\26\f\2\u00ec\u00ed\7 \2\2\u00ed"+
		"\u00ee\b\13\1\2\u00ee\u0117\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f1\7"+
		"\67\2\2\u00f1\u00f2\5\20\t\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\b\13\1\2"+
		"\u00f4\u0117\3\2\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8"+
		"\5\20\t\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00ff\b\13"+
		"\1\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5\24\13\2\u00fd\u00fe\b\13\1\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0117\3\2"+
		"\2\2\u0101\u0102\7\6\2\2\u0102\u0103\7\33\2\2\u0103\u0104\5\20\t\2\u0104"+
		"\u0105\7\34\2\2\u0105\u0106\5\24\13\2\u0106\u0107\b\13\1\2\u0107\u0117"+
		"\3\2\2\2\u0108\u0109\7\7\2\2\u0109\u010a\7\33\2\2\u010a\u010b\7\25\2\2"+
		"\u010b\u010c\7\b\2\2\u010c\u010d\5\20\t\2\u010d\u010e\7\34\2\2\u010e\u010f"+
		"\5\24\13\2\u010f\u0110\b\13\1\2\u0110\u0117\3\2\2\2\u0111\u0112\t\13\2"+
		"\2\u0112\u0113\5\20\t\2\u0113\u0114\7\36\2\2\u0114\u0115\b\13\1\2\u0115"+
		"\u0117\3\2\2\2\u0116\u00ea\3\2\2\2\u0116\u00ef\3\2\2\2\u0116\u00f5\3\2"+
		"\2\2\u0116\u0101\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u0111\3\2\2\2\u0117"+
		"\25\3\2\2\2\u0118\u0123\b\f\1\2\u0119\u011a\5\24\13\2\u011a\u0120\b\f"+
		"\1\2\u011b\u011c\5\24\13\2\u011c\u011d\b\f\1\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0119\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\27\3\2\2\2\u0125\u0126\7\n\2\2\u0126\u0127\7\23\2"+
		"\2\u0127\u0128\5\4\3\2\u0128\u013a\b\r\1\2\u0129\u012a\7\13\2\2\u012a"+
		"\u012b\5\f\7\2\u012b\u012c\b\r\1\2\u012c\u0135\7\37\2\2\u012d\u012e\7"+
		"\f\2\2\u012e\u012f\7\25\2\2\u012f\u0130\5\16\b\2\u0130\u0131\7\36\2\2"+
		"\u0131\u0132\b\r\1\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\7 \2\2\u0139\u013b\3\2\2\2\u013a\u0129\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\31\3\2\2\2\u013c\u013d\7\r\2\2\u013d\u013e"+
		"\7\23\2\2\u013e\u013f\5\4\3\2\u013f\u0140\5\b\5\2\u0140\u0163\b\16\1\2"+
		"\u0141\u0142\7\13\2\2\u0142\u0143\5\f\7\2\u0143\u0144\b\16\1\2\u0144\u014a"+
		"\7\37\2\2\u0145\u0146\5\24\13\2\u0146\u0147\b\16\1\2\u0147\u0149\3\2\2"+
		"\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u0154\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\16\2\2"+
		"\u014e\u014f\7\33\2\2\u014f\u0150\5\22\n\2\u0150\u0151\7\34\2\2\u0151"+
		"\u0152\7\36\2\2\u0152\u0153\b\16\1\2\u0153\u0155\3\2\2\2\u0154\u014d\3"+
		"\2\2\2\u0154\u0155\3\2\2\2\u0155\u015e\3\2\2\2\u0156\u0157\7\f\2\2\u0157"+
		"\u0158\7\25\2\2\u0158\u0159\5\16\b\2\u0159\u015a\5\24\13\2\u015a\u015b"+
		"\b\16\1\2\u015b\u015d\3\2\2\2\u015c\u0156\3\2\2\2\u015d\u0160\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0162\7 \2\2\u0162\u0164\3\2\2\2\u0163\u0141\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\33\3\2\2\2\u0165\u0166\5\24\13\2\u0166\u016b\b\17"+
		"\1\2\u0167\u0168\5\26\f\2\u0168\u0169\5\34\17\2\u0169\u016a\b\17\1\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0189\3\2"+
		"\2\2\u016d\u016e\7\f\2\2\u016e\u016f\7\25\2\2\u016f\u0170\5\16\b\2\u0170"+
		"\u0171\5\24\13\2\u0171\u017a\b\17\1\2\u0172\u0173\7\f\2\2\u0173\u0174"+
		"\7\25\2\2\u0174\u0175\5\16\b\2\u0175\u0176\5\24\13\2\u0176\u0177\b\17"+
		"\1\2\u0177\u0179\3\2\2\2\u0178\u0172\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017d\u017e\5\34\17\2\u017e\u017f\b\17\1\2\u017f\u0189\3\2\2\2\u0180"+
		"\u0181\5\30\r\2\u0181\u0182\5\34\17\2\u0182\u0183\b\17\1\2\u0183\u0189"+
		"\3\2\2\2\u0184\u0185\5\32\16\2\u0185\u0186\5\34\17\2\u0186\u0187\b\17"+
		"\1\2\u0187\u0189\3\2\2\2\u0188\u0165\3\2\2\2\u0188\u016d\3\2\2\2\u0188"+
		"\u0180\3\2\2\2\u0188\u0184\3\2\2\2\u0189\35\3\2\2\2\u018a\u018b\5\34\17"+
		"\2\u018b\u018c\7\2\2\3\u018c\u018d\b\20\1\2\u018d\37\3\2\2\2\u018e\u0196"+
		"\b\21\1\2\u018f\u0190\7\35\2\2\u0190\u0191\5\2\2\2\u0191\u0192\5\16\b"+
		"\2\u0192\u0193\b\21\1\2\u0193\u0195\3\2\2\2\u0194\u018f\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197!\3\2\2\2"+
		"\u0198\u0196\3\2\2\2\u0199\u01b3\b\22\1\2\u019a\u019b\7\35\2\2\u019b\u019c"+
		"\t\f\2\2\u019c\u019d\7\23\2\2\u019d\u019e\5\4\3\2\u019e\u01af\b\22\1\2"+
		"\u019f\u01a0\7\13\2\2\u01a0\u01a1\5\f\7\2\u01a1\u01a2\b\22\1\2\u01a2\u01aa"+
		"\7\37\2\2\u01a3\u01a4\7\25\2\2\u01a4\u01a5\5\16\b\2\u01a5\u01a6\7\36\2"+
		"\2\u01a6\u01a7\b\22\1\2\u01a7\u01a9\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7 \2\2\u01ae\u01b0\3\2\2\2\u01af"+
		"\u019f\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u019a\3\2"+
		"\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"#\3\2\2\2\u01b5\u01b3\3\2\2\2#\60\63\66GJX[^gp\u008b\u00a1\u00d7\u00d9"+
		"\u00e5\u00e8\u00ff\u0116\u0120\u0123\u0135\u013a\u014a\u0154\u015e\u0163"+
		"\u016b\u017a\u0188\u0196\u01aa\u01af\u01b3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}