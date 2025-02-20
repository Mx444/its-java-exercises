import java.util.Scanner;

public class Calcolatrice {

    public static void printMenu() {
        System.out.println("Scegli Operazione :");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Divisione");
        System.out.println("4. Moltiplicazione");
        System.out.println("5. Esci");
    }

    public static int somma(int a, int b) {
        return a + b;
    }

    public static int sottrazione(int a, int b) {
        return a - b;
    }

    public static int divisione(int a, int b) {
        if (b == 0) {
            System.out.println("Errore : Divisione per 0");
            return 0;
        }
        return a / b;
    }

    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            int scelta;

            do {
                Calcolatrice.printMenu();
                scelta = scanner.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci primo numero :");
                        int num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        int num2 = scanner.nextInt();
                        System.out
                                .println("Somma di : " + num1 + " e " + num2 + " = " + Calcolatrice.somma(num1, num2)
                                        + "\n");
                        break;
                    case 2:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Sottrazione di : " + num1 + " e " + num2 + " = "
                                + Calcolatrice.sottrazione(num1, num2) + "\n");
                        break;
                    case 3:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Divisione di : " + num1 + " e " + num2 + " = "
                                + Calcolatrice.divisione(num1, num2) + "\n");
                        break;
                    case 4:
                        System.out.println("Inserisci primo numero :");
                        num1 = scanner.nextInt();
                        System.out.println("Inserisci secondo numero :");
                        num2 = scanner.nextInt();
                        System.out.println("Moltiplicazione di : " + num1 + " e " + num2 + " = "
                                + Calcolatrice.moltiplicazione(num1, num2) + "\n");
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
