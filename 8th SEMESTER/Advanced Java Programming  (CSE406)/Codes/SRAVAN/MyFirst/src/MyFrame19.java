/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author srava
 */
import javax.swing.*;
import java.awt.*;

class MyFrame19 {
    public static void main(String... rk) {
        JFrame f = new JFrame("KE019");
        f.setSize(300, 400);
        f.getContentPane().setBackground(new Color(0, 0, 255, 20));
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel msg = new JLabel("Copyright Reserver @ Sravan Sunkara");
        f.add(msg, BorderLayout.SOUTH);

        JTextField value = new JTextField(20);
        f.add(value, BorderLayout.NORTH);

        JPanel p = new JPanel(new GridLayout(4, 4));

        String[] buttons = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "Clear", "0", "=", "/"};
        for(int i=0; i<buttons.length; i++){
            JButton button = new JButton(buttons[i]);
            p.add(button);
        }

        f.add(p);
        f.setVisible(true);
    }
}
