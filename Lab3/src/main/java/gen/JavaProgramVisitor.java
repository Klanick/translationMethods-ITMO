// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(JavaProgramParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(JavaProgramParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#imprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprt(JavaProgramParser.ImprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#innerStructureSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerStructureSeq(JavaProgramParser.InnerStructureSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#innerStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerStructure(JavaProgramParser.InnerStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#innerDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerDeclare(JavaProgramParser.InnerDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#declareBegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareBegin(JavaProgramParser.DeclareBeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#declarePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarePrefix(JavaProgramParser.DeclarePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#declareInScopeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareInScopeBody(JavaProgramParser.DeclareInScopeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#declareEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareEnd(JavaProgramParser.DeclareEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#innerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerBody(JavaProgramParser.InnerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#innerCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCode(JavaProgramParser.InnerCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(JavaProgramParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyStructure(JavaProgramParser.KeyStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDeclare(JavaProgramParser.KeyDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyContinueDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyContinueDeclare(JavaProgramParser.KeyContinueDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyDeclareScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDeclareScope(JavaProgramParser.KeyDeclareScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyDeclareInScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyDeclareInScope(JavaProgramParser.KeyDeclareInScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyLineEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyLineEnd(JavaProgramParser.KeyLineEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#switchStructure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStructure(JavaProgramParser.SwitchStructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#switchDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchDeclare(JavaProgramParser.SwitchDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#switchBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBody(JavaProgramParser.SwitchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#switchCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCode(JavaProgramParser.SwitchCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(JavaProgramParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(JavaProgramParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#funcDeclareArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclareArgs(JavaProgramParser.FuncDeclareArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#funcDeclareArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclareArg(JavaProgramParser.FuncDeclareArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#argTypeToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgTypeToken(JavaProgramParser.ArgTypeTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#valueDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclare(JavaProgramParser.ValueDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#valueUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueUnary(JavaProgramParser.ValueUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#valueUnaryKeyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueUnaryKeyWord(JavaProgramParser.ValueUnaryKeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#valueUnaryGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueUnaryGet(JavaProgramParser.ValueUnaryGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#valueUnaryMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueUnaryMain(JavaProgramParser.ValueUnaryMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#funcToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncToken(JavaProgramParser.FuncTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#funcCallArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArgs(JavaProgramParser.FuncCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#typeToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeToken(JavaProgramParser.TypeTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#varToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarToken(JavaProgramParser.VarTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(JavaProgramParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#genericIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericIn(JavaProgramParser.GenericInContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyWordAndTokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWordAndTokens(JavaProgramParser.KeyWordAndTokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#typeTokensComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTokensComma(JavaProgramParser.TypeTokensCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#keyWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyWord(JavaProgramParser.KeyWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(JavaProgramParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaProgramParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JavaProgramParser.OperatorContext ctx);
}