
package Mini_Pascal.pascalito;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "Pasc";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		LanguageLexer lexer = new LanguageLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LanguageParser parser = new LanguageParser(tokens);

		LanguageParser.StartContext tree = parser.start();

		LanguageCustomVisitor visitor = new LanguageCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
