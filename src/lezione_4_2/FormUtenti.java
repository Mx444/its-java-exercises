package lezione_4_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class FormUtenti {
    private JFrame frame;
    private JTextField txtNome, txtCognome, txtEmail;
    private JTextArea txtAreaUtenti;
    private ArrayList<Utente> listaUtenti;

    public FormUtenti() {
        listaUtenti = new ArrayList<>();
        frame = new JFrame("Registrazione Utenti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new GridLayout(5, 2, 5, 5));
        JLabel lblNome = new JLabel("Nome:");
        txtNome = new JTextField();
        JLabel lblCognome = new JLabel("Cognome:");
        txtCognome = new JTextField();
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();
        JButton btnRegistrati = new JButton("Registra Utente");
        txtAreaUtenti = new JTextArea();
        txtAreaUtenti.setEditable(false);
        btnRegistrati.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registraUtente();
            }
        });
        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblCognome);
        frame.add(txtCognome);
        frame.add(lblEmail);
        frame.add(txtEmail);
        frame.add(btnRegistrati);
        frame.add(new JLabel("Utenti registrati:"));
        frame.add(new JScrollPane(txtAreaUtenti));
        frame.setVisible(true);
    }

    private void registraUtente() {
        String nome = txtNome.getText().trim();
        String cognome = txtCognome.getText().trim();
        String email = txtEmail.getText().trim();

        if (nome.isEmpty() || cognome.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Tutti i campi sono obbligatori!", "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!validaEmail(email)) {
            JOptionPane.showMessageDialog(frame, "Email non valida!", "Errore",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        Utente nuovoUtente = new Utente(nome, cognome, email);
        listaUtenti.add(nuovoUtente);
        aggiornaListaUtenti();
        txtNome.setText("");
        txtCognome.setText("");
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

    public static void main(String[] args) {
        new FormUtenti();
    }
}
