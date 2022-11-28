@SuppressWarnings("CheckReturnValue")
public class visitorPascal extends pascalGrammarBaseVisitor<Object> {
    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    TablaSimbolos simbolos = new TablaSimbolos();
    boolean validacion = false;
    int sizeTabla;

    @Override
    public Object visitStart(pascalGrammarParser.StartContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */

    // String tipo = "";

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
        // String Tipos="";
        // String Ids = "";

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

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitAsignacion(pascalGrammarParser.AsignacionContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitBloqueIf(pascalGrammarParser.BloqueIfContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitBloqueElse(pascalGrammarParser.BloqueElseContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitBloqueFor(pascalGrammarParser.BloqueForContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitBloqueWhile(pascalGrammarParser.BloqueWhileContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitBloqueRepeat(pascalGrammarParser.BloqueRepeatContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitLeerVariable(pascalGrammarParser.LeerVariableContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitEscribirVariable(pascalGrammarParser.EscribirVariableContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitCondiciones(pascalGrammarParser.CondicionesContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitExpr(pascalGrammarParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    public boolean validar() {
        // simbolos.print();
        return validacion;
    }
}