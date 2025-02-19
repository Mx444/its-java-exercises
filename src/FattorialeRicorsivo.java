import java.util.Scanner;

public class FattorialeRicorsivo {
    public static long calcolaFattoriale(int n) {
        if (n == 0)
            return 1;
        return n * calcolaFattoriale(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        System.out.println("Il fattoriale di " + numero + " è: " + calcolaFattoriale(numero));
        scanner.close();
    }
}
