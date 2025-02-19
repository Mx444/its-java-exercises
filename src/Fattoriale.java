import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        long fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }

        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
        scanner.close();
    }
}
