import java.util.Scanner;

public class Utente {
    public String controlloEta(int a) {
        if (a >= 0 && a <= 17) {
            return "Sei Minorenne : " + a;
        }
        if (a >= 18 && a <= 50) {
            return "Sei Adulto : " + a;
        }
        if (a >= 50) {
            return "Sei Anziano : " + a;
        }
        return null;
    }

    public static void main(String[] args) {
        Utente utente = new Utente();
        Scanner controllo = new Scanner(System.in);

        try (controllo) {
            System.out.println("Inserisci la tua eta' : ");
            int eta = controllo.nextInt();
            System.out.println(utente.controlloEta(eta));
        }
    }
}
