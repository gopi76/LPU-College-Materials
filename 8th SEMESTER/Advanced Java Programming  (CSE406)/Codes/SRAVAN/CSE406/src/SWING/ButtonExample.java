package SWING;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.add(tf);
//        b.addActionListener(new ActionListener(){
//           public void actionPerformed(ActionEvent e){
//               tf.setText("Welcome to JavaPoint");
//           } 
//        });
        b.addActionListener((ActionEvent e) -> {
            tf.setText("Welcome to Java");
        });
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}
