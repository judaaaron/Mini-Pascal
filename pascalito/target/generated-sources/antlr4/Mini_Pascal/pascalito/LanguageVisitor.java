// Generated from Mini_Pascal\pascalito\Language.g4 by ANTLR 4.5.1
package Mini_Pascal.pascalito;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(LanguageParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(LanguageParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(LanguageParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#wriite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriite(LanguageParser.WriiteContext ctx);
}