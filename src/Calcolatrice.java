import java.util.Scanner;

public class Calcolatrice {

    public int somma(int a, int b) {
        return a + b;
    }

    public int sottrazione(int a, int b) {
        return a - b;
    }

    public int divisione(int a, int b) {
        if (b == 0) {
            throw new Error("Errore : Divisone 0");
        }

        return a / b;
    }

    public int moltiplicazione(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Calcolatrice calcolatrice = new Calcolatrice();
            int scelta;

            do {

                System.out.println("Scegli Operazione :");
                System.out.println("1. Somma");
                System.out.println("2. Sottrazione");
                System.out.println("3. Divisione");
                System.out.println("4. Moltiplicazione");
                System.out.println("5. Esci");
                scelta = scanner.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci primo numero :");
                        int num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        int num2 = scanner.nextInt();
                        System.out
                                .println("Somma di : " + num1 + " e " + num2 + " = " + calcolatrice.somma(num1, num2)
                                        + "\n");
                        break;
                    case 2:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Sottrazione di : " + num1 + " e " + num2 + " = "
                                + calcolatrice.sottrazione(num1, num2) + "\n");
                        break;
                    case 3:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Divisione di : " + num1 + " e " + num2 + " = "
                                + calcolatrice.divisione(num1, num2) + "\n");
                        break;
                    case 4:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Moltiplicazione di : " + num1 + " e " + num2 + " = "
                                + calcolatrice.moltiplicazione(num1, num2) + "\n");
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } while (scelta >= 1 && scelta <= 5);
        }

    }
}
