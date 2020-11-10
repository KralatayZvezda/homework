package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame{
    private JPanel panel1;
    private JLabel Image1;
    private JButton vavodButton;
    private JButton clearButton;
    private JButton exitButton;
    private JTextField textFieldKryg;
    private JTextField textFieldDyga;
    private JTextField textFieldExit;

    public test() {

        setContentPane(panel1);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textFieldKryg.setText("");
                textFieldDyga.setText("");
                textFieldExit.setText("");
            }
        });
        vavodButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    double R, L;
                    R = Double.parseDouble(textFieldKryg.getText());
                    L = Double.parseDouble(textFieldDyga.getText());
                    textFieldExit.setText(String.valueOf(R * L / 2));
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(panel1, "Разрешено вводить только числа!");
                    error.printStackTrace();
                }
            }
        });
    }

    private void createUIComponents() {
         
    }
}
