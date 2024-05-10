package SWING;

import java.awt.event.ActionEvent;
import javax.swing.*;


public class JTextFieldExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Text Field Example");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        
        tf1.setBounds(50, 50, 100, 50);
        tf2.setBounds(50, 100, 100, 50);
        tf3.setBounds(50, 150, 100, 50);
        
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        
        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(100, 200, 50, 50);
        
        b1.addActionListener((ActionEvent e)->{
            
        });
        
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
