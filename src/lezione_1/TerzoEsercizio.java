package lezione_1;

import java.util.Scanner;

public class TerzoEsercizio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.println("Inserisci la tua età : ");
            int age = scanner.nextInt();

            if (age >= 18)
                System.out.println("Puoi guidare!");
            else
                System.out.println("Sei minorenne!");

        }
    }

}
