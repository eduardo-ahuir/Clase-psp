import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Casilla> lista_casillas = new ArrayList<Casilla>();
        Random r = new Random();
        int inf = 0;
        int sup = 0;
        int num = 0;

        System.out.println("Introduzca limite inferior:");
        inf = s.nextInt();
        System.out.println("Introduzca limite superior:");
        sup = s.nextInt();

        for (int i = 0; i < 10; i++) {
            Casilla c = new Casilla();
            lista_casillas.add(c);
        }

        Hilo1 hilo1 = new Hilo1("Hilo1:", inf, sup, lista_casillas);
        Hilo2 hilo2 = new Hilo2("Hilo2:", inf, sup, lista_casillas);
        hilo1.start();
        hilo2.start();
    }

}