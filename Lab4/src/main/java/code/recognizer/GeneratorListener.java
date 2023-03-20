// Generated from java-escape by ANTLR 4.11.1
package code.recognizer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GeneratorParser}.
 */
public interface GeneratorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#generator}.
	 * @param ctx the parse tree
	 */
	void enterGenerator(GeneratorParser.GeneratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#generator}.
	 * @param ctx the parse tree
	 */
	void exitGenerator(GeneratorParser.GeneratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#importLine}.
	 * @param ctx the parse tree
	 */
	void enterImportLine(GeneratorParser.ImportLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#importLine}.
	 * @param ctx the parse tree
	 */
	void exitImportLine(GeneratorParser.ImportLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#importSource}.
	 * @param ctx the parse tree
	 */
	void enterImportSource(GeneratorParser.ImportSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#importSource}.
	 * @param ctx the parse tree
	 */
	void exitImportSource(GeneratorParser.ImportSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#grammarLine}.
	 * @param ctx the parse tree
	 */
	void enterGrammarLine(GeneratorParser.GrammarLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#grammarLine}.
	 * @param ctx the parse tree
	 */
	void exitGrammarLine(GeneratorParser.GrammarLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#lineRule}.
	 * @param ctx the parse tree
	 */
	void enterLineRule(GeneratorParser.LineRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#lineRule}.
	 * @param ctx the parse tree
	 */
	void exitLineRule(GeneratorParser.LineRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#nonTermDef}.
	 * @param ctx the parse tree
	 */
	void enterNonTermDef(GeneratorParser.NonTermDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#nonTermDef}.
	 * @param ctx the parse tree
	 */
	void exitNonTermDef(GeneratorParser.NonTermDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#argType}.
	 * @param ctx the parse tree
	 */
	void enterArgType(GeneratorParser.ArgTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#argType}.
	 * @param ctx the parse tree
	 */
	void exitArgType(GeneratorParser.ArgTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#resType}.
	 * @param ctx the parse tree
	 */
	void enterResType(GeneratorParser.ResTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#resType}.
	 * @param ctx the parse tree
	 */
	void exitResType(GeneratorParser.ResTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#nonTermRules}.
	 * @param ctx the parse tree
	 */
	void enterNonTermRules(GeneratorParser.NonTermRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#nonTermRules}.
	 * @param ctx the parse tree
	 */
	void exitNonTermRules(GeneratorParser.NonTermRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#nonTermRule}.
	 * @param ctx the parse tree
	 */
	void enterNonTermRule(GeneratorParser.NonTermRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#nonTermRule}.
	 * @param ctx the parse tree
	 */
	void exitNonTermRule(GeneratorParser.NonTermRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#nonTermRuleElement}.
	 * @param ctx the parse tree
	 */
	void enterNonTermRuleElement(GeneratorParser.NonTermRuleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#nonTermRuleElement}.
	 * @param ctx the parse tree
	 */
	void exitNonTermRuleElement(GeneratorParser.NonTermRuleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#transCall}.
	 * @param ctx the parse tree
	 */
	void enterTransCall(GeneratorParser.TransCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#transCall}.
	 * @param ctx the parse tree
	 */
	void exitTransCall(GeneratorParser.TransCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#argSeq}.
	 * @param ctx the parse tree
	 */
	void enterArgSeq(GeneratorParser.ArgSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#argSeq}.
	 * @param ctx the parse tree
	 */
	void exitArgSeq(GeneratorParser.ArgSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#resSeq}.
	 * @param ctx the parse tree
	 */
	void enterResSeq(GeneratorParser.ResSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#resSeq}.
	 * @param ctx the parse tree
	 */
	void exitResSeq(GeneratorParser.ResSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#seqInScope}.
	 * @param ctx the parse tree
	 */
	void enterSeqInScope(GeneratorParser.SeqInScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#seqInScope}.
	 * @param ctx the parse tree
	 */
	void exitSeqInScope(GeneratorParser.SeqInScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#elemInScope}.
	 * @param ctx the parse tree
	 */
	void enterElemInScope(GeneratorParser.ElemInScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#elemInScope}.
	 * @param ctx the parse tree
	 */
	void exitElemInScope(GeneratorParser.ElemInScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#anyScope}.
	 * @param ctx the parse tree
	 */
	void enterAnyScope(GeneratorParser.AnyScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#anyScope}.
	 * @param ctx the parse tree
	 */
	void exitAnyScope(GeneratorParser.AnyScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#tokenDef}.
	 * @param ctx the parse tree
	 */
	void enterTokenDef(GeneratorParser.TokenDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#tokenDef}.
	 * @param ctx the parse tree
	 */
	void exitTokenDef(GeneratorParser.TokenDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#tokenMode}.
	 * @param ctx the parse tree
	 */
	void enterTokenMode(GeneratorParser.TokenModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#tokenMode}.
	 * @param ctx the parse tree
	 */
	void exitTokenMode(GeneratorParser.TokenModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#transDef}.
	 * @param ctx the parse tree
	 */
	void enterTransDef(GeneratorParser.TransDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#transDef}.
	 * @param ctx the parse tree
	 */
	void exitTransDef(GeneratorParser.TransDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#argIdSeq}.
	 * @param ctx the parse tree
	 */
	void enterArgIdSeq(GeneratorParser.ArgIdSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#argIdSeq}.
	 * @param ctx the parse tree
	 */
	void exitArgIdSeq(GeneratorParser.ArgIdSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#resIdSeq}.
	 * @param ctx the parse tree
	 */
	void enterResIdSeq(GeneratorParser.ResIdSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#resIdSeq}.
	 * @param ctx the parse tree
	 */
	void exitResIdSeq(GeneratorParser.ResIdSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#idSeqInScope}.
	 * @param ctx the parse tree
	 */
	void enterIdSeqInScope(GeneratorParser.IdSeqInScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#idSeqInScope}.
	 * @param ctx the parse tree
	 */
	void exitIdSeqInScope(GeneratorParser.IdSeqInScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#importKeyword}.
	 * @param ctx the parse tree
	 */
	void enterImportKeyword(GeneratorParser.ImportKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#importKeyword}.
	 * @param ctx the parse tree
	 */
	void exitImportKeyword(GeneratorParser.ImportKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#grammarKeyword}.
	 * @param ctx the parse tree
	 */
	void enterGrammarKeyword(GeneratorParser.GrammarKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#grammarKeyword}.
	 * @param ctx the parse tree
	 */
	void exitGrammarKeyword(GeneratorParser.GrammarKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GeneratorParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GeneratorParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#skipCommand}.
	 * @param ctx the parse tree
	 */
	void enterSkipCommand(GeneratorParser.SkipCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#skipCommand}.
	 * @param ctx the parse tree
	 */
	void exitSkipCommand(GeneratorParser.SkipCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#hideCommand}.
	 * @param ctx the parse tree
	 */
	void enterHideCommand(GeneratorParser.HideCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#hideCommand}.
	 * @param ctx the parse tree
	 */
	void exitHideCommand(GeneratorParser.HideCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GeneratorParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GeneratorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GeneratorParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GeneratorParser.IdContext ctx);
}