// Generated from me/gramatyka.g4 by ANTLR 4.7
package me;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatykaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANDAND=1, OROR=2, LNO=3, PNO=4, LNK=5, PNK=6, PRIVATE=7, PUBLIC=8, PROTECTED=9, 
		EQUAL=10, LOWER=11, GREATER=12, LOWERE=13, GREATERE=14, ASSIGN=15, PLUS=16, 
		MINUS=17, MUL=18, DIV=19, INCLEMENT=20, IF=21, ELSEIF=22, ELSE=23, WHILE=24, 
		RETURN=25, FOR=26, SEMICOL=27, FORSEMICOL=28, DOT=29, COMMA=30, CD=31, 
		INT=32, STRING=33, DOUBLE=34, FLOAT=35, BOOL=36, PACKAGE=37, IMPORT=38, 
		BREAK=39, IDENT=40, WORD=41, LOWERCASE=42, DIGIT=43, NON_ZERO_DIGIT=44, 
		NUMBER=45, WS=46;
	public static final int
		RULE_type = 0, RULE_identifier = 1, RULE_semicol = 2, RULE_number = 3, 
		RULE_packag_ex = 4, RULE_import_ex = 5, RULE_break_ex = 6, RULE_operator = 7, 
		RULE_comperator = 8, RULE_and_operator = 9, RULE_or_operator = 10, RULE_logic_operator = 11, 
		RULE_string = 12, RULE_operand = 13, RULE_operation = 14, RULE_logic_operation_n = 15, 
		RULE_logic_operation = 16, RULE_assign = 17, RULE_assign2 = 18, RULE_forassign = 19, 
		RULE_new_if = 20, RULE_elseif = 21, RULE_else_ex = 22, RULE_instructions = 23, 
		RULE_instruction = 24, RULE_inclement = 25, RULE_for_ex = 26, RULE_return_ex = 27, 
		RULE_program = 28;
	public static final String[] ruleNames = {
		"type", "identifier", "semicol", "number", "packag_ex", "import_ex", "break_ex", 
		"operator", "comperator", "and_operator", "or_operator", "logic_operator", 
		"string", "operand", "operation", "logic_operation_n", "logic_operation", 
		"assign", "assign2", "forassign", "new_if", "elseif", "else_ex", "instructions", 
		"instruction", "inclement", "for_ex", "return_ex", "program"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'||'", "'('", "')'", "'{\n'", "'}'", "'private '", "'public '", 
		"'protected '", "'=='", "'<'", "'>'", "'<='", "'>='", "'='", "'+'", "'-'", 
		"'*'", "'/'", "'++'", "'if'", "'elseif'", "'else'", "'while'", "'return'", 
		"'for'", "';\n'", "'; '", "'.'", "','", "'\"'", "'int'", "'String'", "'double'", 
		"'float'", "'boolean'", "'package'", "'import'", "'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANDAND", "OROR", "LNO", "PNO", "LNK", "PNK", "PRIVATE", "PUBLIC", 
		"PROTECTED", "EQUAL", "LOWER", "GREATER", "LOWERE", "GREATERE", "ASSIGN", 
		"PLUS", "MINUS", "MUL", "DIV", "INCLEMENT", "IF", "ELSEIF", "ELSE", "WHILE", 
		"RETURN", "FOR", "SEMICOL", "FORSEMICOL", "DOT", "COMMA", "CD", "INT", 
		"STRING", "DOUBLE", "FLOAT", "BOOL", "PACKAGE", "IMPORT", "BREAK", "IDENT", 
		"WORD", "LOWERCASE", "DIGIT", "NON_ZERO_DIGIT", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "gramatyka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatykaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramatykaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(gramatykaParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(gramatykaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(gramatykaParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(gramatykaParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(gramatykaParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENT);
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

	public static class SemicolContext extends ParserRuleContext {
		public TerminalNode SEMICOL() { return getToken(gramatykaParser.SEMICOL, 0); }
		public SemicolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterSemicol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitSemicol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitSemicol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolContext semicol() throws RecognitionException {
		SemicolContext _localctx = new SemicolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_semicol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SEMICOL);
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
		public TerminalNode NUMBER() { return getToken(gramatykaParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(NUMBER);
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

	public static class Packag_exContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(gramatykaParser.PACKAGE, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public Packag_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packag_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterPackag_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitPackag_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitPackag_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Packag_exContext packag_ex() throws RecognitionException {
		Packag_exContext _localctx = new Packag_exContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packag_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PACKAGE);
			setState(67);
			operand();
			setState(68);
			semicol();
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

	public static class Import_exContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(gramatykaParser.IMPORT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public Import_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterImport_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitImport_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitImport_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_exContext import_ex() throws RecognitionException {
		Import_exContext _localctx = new Import_exContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IMPORT);
			setState(71);
			operand();
			setState(72);
			semicol();
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

	public static class Break_exContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(gramatykaParser.BREAK, 0); }
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public Break_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterBreak_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitBreak_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitBreak_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_exContext break_ex() throws RecognitionException {
		Break_exContext _localctx = new Break_exContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_break_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(BREAK);
			setState(75);
			semicol();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(gramatykaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gramatykaParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(gramatykaParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(gramatykaParser.MUL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class ComperatorContext extends ParserRuleContext {
		public TerminalNode LOWER() { return getToken(gramatykaParser.LOWER, 0); }
		public TerminalNode LOWERE() { return getToken(gramatykaParser.LOWERE, 0); }
		public TerminalNode GREATER() { return getToken(gramatykaParser.GREATER, 0); }
		public TerminalNode GREATERE() { return getToken(gramatykaParser.GREATERE, 0); }
		public TerminalNode EQUAL() { return getToken(gramatykaParser.EQUAL, 0); }
		public ComperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterComperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitComperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitComperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComperatorContext comperator() throws RecognitionException {
		ComperatorContext _localctx = new ComperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LOWER) | (1L << GREATER) | (1L << LOWERE) | (1L << GREATERE))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class And_operatorContext extends ParserRuleContext {
		public TerminalNode ANDAND() { return getToken(gramatykaParser.ANDAND, 0); }
		public And_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterAnd_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitAnd_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitAnd_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_operatorContext and_operator() throws RecognitionException {
		And_operatorContext _localctx = new And_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_and_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ANDAND);
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

	public static class Or_operatorContext extends ParserRuleContext {
		public TerminalNode OROR() { return getToken(gramatykaParser.OROR, 0); }
		public Or_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_operatorContext or_operator() throws RecognitionException {
		Or_operatorContext _localctx = new Or_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_or_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(OROR);
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

	public static class Logic_operatorContext extends ParserRuleContext {
		public And_operatorContext and_operator() {
			return getRuleContext(And_operatorContext.class,0);
		}
		public Or_operatorContext or_operator() {
			return getRuleContext(Or_operatorContext.class,0);
		}
		public Logic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operatorContext logic_operator() throws RecognitionException {
		Logic_operatorContext _localctx = new Logic_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logic_operator);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				and_operator();
				}
				break;
			case OROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				or_operator();
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> CD() { return getTokens(gramatykaParser.CD); }
		public TerminalNode CD(int i) {
			return getToken(gramatykaParser.CD, i);
		}
		public TerminalNode IDENT() { return getToken(gramatykaParser.IDENT, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CD);
			setState(90);
			match(IDENT);
			setState(91);
			match(CD);
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

	public static class OperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operand);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				number();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				identifier();
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			operand();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(98);
				operator();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(104);
				operand();
				}
				break;
			case 2:
				{
				setState(105);
				operation();
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

	public static class Logic_operation_nContext extends ParserRuleContext {
		public TerminalNode LNO() { return getToken(gramatykaParser.LNO, 0); }
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public TerminalNode PNO() { return getToken(gramatykaParser.PNO, 0); }
		public Logic_operation_nContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operation_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_operation_n(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_operation_n(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogic_operation_n(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operation_nContext logic_operation_n() throws RecognitionException {
		Logic_operation_nContext _localctx = new Logic_operation_nContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logic_operation_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LNO);
			setState(109);
			logic_operation();
			setState(110);
			match(PNO);
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

	public static class Logic_operationContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<Logic_operation_nContext> logic_operation_n() {
			return getRuleContexts(Logic_operation_nContext.class);
		}
		public Logic_operation_nContext logic_operation_n(int i) {
			return getRuleContext(Logic_operation_nContext.class,i);
		}
		public Logic_operatorContext logic_operator() {
			return getRuleContext(Logic_operatorContext.class,0);
		}
		public ComperatorContext comperator() {
			return getRuleContext(ComperatorContext.class,0);
		}
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public Logic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterLogic_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitLogic_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitLogic_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_operationContext logic_operation() throws RecognitionException {
		Logic_operationContext _localctx = new Logic_operationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case NUMBER:
				{
				setState(112);
				operand();
				}
				break;
			case LNO:
				{
				setState(113);
				logic_operation_n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDAND:
			case OROR:
				{
				setState(116);
				logic_operator();
				}
				break;
			case EQUAL:
			case LOWER:
			case GREATER:
			case LOWERE:
			case GREATERE:
				{
				setState(117);
				comperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(120);
				operand();
				}
				break;
			case 2:
				{
				setState(121);
				logic_operation();
				}
				break;
			case 3:
				{
				setState(122);
				logic_operation_n();
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

	public static class AssignContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gramatykaParser.ASSIGN, 0); }
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WORD() { return getToken(gramatykaParser.WORD, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			type();
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(126);
				identifier();
				}
				break;
			case WORD:
				{
				setState(127);
				match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(130);
			match(ASSIGN);
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(131);
				operation();
				}
				break;
			case 2:
				{
				setState(132);
				operand();
				}
				break;
			}
			setState(135);
			semicol();
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

	public static class Assign2Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(gramatykaParser.ASSIGN, 0); }
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WORD() { return getToken(gramatykaParser.WORD, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Assign2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterAssign2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitAssign2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitAssign2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign2Context assign2() throws RecognitionException {
		Assign2Context _localctx = new Assign2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(137);
				identifier();
				}
				break;
			case WORD:
				{
				setState(138);
				match(WORD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(141);
			match(ASSIGN);
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(142);
				operation();
				}
				break;
			case 2:
				{
				setState(143);
				operand();
				}
				break;
			}
			setState(146);
			semicol();
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

	public static class ForassignContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gramatykaParser.ASSIGN, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ForassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterForassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitForassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitForassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForassignContext forassign() throws RecognitionException {
		ForassignContext _localctx = new ForassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type();
			setState(149);
			identifier();
			setState(150);
			match(ASSIGN);
			setState(151);
			operand();
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

	public static class New_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramatykaParser.IF, 0); }
		public TerminalNode LNO() { return getToken(gramatykaParser.LNO, 0); }
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public TerminalNode PNO() { return getToken(gramatykaParser.PNO, 0); }
		public TerminalNode LNK() { return getToken(gramatykaParser.LNK, 0); }
		public TerminalNode PNK() { return getToken(gramatykaParser.PNK, 0); }
		public List<Break_exContext> break_ex() {
			return getRuleContexts(Break_exContext.class);
		}
		public Break_exContext break_ex(int i) {
			return getRuleContext(Break_exContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Return_exContext> return_ex() {
			return getRuleContexts(Return_exContext.class);
		}
		public Return_exContext return_ex(int i) {
			return getRuleContext(Return_exContext.class,i);
		}
		public List<Assign2Context> assign2() {
			return getRuleContexts(Assign2Context.class);
		}
		public Assign2Context assign2(int i) {
			return getRuleContext(Assign2Context.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public List<Else_exContext> else_ex() {
			return getRuleContexts(Else_exContext.class);
		}
		public Else_exContext else_ex(int i) {
			return getRuleContext(Else_exContext.class,i);
		}
		public New_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterNew_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitNew_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitNew_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_ifContext new_if() throws RecognitionException {
		New_ifContext _localctx = new New_ifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_new_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(LNO);
			setState(155);
			logic_operation();
			setState(156);
			match(PNO);
			setState(157);
			match(LNK);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << BREAK) | (1L << IDENT) | (1L << WORD) | (1L << NUMBER))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(158);
					break_ex();
					}
					break;
				case 2:
					{
					setState(159);
					operation();
					}
					break;
				case 3:
					{
					setState(160);
					return_ex();
					}
					break;
				case 4:
					{
					setState(161);
					assign2();
					}
					break;
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(PNK);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF || _la==ELSE) {
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSEIF:
					{
					setState(168);
					elseif();
					}
					break;
				case ELSE:
					{
					setState(169);
					else_ex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(gramatykaParser.ELSEIF, 0); }
		public TerminalNode LNO() { return getToken(gramatykaParser.LNO, 0); }
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public TerminalNode PNO() { return getToken(gramatykaParser.PNO, 0); }
		public TerminalNode LNK() { return getToken(gramatykaParser.LNK, 0); }
		public TerminalNode PNK() { return getToken(gramatykaParser.PNK, 0); }
		public List<Break_exContext> break_ex() {
			return getRuleContexts(Break_exContext.class);
		}
		public Break_exContext break_ex(int i) {
			return getRuleContext(Break_exContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Return_exContext> return_ex() {
			return getRuleContexts(Return_exContext.class);
		}
		public Return_exContext return_ex(int i) {
			return getRuleContext(Return_exContext.class,i);
		}
		public List<Assign2Context> assign2() {
			return getRuleContexts(Assign2Context.class);
		}
		public Assign2Context assign2(int i) {
			return getRuleContext(Assign2Context.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ELSEIF);
			setState(176);
			match(LNO);
			setState(177);
			logic_operation();
			setState(178);
			match(PNO);
			setState(179);
			match(LNK);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << BREAK) | (1L << IDENT) | (1L << WORD) | (1L << NUMBER))) != 0)) {
				{
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(180);
					break_ex();
					}
					break;
				case 2:
					{
					setState(181);
					operation();
					}
					break;
				case 3:
					{
					setState(182);
					return_ex();
					}
					break;
				case 4:
					{
					setState(183);
					assign2();
					}
					break;
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(PNK);
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

	public static class Else_exContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(gramatykaParser.ELSE, 0); }
		public TerminalNode LNK() { return getToken(gramatykaParser.LNK, 0); }
		public TerminalNode PNK() { return getToken(gramatykaParser.PNK, 0); }
		public List<Break_exContext> break_ex() {
			return getRuleContexts(Break_exContext.class);
		}
		public Break_exContext break_ex(int i) {
			return getRuleContext(Break_exContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<Return_exContext> return_ex() {
			return getRuleContexts(Return_exContext.class);
		}
		public Return_exContext return_ex(int i) {
			return getRuleContext(Return_exContext.class,i);
		}
		public List<Assign2Context> assign2() {
			return getRuleContexts(Assign2Context.class);
		}
		public Assign2Context assign2(int i) {
			return getRuleContext(Assign2Context.class,i);
		}
		public Else_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterElse_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitElse_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitElse_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_exContext else_ex() throws RecognitionException {
		Else_exContext _localctx = new Else_exContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_ex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ELSE);
			setState(192);
			match(LNK);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << BREAK) | (1L << IDENT) | (1L << WORD) | (1L << NUMBER))) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(193);
					break_ex();
					}
					break;
				case 2:
					{
					setState(194);
					operation();
					}
					break;
				case 3:
					{
					setState(195);
					return_ex();
					}
					break;
				case 4:
					{
					setState(196);
					assign2();
					}
					break;
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(PNK);
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << FOR) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BOOL) | (1L << IDENT) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(204);
				instruction();
				}
				}
				setState(209);
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

	public static class InstructionContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public New_ifContext new_if() {
			return getRuleContext(New_ifContext.class,0);
		}
		public Return_exContext return_ex() {
			return getRuleContext(Return_exContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public For_exContext for_ex() {
			return getRuleContext(For_exContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instruction);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case DOUBLE:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				assign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				new_if();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				return_ex();
				}
				break;
			case IDENT:
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				operation();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				for_ex();
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

	public static class InclementContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode INCLEMENT() { return getToken(gramatykaParser.INCLEMENT, 0); }
		public InclementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterInclement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitInclement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitInclement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclementContext inclement() throws RecognitionException {
		InclementContext _localctx = new InclementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inclement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			operand();
			setState(218);
			match(INCLEMENT);
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

	public static class For_exContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramatykaParser.FOR, 0); }
		public TerminalNode LNO() { return getToken(gramatykaParser.LNO, 0); }
		public ForassignContext forassign() {
			return getRuleContext(ForassignContext.class,0);
		}
		public List<TerminalNode> FORSEMICOL() { return getTokens(gramatykaParser.FORSEMICOL); }
		public TerminalNode FORSEMICOL(int i) {
			return getToken(gramatykaParser.FORSEMICOL, i);
		}
		public Logic_operationContext logic_operation() {
			return getRuleContext(Logic_operationContext.class,0);
		}
		public TerminalNode PNO() { return getToken(gramatykaParser.PNO, 0); }
		public TerminalNode LNK() { return getToken(gramatykaParser.LNK, 0); }
		public TerminalNode PNK() { return getToken(gramatykaParser.PNK, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public InclementContext inclement() {
			return getRuleContext(InclementContext.class,0);
		}
		public List<Break_exContext> break_ex() {
			return getRuleContexts(Break_exContext.class);
		}
		public Break_exContext break_ex(int i) {
			return getRuleContext(Break_exContext.class,i);
		}
		public List<Return_exContext> return_ex() {
			return getRuleContexts(Return_exContext.class);
		}
		public Return_exContext return_ex(int i) {
			return getRuleContext(Return_exContext.class,i);
		}
		public List<Assign2Context> assign2() {
			return getRuleContexts(Assign2Context.class);
		}
		public Assign2Context assign2(int i) {
			return getRuleContext(Assign2Context.class,i);
		}
		public List<New_ifContext> new_if() {
			return getRuleContexts(New_ifContext.class);
		}
		public New_ifContext new_if(int i) {
			return getRuleContext(New_ifContext.class,i);
		}
		public For_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterFor_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitFor_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitFor_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exContext for_ex() throws RecognitionException {
		For_exContext _localctx = new For_exContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_ex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(FOR);
			setState(221);
			match(LNO);
			setState(222);
			forassign();
			setState(223);
			match(FORSEMICOL);
			setState(224);
			logic_operation();
			setState(225);
			match(FORSEMICOL);
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(226);
				operation();
				}
				break;
			case 2:
				{
				setState(227);
				inclement();
				}
				break;
			}
			setState(230);
			match(PNO);
			setState(231);
			match(LNK);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << IDENT) | (1L << WORD) | (1L << NUMBER))) != 0)) {
				{
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(232);
					break_ex();
					}
					break;
				case 2:
					{
					setState(233);
					operation();
					}
					break;
				case 3:
					{
					setState(234);
					return_ex();
					}
					break;
				case 4:
					{
					setState(235);
					assign2();
					}
					break;
				case 5:
					{
					setState(236);
					new_if();
					}
					break;
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(PNK);
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

	public static class Return_exContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gramatykaParser.RETURN, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public SemicolContext semicol() {
			return getRuleContext(SemicolContext.class,0);
		}
		public Return_exContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterReturn_ex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitReturn_ex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitReturn_ex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_exContext return_ex() throws RecognitionException {
		Return_exContext _localctx = new Return_exContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(RETURN);
			setState(245);
			operand();
			setState(246);
			semicol();
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<New_ifContext> new_if() {
			return getRuleContexts(New_ifContext.class);
		}
		public New_ifContext new_if(int i) {
			return getRuleContext(New_ifContext.class,i);
		}
		public List<For_exContext> for_ex() {
			return getRuleContexts(For_exContext.class);
		}
		public For_exContext for_ex(int i) {
			return getRuleContext(For_exContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatykaListener ) ((gramatykaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatykaVisitor ) return ((gramatykaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << INT) | (1L << STRING) | (1L << DOUBLE) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STRING:
				case DOUBLE:
				case FLOAT:
				case BOOL:
					{
					setState(248);
					assign();
					}
					break;
				case IF:
					{
					setState(249);
					new_if();
					}
					break;
				case FOR:
					{
					setState(250);
					for_ex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rZ\n\r\3\16\3\16\3\16\3\16\3\17\3\17\5"+
		"\17b\n\17\3\20\3\20\7\20f\n\20\f\20\16\20i\13\20\3\20\3\20\5\20m\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\5\22u\n\22\3\22\3\22\5\22y\n\22\3\22\3"+
		"\22\3\22\5\22~\n\22\3\23\3\23\3\23\5\23\u0083\n\23\3\23\3\23\3\23\5\23"+
		"\u0088\n\23\3\23\3\23\3\24\3\24\5\24\u008e\n\24\3\24\3\24\3\24\5\24\u0093"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u00a5\n\26\f\26\16\26\u00a8\13\26\3\26\3\26\3\26"+
		"\7\26\u00ad\n\26\f\26\16\26\u00b0\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u00bb\n\27\f\27\16\27\u00be\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u00c8\n\30\f\30\16\30\u00cb\13\30\3\30"+
		"\3\30\3\31\7\31\u00d0\n\31\f\31\16\31\u00d3\13\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00da\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u00e7\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00f0\n"+
		"\34\f\34\16\34\u00f3\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\7\36\u00fe\n\36\f\36\16\36\u0101\13\36\3\36\2\2\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2\"&\3\2\22\25\3\2"+
		"\f\20\2\u010d\2<\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\f"+
		"H\3\2\2\2\16L\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24S\3\2\2\2\26U\3\2\2\2"+
		"\30Y\3\2\2\2\32[\3\2\2\2\34a\3\2\2\2\36c\3\2\2\2 n\3\2\2\2\"t\3\2\2\2"+
		"$\177\3\2\2\2&\u008d\3\2\2\2(\u0096\3\2\2\2*\u009b\3\2\2\2,\u00b1\3\2"+
		"\2\2.\u00c1\3\2\2\2\60\u00d1\3\2\2\2\62\u00d9\3\2\2\2\64\u00db\3\2\2\2"+
		"\66\u00de\3\2\2\28\u00f6\3\2\2\2:\u00ff\3\2\2\2<=\t\2\2\2=\3\3\2\2\2>"+
		"?\7*\2\2?\5\3\2\2\2@A\7\35\2\2A\7\3\2\2\2BC\7/\2\2C\t\3\2\2\2DE\7\'\2"+
		"\2EF\5\34\17\2FG\5\6\4\2G\13\3\2\2\2HI\7(\2\2IJ\5\34\17\2JK\5\6\4\2K\r"+
		"\3\2\2\2LM\7)\2\2MN\5\6\4\2N\17\3\2\2\2OP\t\3\2\2P\21\3\2\2\2QR\t\4\2"+
		"\2R\23\3\2\2\2ST\7\3\2\2T\25\3\2\2\2UV\7\4\2\2V\27\3\2\2\2WZ\5\24\13\2"+
		"XZ\5\26\f\2YW\3\2\2\2YX\3\2\2\2Z\31\3\2\2\2[\\\7!\2\2\\]\7*\2\2]^\7!\2"+
		"\2^\33\3\2\2\2_b\5\b\5\2`b\5\4\3\2a_\3\2\2\2a`\3\2\2\2b\35\3\2\2\2cg\5"+
		"\34\17\2df\5\20\t\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hl\3\2\2\2"+
		"ig\3\2\2\2jm\5\34\17\2km\5\36\20\2lj\3\2\2\2lk\3\2\2\2m\37\3\2\2\2no\7"+
		"\5\2\2op\5\"\22\2pq\7\6\2\2q!\3\2\2\2ru\5\34\17\2su\5 \21\2tr\3\2\2\2"+
		"ts\3\2\2\2ux\3\2\2\2vy\5\30\r\2wy\5\22\n\2xv\3\2\2\2xw\3\2\2\2y}\3\2\2"+
		"\2z~\5\34\17\2{~\5\"\22\2|~\5 \21\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~#\3"+
		"\2\2\2\177\u0082\5\2\2\2\u0080\u0083\5\4\3\2\u0081\u0083\7+\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\7\21"+
		"\2\2\u0085\u0088\5\36\20\2\u0086\u0088\5\34\17\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\6\4\2\u008a%\3\2\2\2"+
		"\u008b\u008e\5\4\3\2\u008c\u008e\7+\2\2\u008d\u008b\3\2\2\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\7\21\2\2\u0090\u0093\5\36\20"+
		"\2\u0091\u0093\5\34\17\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\5\6\4\2\u0095\'\3\2\2\2\u0096\u0097\5\2\2\2"+
		"\u0097\u0098\5\4\3\2\u0098\u0099\7\21\2\2\u0099\u009a\5\34\17\2\u009a"+
		")\3\2\2\2\u009b\u009c\7\27\2\2\u009c\u009d\7\5\2\2\u009d\u009e\5\"\22"+
		"\2\u009e\u009f\7\6\2\2\u009f\u00a6\7\7\2\2\u00a0\u00a5\5\16\b\2\u00a1"+
		"\u00a5\5\36\20\2\u00a2\u00a5\58\35\2\u00a3\u00a5\5&\24\2\u00a4\u00a0\3"+
		"\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ae\7\b\2\2\u00aa\u00ad\5,\27\2\u00ab"+
		"\u00ad\5.\30\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af+\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\5\"\22\2"+
		"\u00b4\u00b5\7\6\2\2\u00b5\u00bc\7\7\2\2\u00b6\u00bb\5\16\b\2\u00b7\u00bb"+
		"\5\36\20\2\u00b8\u00bb\58\35\2\u00b9\u00bb\5&\24\2\u00ba\u00b6\3\2\2\2"+
		"\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0-\3\2\2\2\u00c1\u00c2\7\31\2\2"+
		"\u00c2\u00c9\7\7\2\2\u00c3\u00c8\5\16\b\2\u00c4\u00c8\5\36\20\2\u00c5"+
		"\u00c8\58\35\2\u00c6\u00c8\5&\24\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7\b\2\2\u00cd/\3\2\2\2\u00ce\u00d0\5\62\32\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\61\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00da\5$\23\2\u00d5\u00da\5*\26"+
		"\2\u00d6\u00da\58\35\2\u00d7\u00da\5\36\20\2\u00d8\u00da\5\66\34\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\63\3\2\2\2\u00db\u00dc\5\34\17\2\u00dc"+
		"\u00dd\7\26\2\2\u00dd\65\3\2\2\2\u00de\u00df\7\34\2\2\u00df\u00e0\7\5"+
		"\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\7\36\2\2\u00e2\u00e3\5\"\22\2\u00e3"+
		"\u00e6\7\36\2\2\u00e4\u00e7\5\36\20\2\u00e5\u00e7\5\64\33\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9"+
		"\u00f1\7\7\2\2\u00ea\u00f0\5\16\b\2\u00eb\u00f0\5\36\20\2\u00ec\u00f0"+
		"\58\35\2\u00ed\u00f0\5&\24\2\u00ee\u00f0\5*\26\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\b\2\2\u00f5\67\3\2\2"+
		"\2\u00f6\u00f7\7\33\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\5\6\4\2\u00f9"+
		"9\3\2\2\2\u00fa\u00fe\5$\23\2\u00fb\u00fe\5*\26\2\u00fc\u00fe\5\66\34"+
		"\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100;\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\34Yagltx}\u0082\u0087\u008d\u0092\u00a4\u00a6\u00ac\u00ae"+
		"\u00ba\u00bc\u00c7\u00c9\u00d1\u00d9\u00e6\u00ef\u00f1\u00fd\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}