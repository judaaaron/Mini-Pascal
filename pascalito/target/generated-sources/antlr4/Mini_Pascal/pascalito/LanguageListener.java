// Generated from Language.g4 by ANTLR 4.4
package Mini_Pascal.pascalito;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull LanguageParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull LanguageParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#wriite}.
	 * @param ctx the parse tree
	 */
	void enterWriite(@NotNull LanguageParser.WriiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#wriite}.
	 * @param ctx the parse tree
	 */
	void exitWriite(@NotNull LanguageParser.WriiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull LanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull LanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull LanguageParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull LanguageParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull LanguageParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull LanguageParser.Var_declContext ctx);
}