public class Casilla {
    static int id = 0;
    private final int indice;
    private int valor;
    private char valor_hilo;

    public Casilla() {
        this.indice = id;
        this.valor_hilo = ' ';
        id++;
    }

    public int getindice() {
        return indice;
    }

    public int getvalor() {
        return valor;
    }

    public char getvalorhilo() {
        return valor_hilo;
    }

    public void setvalor_hilo(char valor_hilo, int valor) {
        this.valor_hilo = valor_hilo;
        this.valor = valor;
    }

}


