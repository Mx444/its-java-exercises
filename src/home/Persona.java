package home;

public class Persona {
    String nome;
    int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void saluta() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }

    public static void main(String[] args) {
        Persona user = new Persona("Mario", 30);
        user.saluta();
    }
}