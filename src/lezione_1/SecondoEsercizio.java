package lezione_1;

import java.util.Scanner;

public class SecondoEsercizio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Inserisci il primo numero : ");
            int primoNumero = scanner.nextInt();

            System.out.println("Inserisci il secondo numero : ");
            int secondoNumero = scanner.nextInt();

            float somma = primoNumero + secondoNumero;
            System.out.println("Somma : " + somma);

            float differenza = primoNumero - secondoNumero;
            System.out.println("Differenza : " + differenza);

            float prodotto = primoNumero * secondoNumero;
            System.out.println("Prodotto : " + prodotto);

        }
    }

}
