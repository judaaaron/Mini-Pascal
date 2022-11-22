import org.antlr.v4.runtime.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    static boolean control = false;

    public static class VerboseListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                String msg,
                RecognitionException e) {
            System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
            underlineError(recognizer, (Token) offendingSymbol,
                    line, charPositionInLine);
        }

        protected void underlineError(Recognizer recognizer,
                Token offendingToken, int line,
                int charPositionInLine) {
            CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
            String input = tokens.getTokenSource().getInputStream().toString();
            String[] lines = input.split("\n");
            String errorLine = lines[line - 1];
            System.err.println(errorLine);
            for (int i = 0; i < charPositionInLine; i++)
                System.err.print(" ");
            int start = offendingToken.getStartIndex();
            int stop = offendingToken.getStopIndex();
            if (start >= 0 && stop >= 0) {
                control = true;
                for (int i = start; i <= stop; i++)

                    System.err.print("^");
            }
            System.err.println();
        }

    }

    public static void main(String[] args) throws Exception {
        String program = args[0];

        System.out.println("Analizando archivo " + program + "...");
        CharStream codePointCharStream = CharStreams.fromFileName(program);
        pascalGrammarLexer lexer = new pascalGrammarLexer(codePointCharStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new VerboseListener());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pascalGrammarParser parser = new pascalGrammarParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new VerboseListener());
        parser.start();
        if (control == false) {
            System.out.println("El archivo " + program + " es correcto");
            int input = JOptionPane.showConfirmDialog(null, "Parse Tree generado con exito, desea visualizarlo?");
            switch (input) {
                case 0:
                    System.out.println("Generando Parse Tree");
                    String arbol = "cmd /c start cmd.exe /K \"grun pascalGrammar start " + program + " -gui";
                    Runtime.getRuntime().exec(arbol);
                    break;
                case 1:
                    System.out.println("Necesitas ejecutar ultimo comando para visualizar el Parse Tree");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } else {
            System.out.println("El archivo " + program + " tiene errores lexicos y/o sintacticos");
        }
    }
}