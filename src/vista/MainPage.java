package vista;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    private JPanel panel1;
    private JTabbedPane Ventanas;
    private JComboBox CBSelect1;
    private JComboBox CBSelect2;
    private JTextArea txtA1;
    private JTextArea txtA2;
    private JButton btnTraducir;

    public MainPage() {
        CBSelect1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {

    }
}
