// Generated from java-escape by ANTLR 4.11.1
package code.recognizer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GeneratorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GeneratorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#generator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerator(GeneratorParser.GeneratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#importLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportLine(GeneratorParser.ImportLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#importSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSource(GeneratorParser.ImportSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#grammarLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarLine(GeneratorParser.GrammarLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#lineRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineRule(GeneratorParser.LineRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#nonTermDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermDef(GeneratorParser.NonTermDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#argType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgType(GeneratorParser.ArgTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#resType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResType(GeneratorParser.ResTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#nonTermRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermRules(GeneratorParser.NonTermRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#nonTermRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermRule(GeneratorParser.NonTermRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#nonTermRuleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermRuleElement(GeneratorParser.NonTermRuleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#transCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransCall(GeneratorParser.TransCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#argSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgSeq(GeneratorParser.ArgSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#resSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResSeq(GeneratorParser.ResSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#seqInScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqInScope(GeneratorParser.SeqInScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#elemInScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemInScope(GeneratorParser.ElemInScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#anyScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyScope(GeneratorParser.AnyScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#tokenDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenDef(GeneratorParser.TokenDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#tokenMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenMode(GeneratorParser.TokenModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#transDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransDef(GeneratorParser.TransDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#argIdSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgIdSeq(GeneratorParser.ArgIdSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#resIdSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResIdSeq(GeneratorParser.ResIdSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#idSeqInScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSeqInScope(GeneratorParser.IdSeqInScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#importKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportKeyword(GeneratorParser.ImportKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#grammarKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarKeyword(GeneratorParser.GrammarKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(GeneratorParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#skipCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipCommand(GeneratorParser.SkipCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#hideCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHideCommand(GeneratorParser.HideCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link GeneratorParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GeneratorParser.IdContext ctx);
}