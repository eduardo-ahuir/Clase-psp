import java.util.ArrayList;
import java.util.Random;

public class Hilo2 extends Thread {
    private final ArrayList<Casilla> lista;
    private final int inf;
    private final int sup;

    public Hilo2(String nombre, int inf, int sup, ArrayList<Casilla> lista) {
        super(nombre);
        this.inf = inf;
        this.sup = sup;
        this.lista = lista;
    }

    public void run() {
        Random r = new Random();
        int num;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {

            e1.printStackTrace();
        }
        for (int i = 9; i >= 0; i--) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            num = (int) (r.nextDouble() * (sup - inf + 1) + inf);
            if (lista.get(i).getvalorhilo() == ' ')
                lista.get(i).setvalor_hilo('2', num);
            else
                break;
            pintar_tabla();
        }
    }

    public void pintar_tabla() {
        for (int j = 0; j < 10; j++) {
            Casilla caux = lista.get(j);
            System.out.print(caux.getindice() + "\t");
        }
        System.out.println();
        for (int j = 0; j < 75; j++) {
            System.out.print("-");
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            Casilla caux = lista.get(j);
            System.out.print(caux.getvalor() + "\t");
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            Casilla caux = lista.get(j);
            System.out.print(caux.getvalorhilo() + "\t");
        }
        System.out.println("\n");
    }
}