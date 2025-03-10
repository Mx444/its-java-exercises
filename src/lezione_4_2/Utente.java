package lezione_4_2;

import java.io.Serializable;

class Utente implements Serializable {
    private String nome;
    private String cognome;
    private String email;
    private int eta;

    public Utente(String nome, String cognome, String email, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public int getEta() {
        return this.eta;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " - " + email + " - Età: " + eta;
    }
}