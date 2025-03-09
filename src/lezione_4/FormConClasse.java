package lezione_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormConClasse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Modulo di Registrazione");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new GridLayout(5, 2, 5, 5));
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();
        JLabel lblCognome = new JLabel("Cognome:");
        JTextField txtCognome = new JTextField();
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();
        JButton btnInvia = new JButton("Invia");
        JLabel lblRisultato = new JLabel("");
        btnInvia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String cognome = txtCognome.getText();
                String email = txtEmail.getText();
                Utente utente = new Utente(nome, cognome, email);
                lblRisultato.setText("Dati salvati: " + utente.getNome() + " " + utente.getCognome() + ", "
                        + utente.getEmail());
                utente.stampaDati();
            }
        });
        frame.add(lblNome);
        frame.add(txtNome);
        frame.add(lblCognome);
        frame.add(txtCognome);
        frame.add(lblEmail);
        frame.add(txtEmail);
        frame.add(btnInvia);
        frame.add(lblRisultato);
        frame.setVisible(true);
    }
}