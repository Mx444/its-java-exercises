package lezione_3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SecondoEsercizio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero :");
        int tabellina = scanner.nextInt();

        int[] range = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i : range) {
            System.out.println("Risultato - " + tabellina + " x " + i + " = " + tabellina * i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("Risultato - " + tabellina + " x " + i + " = " + tabellina
                    * i);
        }
    }

}
