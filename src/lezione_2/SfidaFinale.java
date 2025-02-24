package lezione_2;

import java.util.Scanner;

public class SfidaFinale {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Inserisci il primo numero :");
            int primoNumero = scanner.nextInt();
            System.out.println("Inserisci il secondo numero :");
            int secondoNumero = scanner.nextInt();

            float somma = primoNumero + secondoNumero;
            System.out.println("SOMMA : " + somma);

            System.out.println("DOUBLE : " + (double) primoNumero + ", BYTE :" + (byte) secondoNumero);
        }

    }

}
