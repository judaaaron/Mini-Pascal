// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueVariables}.
	 * @param ctx the parse tree
	 */
	void enterBloqueVariables(testParser.BloqueVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueVariables}.
	 * @param ctx the parse tree
	 */
	void exitBloqueVariables(testParser.BloqueVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(testParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(testParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(testParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(testParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(testParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(testParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueIf}.
	 * @param ctx the parse tree
	 */
	void enterBloqueIf(testParser.BloqueIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueIf}.
	 * @param ctx the parse tree
	 */
	void exitBloqueIf(testParser.BloqueIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void enterBloqueElse(testParser.BloqueElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void exitBloqueElse(testParser.BloqueElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueFor}.
	 * @param ctx the parse tree
	 */
	void enterBloqueFor(testParser.BloqueForContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueFor}.
	 * @param ctx the parse tree
	 */
	void exitBloqueFor(testParser.BloqueForContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueWhile}.
	 * @param ctx the parse tree
	 */
	void enterBloqueWhile(testParser.BloqueWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueWhile}.
	 * @param ctx the parse tree
	 */
	void exitBloqueWhile(testParser.BloqueWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bloqueRepeat}.
	 * @param ctx the parse tree
	 */
	void enterBloqueRepeat(testParser.BloqueRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bloqueRepeat}.
	 * @param ctx the parse tree
	 */
	void exitBloqueRepeat(testParser.BloqueRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#leerVariable}.
	 * @param ctx the parse tree
	 */
	void enterLeerVariable(testParser.LeerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#leerVariable}.
	 * @param ctx the parse tree
	 */
	void exitLeerVariable(testParser.LeerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#escribirVariable}.
	 * @param ctx the parse tree
	 */
	void enterEscribirVariable(testParser.EscribirVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#escribirVariable}.
	 * @param ctx the parse tree
	 */
	void exitEscribirVariable(testParser.EscribirVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void enterCondiciones(testParser.CondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void exitCondiciones(testParser.CondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(testParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(testParser.TipoContext ctx);
}