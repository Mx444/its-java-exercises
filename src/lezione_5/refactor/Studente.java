package lezione_5.refactor;

public class Studente {
    private String nome;
    private int voto;

    public Studente(String nome, int voto) {
        this.nome = nome;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return nome + " (Voto: " + voto + ")";
    }
}
