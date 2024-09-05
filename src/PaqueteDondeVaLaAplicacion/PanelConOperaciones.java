package PaqueteDondeVaLaAplicacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelConOperaciones {
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnDivisión;
    private JButton btnSuma;
    private JButton btnMullti;
    private JButton btnResta;
    private JPanel pnlOperaciones;
    private JButton btnBorrar;
    int resultado;
    double resultado2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Operaciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300); //Tamaño de la ventana
        frame.setContentPane(new PanelConOperaciones().pnlOperaciones);
        frame.pack();
        frame.setVisible(true);

    }

    public PanelConOperaciones() {
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = Integer.parseInt(txtNum1.getText()) + Integer.parseInt(txtNum2.getText());
                JOptionPane.showMessageDialog(null, resultado);
            }
        });

        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = Integer.parseInt(txtNum1.getText()) - Integer.parseInt(txtNum2.getText());
                JOptionPane.showMessageDialog(null, resultado);
            }
        });

        btnMullti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado = Integer.parseInt(txtNum1.getText()) * Integer.parseInt(txtNum2.getText());
                JOptionPane.showMessageDialog(null, resultado);
            }
        });

        btnDivisión.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultado2 = Double.parseDouble(txtNum1.getText()) / Double.parseDouble(txtNum2.getText());
                JOptionPane.showMessageDialog(null, resultado2);
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
            }
        });


    }
}
