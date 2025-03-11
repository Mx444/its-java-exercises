package lezione_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GestioneCorsi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String corsi[] = { "Matematica", "Informatica", "Fisica" };

        int[][] voti = {
                { 85, 90, 78 },
                { 88, 76, 95 },
                { 92, 89 }
        };

        String[][] studenti = {
                { "Alice", "Bob", "Charlie" },
                { "David", "Eve", "Frank" },
                { "Grace", "Henry" }
        };

        ArrayList<String> listaCorsi = new ArrayList<>(Arrays.asList(corsi));

        ArrayList<ArrayList<String>> listaStudenti = new ArrayList<>();
        for (String[] s : studenti) {
            listaStudenti.add(new ArrayList<>(Arrays.asList(s)));
        }

        boolean continua = true;
        while (continua) {

            System.out.println("\n **Sistema di Gestione Corsi**");
            System.out.println("1. Visualizza corsi e studenti");
            System.out.println("2. Aggiungi un nuovo corso");
            System.out.println("3. Aggiungi uno studente a un corso");
            System.out.println("4. Modifica il voto di uno studente");
            System.out.println("5. Svuota un corso (rimuovi tutti gli studenti)");
            System.out.println("6. Elimina un corso");
            System.out.println("7. Esci");
            System.out.print("Seleziona un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    for (int i = 0; i < listaCorsi.size(); i++) {
                        System.out.println(listaCorsi.get(i) + " : " + listaStudenti.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Inserisci un nuovo corso : ");
                    String nuovoCorso = scanner.nextLine();
                    listaCorsi.add(nuovoCorso);
                    listaStudenti.add(new ArrayList<>());
                    System.out.println("Corso aggiunto con successo !");
                    break;
                case 3:

                    System.out.println("Inserisci il nome del corso : ");
                    String corsoDaAggiornare = scanner.nextLine();
                    int indexDelCorso = listaCorsi.indexOf(corsoDaAggiornare);

                    if (indexDelCorso != -1) {
                        System.out.println("Inserisci un nuovo studente : ");
                        String nuovoStudente = scanner.nextLine();
                        listaStudenti.get(indexDelCorso).add(nuovoStudente);
                        System.out.println("Studente aggiunto con successo ! ");
                    } else {
                        System.out.println("Corso non trovato !");

                    }
                    break;
                case 4:
                    System.out.print("Inserisci il nome del corso: ");
                    String corsoModifica = scanner.nextLine();
                    int corsoIndex = listaCorsi.indexOf(corsoModifica);
                    if (corsoIndex != -1) {
                        System.out.print("Inserisci il nome dello studente: ");
                        String studenteModifica = scanner.nextLine();
                        int studenteIndex = listaStudenti.get(corsoIndex).indexOf(studenteModifica);
                        if (studenteIndex != -1) {
                            System.out.println("Inserisci un nuovo voto :");
                            int nuovoVoto = scanner.nextInt();
                            voti[corsoIndex][studenteIndex] = nuovoVoto;
                            System.out.print("Nuovo voto aggiunto !");
                        } else {
                            System.out.print("Studente non trovato !");
                        }
                    } else {
                        System.out.println("Corso non trovato !");
                    }
                    break;
                case 5:
                    System.out.print("Inserisci il nome del corso da svuotare: ");
                    String corsoDaSvuotare = scanner.nextLine();
                    int corsoSvuotaIndex = listaCorsi.indexOf(corsoDaSvuotare);
                    if (corsoSvuotaIndex != -1) {
                        listaStudenti.get(corsoSvuotaIndex).clear();
                        System.out.println("Tutti gli studenti sono stati rimossi dal corso.");
                    } else {
                        System.out.println("Corso non trovato.");
                    }
                    break;
                case 6:
                    System.out.print("Inserisci il nome del corso da eliminare: ");
                    String corsoDaEliminare = scanner.nextLine();
                    int corsoEliminaIndex = listaCorsi.indexOf(corsoDaEliminare);
                    if (corsoEliminaIndex != -1) {
                        listaCorsi.remove(corsoEliminaIndex);
                        listaStudenti.remove(corsoEliminaIndex);
                        System.out.println("Corso eliminato con successo!");
                    } else {
                        System.out.println("Corso non trovato.");
                    }
                    break;
                case 7:
                    continua = false;
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Operazione non valida !");
                    break;
            }
        }

    }

}
