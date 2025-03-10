package lezione_4_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.io.*;

public class FormUtenti {
    private JFrame frame;
    private JTextField txtNome, txtCognome, txtEta, txtEmail;
    private JTextArea txtAreaUtenti;
    private ArrayList<Utente> listaUtenti;
    private static final String FILE_UTENTI = "utenti.dat";

    public FormUtenti() {
        listaUtenti = caricaUtentiDaFile();

        // listaUtenti = new ArrayList<>();

        frame = new JFrame("Registrazione Utenti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new GridLayout(7, 2, 5, 5));

        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField();

        JLabel lblCognome = new JLabel("Cognome:");
        txtCognome = new JTextField();

        JLabel lblEta = new JLabel("Eta: ");
        txtEta = new JTextField();

        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();

        JButton btnRegistrati = new JButton("Registra Utente");
        JButton btnElimina = new JButton("Elimina Utente");

        txtAreaUtenti = new JTextArea();

        txtAreaUtenti.setEditable(false);
        btnRegistrati.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registraUtente();
            }
        });

        btnElimina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminaUtente();
            }
        });

        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblCognome);
        frame.add(txtCognome);
        frame.add(lblEta);
        frame.add(txtEta);
        frame.add(lblEmail);
        frame.add(txtEmail);
        frame.add(btnRegistrati);
        frame.add(btnElimina);
        frame.add(new JLabel("Utenti registrati:"));
        frame.add(new JScrollPane(txtAreaUtenti));

        aggiornaListaUtenti();
        frame.setVisible(true);
    }

    private void registraUtente() {
        String nome = txtNome.getText().trim();
        String cognome = txtCognome.getText().trim();
        String eta = txtEta.getText().trim();
        String email = txtEmail.getText().trim();

        if (nome.isEmpty() || cognome.isEmpty() || eta.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Tutti i campi sono obbligatori!", "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validaEmail(email)) {
            JOptionPane.showMessageDialog(frame, "Email non valida!", "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Utente nuovoUtente = new Utente(nome, cognome, email, Integer.parseInt(eta));
        listaUtenti.add(nuovoUtente);
        salvaUtentiSuFile();
        aggiornaListaUtenti();

        txtNome.setText("");
        txtCognome.setText("");
        txtEta.setText("");
        txtEmail.setText("");
    }

    private boolean validaEmail(String email) {
        String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regexEmail, email);
    }

    private void aggiornaListaUtenti() {
        StringBuilder sb = new StringBuilder();
        for (Utente u : listaUtenti) {
            sb.append(u.toString()).append("\n");
        }
        txtAreaUtenti.setText(sb.toString());
    }

    private void salvaUtentiSuFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_UTENTI))) {
            oos.writeObject(listaUtenti);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void eliminaUtente() {
        String indiceStr = JOptionPane.showInputDialog(frame, "Inserisci il numero dell'utente da eliminare:");
        try {
            int indice = Integer.parseInt(indiceStr) - 1;
            if (indice < 0 || indice >= listaUtenti.size()) {
                JOptionPane.showMessageDialog(frame, "Numero non valido!", "Errore",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            listaUtenti.remove(indice);
            salvaUtentiSuFile();
            aggiornaListaUtenti();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Inserisci un numero valido!", "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private ArrayList<Utente> caricaUtentiDaFile() {
        File file = new File(FILE_UTENTI);
        if (!file.exists())
            return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_UTENTI))) {
            return (ArrayList<Utente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        new FormUtenti();
    }
}
