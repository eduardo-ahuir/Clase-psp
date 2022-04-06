import java.util.ArrayList;
import java.util.Random;


public class Hilo1 extends Thread {

    private final ArrayList<Casilla> lista;

    private final int inf;

    private final int sup;


    public Hilo1(String nombre, int inf, int sup, ArrayList<Casilla> lista) {
        super(nombre);
        this.inf = inf;
        this.sup = sup;
        this.lista = lista;

    }


    public void run() {
        Random r = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }
            num = (int) (r.nextDouble() * (sup - inf + 1) + inf);
            if (lista.get(i).getvalorhilo() == ' ')
                lista.get(i).setvalor_hilo('1', num);

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