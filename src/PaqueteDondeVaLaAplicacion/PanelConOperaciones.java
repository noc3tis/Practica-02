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
    int resultado;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primer App con Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300); //Tamaño de la ventana
        frame.setContentPane(new Panel().pnlInicio);
        //frame.setBounds(30,30,500,300);
        //prueba del git
        //prueba tres
        //
        //cambio
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


    }
}
