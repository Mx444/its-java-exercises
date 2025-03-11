package lezione_5.refactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioneCorsi {
    private List<Corso> corsi;
    private Scanner scanner;

    public GestioneCorsi() {
        corsi = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void avvia() {
        boolean continua = true;
        while (continua) {
            mostraMenu();
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    visualizzaCorsiEStudenti();
                    break;
                case 2:
                    aggiungiNuovoCorso();
                    break;
                case 3:
                    aggiungiStudenteACorso();
                    break;
                case 4:
                    modificaVotoStudente();
                    break;
                case 5:
                    svuotaCorso();
                    break;
                case 6:
                    eliminaCorso();
                    break;
                case 7:
                    continua = false;
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Operazione non valida!");
                    break;
            }
        }
    }

    private void mostraMenu() {
        System.out.println("\n** Sistema di Gestione Corsi **");
        System.out.println("1. Visualizza corsi e studenti");
        System.out.println("2. Aggiungi un nuovo corso");
        System.out.println("3. Aggiungi uno studente a un corso");
        System.out.println("4. Modifica il voto di uno studente");
        System.out.println("5. Svuota un corso (rimuovi tutti gli studenti)");
        System.out.println("6. Elimina un corso");
        System.out.println("7. Esci");
        System.out.print("Seleziona un'opzione: ");
    }

    private void visualizzaCorsiEStudenti() {
        for (Corso corso : corsi) {
            System.out.println(corso);
        }
    }

    private void aggiungiNuovoCorso() {
        System.out.print("Inserisci il nome del nuovo corso: ");
        String nomeCorso = scanner.nextLine();
        corsi.add(new Corso(nomeCorso));
        System.out.println("Corso aggiunto con successo!");
    }

    private void aggiungiStudenteACorso() {
        Corso corso = selezionaCorso();
        if (corso != null) {
            System.out.print("Inserisci il nome dello studente: ");
            String nomeStudente = scanner.nextLine();
            System.out.print("Inserisci il voto dello studente: ");
            int voto = scanner.nextInt();
            scanner.nextLine();
            corso.aggiungiStudente(new Studente(nomeStudente, voto));
            System.out.println("Studente aggiunto con successo!");
        } else {
            System.out.println("Corso non trovato!");
        }
    }

    private void modificaVotoStudente() {
        Corso corso = selezionaCorso();
        if (corso != null) {
            System.out.print("Inserisci il nome dello studente: ");
            String nomeStudente = scanner.nextLine();
            Studente studente = corso.trovaStudente(nomeStudente);
            if (studente != null) {
                System.out.print("Inserisci il nuovo voto: ");
                int nuovoVoto = scanner.nextInt();
                scanner.nextLine();
                studente.setVoto(nuovoVoto);
                System.out.println("Voto aggiornato con successo!");
            } else {
                System.out.println("Studente non trovato!");
            }
        } else {
            System.out.println("Corso non trovato!");
        }
    }

    private void svuotaCorso() {
        Corso corso = selezionaCorso();
        if (corso != null) {
            corso.svuotaCorso();
            System.out.println("Tutti gli studenti sono stati rimossi dal corso.");
        } else {
            System.out.println("Corso non trovato!");
        }
    }

    private void eliminaCorso() {
        Corso corso = selezionaCorso();
        if (corso != null) {
            corsi.remove(corso);
            System.out.println("Corso eliminato con successo!");
        } else {
            System.out.println("Corso non trovato!");
        }
    }

    private Corso selezionaCorso() {
        System.out.print("Inserisci il nome del corso: ");
        String nomeCorso = scanner.nextLine();
        for (Corso corso : corsi) {
            if (corso.getNome().equalsIgnoreCase(nomeCorso)) {
                return corso;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GestioneCorsi gestioneCorsi = new GestioneCorsi();
        gestioneCorsi.avvia();
    }
}
