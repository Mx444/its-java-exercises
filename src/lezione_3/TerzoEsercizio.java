package lezione_3;

import java.util.Scanner;

public class TerzoEsercizio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "java123";
        boolean match = false;

        do {
            System.out.println("Inserisci password : ");
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Password corretta !");
                match = true;
                scanner.close();
                return;
            }

            System.out.println("Password errata !");
        } while (!match);
    }

}
