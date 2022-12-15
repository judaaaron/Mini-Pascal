import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

@SuppressWarnings("CheckReturnValue")
public class visitorPascal extends pascalGrammarBaseVisitor<Object> {

    TablaSimbolos simbolos = new TablaSimbolos();
    boolean validacion = false;
    int sizeTabla;

    @Override
    public Object visitStart(pascalGrammarParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueVariables(pascalGrammarParser.BloqueVariablesContext ctx) {

        String cadena = ctx.getText();
        String cadena2 = cadena.substring(3, cadena.length());
        // System.out.println("Bloque de variables " + cadena2 + " ");
        String[] ultracompleta = cadena2.split(";");
        for (int i = 0; i < ultracompleta.length; i++) {
            String[] completa = ultracompleta[i].split(":");
            String[] variables = completa[0].split(",");
            String tipo = completa[1];
            // System.out.println("Tipo: " + tipo);
            for (int j = 0; j < variables.length; j++) {
                // System.out.println("Variable: " + variables[j]);
                simbolos.getTablita().add(new fila(variables[j], tipo));
            }

        }

        sizeTabla = simbolos.getTablita().size();

        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracion(pascalGrammarParser.DeclaracionContext ctx) {
        String ID = ctx.ID().toString();
        int contador = 0;
        for (int i = 0; i < sizeTabla; i++) {
            if (simbolos.getTablita().get(i).getIdentificador().equals(ID)) {
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println("Variable  '" + ID + "' ya ha sido declarada");
            validacion = true;
        } else {
            validacion = false;
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitTipo(pascalGrammarParser.TipoContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Object visitStatements(pascalGrammarParser.StatementsContext ctx) {
        return visitChildren(ctx);
    }

    ArrayList<Boolean> control = new ArrayList<Boolean>();

    @Override

    public Object visitAsignacion(pascalGrammarParser.AsignacionContext ctx) {

        String ID = ctx.ID().toString();
        String expresion = ctx.expr().getText();

        if (isNumber(expresion)) {
            for (int i = 0; i < sizeTabla; i++) {
                if (simbolos.getTablita().get(i).getIdentificador().equals(ID)) {
                    if (simbolos.getTablita().get(i).getTipo().equals("integer")) {

                        control.add(false);
                    } else {
                        System.out.println("La asignacion de " + ID + " es incorrecta" + " es de tipo "
                                + simbolos.getTablita().get(i).getTipo()
                                + " y se le esta asignando tipo de dato integer");
                        control.add(true);
                    }
                }
            }

        } else if (expresion.equals("true") || expresion.equals("false")) {
            for (int i = 0; i < sizeTabla; i++) {
                if (simbolos.getTablita().get(i).getIdentificador().equals(ID)) {
                    if (simbolos.getTablita().get(i).getTipo().equals("boolean")) {
                        control.add(false);
                    } else {
                        System.out.println("La asignacion de " + ID + " es incorrecta" + " es de tipo "
                                + simbolos.getTablita().get(i).getTipo()
                                + " y se le esta asignando tipo de dato Boolean");
                        control.add(true);
                    }
                }
            }
        } else if (expresion.length() == 1) {
            // es caracter
            for (int i = 0; i < sizeTabla; i++) {
                if (simbolos.getTablita().get(i).getIdentificador().equals(ID)) {
                    if (simbolos.getTablita().get(i).getTipo().equals("char")) {
                        control.add(false);
                    } else {
                        System.out.println("La asignacion de " + ID + " es incorrecta" + " es de tipo "
                                + simbolos.getTablita().get(i).getTipo()
                                + " y se le esta asignando tipo de dato char");
                        control.add(true);
                    }
                }
            }
        } else {
            System.err.println("cadena compuesta");
        }

        return visitChildren(ctx);

    }

    // This method takes an ID as an argument and returns the data type of the ID
    public String getDataType(String ID) {
        // You can use a map to store the data types of the IDs in your program
        Map<String, String> dataTypes = new HashMap<>();
        // Add some sample data types to the map
        dataTypes.put("x", "integer");
        dataTypes.put("y", "real");
        dataTypes.put("z", "string");
        // Return the data type of the ID from the map
        return dataTypes.get(ID);
    }

    // This method takes a value as an argument and returns true if the value is a
    // number, and false otherwise
    public boolean isNumber(String value) {
        // Try to parse the value as a number
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public Object visitBloqueIf(pascalGrammarParser.BloqueIfContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueElse(pascalGrammarParser.BloqueElseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueFor(pascalGrammarParser.BloqueForContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueWhile(pascalGrammarParser.BloqueWhileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBloqueRepeat(pascalGrammarParser.BloqueRepeatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitLeerVariable(pascalGrammarParser.LeerVariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitEscribirVariable(pascalGrammarParser.EscribirVariableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondiciones(pascalGrammarParser.CondicionesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpr(pascalGrammarParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    public boolean validar() {
        // simbolos.print();
        validacion = false;
        for (int i = 0; i < control.size(); i++) {
            if (control.get(i) == true) {
                validacion = true;
                break;
            }
        }
        return validacion;
    }
}