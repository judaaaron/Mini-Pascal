import org.antlr.v4.runtime.*;
import java.util.*;

public class Main {
private static final String EXTENSION = "pas";
public static class VerboseListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Error encontrado en: "+stack);
        System.err.println("line "+line+":"+charPositionInLine+" at "+
                           offendingSymbol+": "+msg);
    }

}
    public static void main(String[] args) throws Exception {
        String program = args.length > 1 ? args[1] : "code." + EXTENSION;
        System.out.println("Analizando archivo" + program + "...");
        CharStream codePointCharStream = CharStreams.fromFileName(program);
        pascalGrammarLexer lexer = new pascalGrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pascalGrammarParser parser = new pascalGrammarParser(tokens);
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new VerboseListener()); // add ours
        parser.start();
    }
}
