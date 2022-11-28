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
        System.out.println("Bloque de variables " + cadena2 + " ");
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

    /**
     * {@inheritDoc}
     *
     * <p>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     * </p>
     */
    @Override
    public Object visitDeclaracion(pascalGrammarParser.DeclaracionContext ctx) {

        for (int i = 0; i < sizeTabla; i++) {
            System.out.println("Variable: " + simbolos.getTablita().get(i).getIdentificador() + " Tipo: "
                    + simbolos.getTablita().get(i).getTipo() + " En declaracion");
        }

        // System.out.println(ctx.tipo() + " tipo" + tipo);

        // String id = ctx.ID().toString();
        // System.out.println("Tamaño de la tabla: " + simbolos.getTablita().size());
        // boolean existe = false;
        // for (fila f : simbolos.getTablita()) {
        // if (f.getIdentificador().equals(id)) {
        // existe = true;
        // break;
        // }
        // }
        // if (!existe) {
        // simbolos.getTablita().add(new fila(id, tipo));
        // } else {
        // for (fila f : simbolos.getTablita()) {
        // if (f.getIdentificador().equals(id)) {
        // System.out.println("Error semantico variable " + f.getIdentificador() + " ya
        // ha sido declarada");
        // }
        // }

        // validacion = true;
        // }
        // existe = false;

        // for (fila f : simbolos.getTablita()) {
        // System.out.println("Identificador: " + f.getIdentificador() + " Tipo: " +
        // f.getTipo());
        // }
        return visitChildren(ctx);
    }

    @Override
    public Object visitTipo(pascalGrammarParser.TipoContext ctx) {

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
        return validacion;
    }
}