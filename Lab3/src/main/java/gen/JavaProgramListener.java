// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaProgramParser}.
 */
public interface JavaProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaProgramParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(JavaProgramParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(JavaProgramParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(JavaProgramParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(JavaProgramParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#imprt}.
	 * @param ctx the parse tree
	 */
	void enterImprt(JavaProgramParser.ImprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#imprt}.
	 * @param ctx the parse tree
	 */
	void exitImprt(JavaProgramParser.ImprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#innerStructureSeq}.
	 * @param ctx the parse tree
	 */
	void enterInnerStructureSeq(JavaProgramParser.InnerStructureSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#innerStructureSeq}.
	 * @param ctx the parse tree
	 */
	void exitInnerStructureSeq(JavaProgramParser.InnerStructureSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#innerStructure}.
	 * @param ctx the parse tree
	 */
	void enterInnerStructure(JavaProgramParser.InnerStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#innerStructure}.
	 * @param ctx the parse tree
	 */
	void exitInnerStructure(JavaProgramParser.InnerStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#innerDeclare}.
	 * @param ctx the parse tree
	 */
	void enterInnerDeclare(JavaProgramParser.InnerDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#innerDeclare}.
	 * @param ctx the parse tree
	 */
	void exitInnerDeclare(JavaProgramParser.InnerDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#declareBegin}.
	 * @param ctx the parse tree
	 */
	void enterDeclareBegin(JavaProgramParser.DeclareBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#declareBegin}.
	 * @param ctx the parse tree
	 */
	void exitDeclareBegin(JavaProgramParser.DeclareBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#declarePrefix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarePrefix(JavaProgramParser.DeclarePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#declarePrefix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarePrefix(JavaProgramParser.DeclarePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#declareInScopeBody}.
	 * @param ctx the parse tree
	 */
	void enterDeclareInScopeBody(JavaProgramParser.DeclareInScopeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#declareInScopeBody}.
	 * @param ctx the parse tree
	 */
	void exitDeclareInScopeBody(JavaProgramParser.DeclareInScopeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#declareEnd}.
	 * @param ctx the parse tree
	 */
	void enterDeclareEnd(JavaProgramParser.DeclareEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#declareEnd}.
	 * @param ctx the parse tree
	 */
	void exitDeclareEnd(JavaProgramParser.DeclareEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#innerBody}.
	 * @param ctx the parse tree
	 */
	void enterInnerBody(JavaProgramParser.InnerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#innerBody}.
	 * @param ctx the parse tree
	 */
	void exitInnerBody(JavaProgramParser.InnerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#innerCode}.
	 * @param ctx the parse tree
	 */
	void enterInnerCode(JavaProgramParser.InnerCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#innerCode}.
	 * @param ctx the parse tree
	 */
	void exitInnerCode(JavaProgramParser.InnerCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JavaProgramParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JavaProgramParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyStructure}.
	 * @param ctx the parse tree
	 */
	void enterKeyStructure(JavaProgramParser.KeyStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyStructure}.
	 * @param ctx the parse tree
	 */
	void exitKeyStructure(JavaProgramParser.KeyStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyDeclare}.
	 * @param ctx the parse tree
	 */
	void enterKeyDeclare(JavaProgramParser.KeyDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyDeclare}.
	 * @param ctx the parse tree
	 */
	void exitKeyDeclare(JavaProgramParser.KeyDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyContinueDeclare}.
	 * @param ctx the parse tree
	 */
	void enterKeyContinueDeclare(JavaProgramParser.KeyContinueDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyContinueDeclare}.
	 * @param ctx the parse tree
	 */
	void exitKeyContinueDeclare(JavaProgramParser.KeyContinueDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyDeclareScope}.
	 * @param ctx the parse tree
	 */
	void enterKeyDeclareScope(JavaProgramParser.KeyDeclareScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyDeclareScope}.
	 * @param ctx the parse tree
	 */
	void exitKeyDeclareScope(JavaProgramParser.KeyDeclareScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyDeclareInScope}.
	 * @param ctx the parse tree
	 */
	void enterKeyDeclareInScope(JavaProgramParser.KeyDeclareInScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyDeclareInScope}.
	 * @param ctx the parse tree
	 */
	void exitKeyDeclareInScope(JavaProgramParser.KeyDeclareInScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyLineEnd}.
	 * @param ctx the parse tree
	 */
	void enterKeyLineEnd(JavaProgramParser.KeyLineEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyLineEnd}.
	 * @param ctx the parse tree
	 */
	void exitKeyLineEnd(JavaProgramParser.KeyLineEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#switchStructure}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStructure(JavaProgramParser.SwitchStructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#switchStructure}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStructure(JavaProgramParser.SwitchStructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#switchDeclare}.
	 * @param ctx the parse tree
	 */
	void enterSwitchDeclare(JavaProgramParser.SwitchDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#switchDeclare}.
	 * @param ctx the parse tree
	 */
	void exitSwitchDeclare(JavaProgramParser.SwitchDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBody(JavaProgramParser.SwitchBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#switchBody}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBody(JavaProgramParser.SwitchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#switchCode}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCode(JavaProgramParser.SwitchCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#switchCode}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCode(JavaProgramParser.SwitchCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCase(JavaProgramParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCase(JavaProgramParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(JavaProgramParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(JavaProgramParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#funcDeclareArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclareArgs(JavaProgramParser.FuncDeclareArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#funcDeclareArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclareArgs(JavaProgramParser.FuncDeclareArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#funcDeclareArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclareArg(JavaProgramParser.FuncDeclareArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#funcDeclareArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclareArg(JavaProgramParser.FuncDeclareArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#argTypeToken}.
	 * @param ctx the parse tree
	 */
	void enterArgTypeToken(JavaProgramParser.ArgTypeTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#argTypeToken}.
	 * @param ctx the parse tree
	 */
	void exitArgTypeToken(JavaProgramParser.ArgTypeTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#valueDeclare}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclare(JavaProgramParser.ValueDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#valueDeclare}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclare(JavaProgramParser.ValueDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JavaProgramParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#valueUnary}.
	 * @param ctx the parse tree
	 */
	void enterValueUnary(JavaProgramParser.ValueUnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#valueUnary}.
	 * @param ctx the parse tree
	 */
	void exitValueUnary(JavaProgramParser.ValueUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#valueUnaryKeyWord}.
	 * @param ctx the parse tree
	 */
	void enterValueUnaryKeyWord(JavaProgramParser.ValueUnaryKeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#valueUnaryKeyWord}.
	 * @param ctx the parse tree
	 */
	void exitValueUnaryKeyWord(JavaProgramParser.ValueUnaryKeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#valueUnaryGet}.
	 * @param ctx the parse tree
	 */
	void enterValueUnaryGet(JavaProgramParser.ValueUnaryGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#valueUnaryGet}.
	 * @param ctx the parse tree
	 */
	void exitValueUnaryGet(JavaProgramParser.ValueUnaryGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#valueUnaryMain}.
	 * @param ctx the parse tree
	 */
	void enterValueUnaryMain(JavaProgramParser.ValueUnaryMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#valueUnaryMain}.
	 * @param ctx the parse tree
	 */
	void exitValueUnaryMain(JavaProgramParser.ValueUnaryMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#funcToken}.
	 * @param ctx the parse tree
	 */
	void enterFuncToken(JavaProgramParser.FuncTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#funcToken}.
	 * @param ctx the parse tree
	 */
	void exitFuncToken(JavaProgramParser.FuncTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArgs(JavaProgramParser.FuncCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#funcCallArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArgs(JavaProgramParser.FuncCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#typeToken}.
	 * @param ctx the parse tree
	 */
	void enterTypeToken(JavaProgramParser.TypeTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#typeToken}.
	 * @param ctx the parse tree
	 */
	void exitTypeToken(JavaProgramParser.TypeTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#varToken}.
	 * @param ctx the parse tree
	 */
	void enterVarToken(JavaProgramParser.VarTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#varToken}.
	 * @param ctx the parse tree
	 */
	void exitVarToken(JavaProgramParser.VarTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#generic}.
	 * @param ctx the parse tree
	 */
	void enterGeneric(JavaProgramParser.GenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#generic}.
	 * @param ctx the parse tree
	 */
	void exitGeneric(JavaProgramParser.GenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#genericIn}.
	 * @param ctx the parse tree
	 */
	void enterGenericIn(JavaProgramParser.GenericInContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#genericIn}.
	 * @param ctx the parse tree
	 */
	void exitGenericIn(JavaProgramParser.GenericInContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyWordAndTokens}.
	 * @param ctx the parse tree
	 */
	void enterKeyWordAndTokens(JavaProgramParser.KeyWordAndTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyWordAndTokens}.
	 * @param ctx the parse tree
	 */
	void exitKeyWordAndTokens(JavaProgramParser.KeyWordAndTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#typeTokensComma}.
	 * @param ctx the parse tree
	 */
	void enterTypeTokensComma(JavaProgramParser.TypeTokensCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#typeTokensComma}.
	 * @param ctx the parse tree
	 */
	void exitTypeTokensComma(JavaProgramParser.TypeTokensCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void enterKeyWord(JavaProgramParser.KeyWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#keyWord}.
	 * @param ctx the parse tree
	 */
	void exitKeyWord(JavaProgramParser.KeyWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(JavaProgramParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(JavaProgramParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaProgramParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JavaProgramParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaProgramParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JavaProgramParser.OperatorContext ctx);
}