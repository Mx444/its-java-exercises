package lezione_5.refactor;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    private String nome;
    private List<Studente> studenti;

    public Corso(String nome) {
        this.nome = nome;
        this.studenti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Studente> getStudenti() {
        return studenti;
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public Studente trovaStudente(String nomeStudente) {
        for (Studente studente : studenti) {
            if (studente.getNome().equalsIgnoreCase(nomeStudente)) {
                return studente;
            }
        }
        return null;
    }

    public void rimuoviStudente(String nomeStudente) {
        Studente studente = trovaStudente(nomeStudente);
        if (studente != null) {
            studenti.remove(studente);
        }
    }

    public void svuotaCorso() {
        studenti.clear();
    }

    @Override
    public String toString() {
        return nome + " : " + studenti;
    }
}
