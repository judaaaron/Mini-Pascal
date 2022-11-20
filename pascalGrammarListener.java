// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pascalGrammarParser}.
 */
public interface pascalGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(pascalGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(pascalGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueVariables}.
	 * @param ctx the parse tree
	 */
	void enterBloqueVariables(pascalGrammarParser.BloqueVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueVariables}.
	 * @param ctx the parse tree
	 */
	void exitBloqueVariables(pascalGrammarParser.BloqueVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(pascalGrammarParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(pascalGrammarParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(pascalGrammarParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(pascalGrammarParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(pascalGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(pascalGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueIf}.
	 * @param ctx the parse tree
	 */
	void enterBloqueIf(pascalGrammarParser.BloqueIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueIf}.
	 * @param ctx the parse tree
	 */
	void exitBloqueIf(pascalGrammarParser.BloqueIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void enterBloqueElse(pascalGrammarParser.BloqueElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueElse}.
	 * @param ctx the parse tree
	 */
	void exitBloqueElse(pascalGrammarParser.BloqueElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueFor}.
	 * @param ctx the parse tree
	 */
	void enterBloqueFor(pascalGrammarParser.BloqueForContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueFor}.
	 * @param ctx the parse tree
	 */
	void exitBloqueFor(pascalGrammarParser.BloqueForContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueWhile}.
	 * @param ctx the parse tree
	 */
	void enterBloqueWhile(pascalGrammarParser.BloqueWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueWhile}.
	 * @param ctx the parse tree
	 */
	void exitBloqueWhile(pascalGrammarParser.BloqueWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#bloqueRepeat}.
	 * @param ctx the parse tree
	 */
	void enterBloqueRepeat(pascalGrammarParser.BloqueRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#bloqueRepeat}.
	 * @param ctx the parse tree
	 */
	void exitBloqueRepeat(pascalGrammarParser.BloqueRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#leerVariable}.
	 * @param ctx the parse tree
	 */
	void enterLeerVariable(pascalGrammarParser.LeerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#leerVariable}.
	 * @param ctx the parse tree
	 */
	void exitLeerVariable(pascalGrammarParser.LeerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#escribirVariable}.
	 * @param ctx the parse tree
	 */
	void enterEscribirVariable(pascalGrammarParser.EscribirVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#escribirVariable}.
	 * @param ctx the parse tree
	 */
	void exitEscribirVariable(pascalGrammarParser.EscribirVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void enterCondiciones(pascalGrammarParser.CondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void exitCondiciones(pascalGrammarParser.CondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pascalGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pascalGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pascalGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(pascalGrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pascalGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(pascalGrammarParser.TipoContext ctx);
}