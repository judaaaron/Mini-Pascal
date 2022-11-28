import java.util.ArrayList;

public class TablaSimbolos {
    private ArrayList<fila> tablita = new ArrayList();

    public ArrayList<fila> getTablita() {
        return tablita;
    }

    public void setTablita(ArrayList<fila> tablita) {
        this.tablita = tablita;
    }

    public void print() {
        for (fila f : tablita) {
            System.out.println("Identificador: " + f.getIdentificador() + " Tipo: " + f.getTipo());
        }
    }

}
