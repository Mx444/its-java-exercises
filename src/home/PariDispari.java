package home;

import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Inserisci un numero : ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0)
                System.out.println("Numero Pari :" + numero);
            else
                System.out.println("Numero Dispari :" + numero);

        }

    }

}
