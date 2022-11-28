
public class fila {

    private String identificador;
    private String tipo;
    private String valor;

    public fila(String identificador, String tipo, String valor) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.valor = valor;
    }

    public fila(String identificador, String tipo) {
        this.identificador = identificador;
        this.tipo = tipo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Identificador: " + identificador + " Tipo: " + tipo + " Valor: " + valor;
    }

}
