// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pascalGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pascalGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(pascalGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueVariables(pascalGrammarParser.BloqueVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(pascalGrammarParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(pascalGrammarParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(pascalGrammarParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(pascalGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueIf(pascalGrammarParser.BloqueIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueElse(pascalGrammarParser.BloqueElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueFor(pascalGrammarParser.BloqueForContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueWhile(pascalGrammarParser.BloqueWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#bloqueRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueRepeat(pascalGrammarParser.BloqueRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#leerVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerVariable(pascalGrammarParser.LeerVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#escribirVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribirVariable(pascalGrammarParser.EscribirVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(pascalGrammarParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pascalGrammarParser.ExprContext ctx);
}