package SWING;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Radio Button Example");
        
        JRadioButton r1 = new JRadioButton("A) MALE");
        JRadioButton r2 = new JRadioButton("B) FEMALE");
        
        r1.setBounds(100,50,100,30);    
        r2.setBounds(100,100,100,30); 
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        JButton b = new JButton("Click");
        b.setBounds(100,150,80,30);
        
        
        b.addActionListener((ActionEvent e)->{
            if(r1.isSelected()){
                JOptionPane.showMessageDialog(f, "You are MALE");
        }
        
            if(r2.isSelected()){
                JOptionPane.showMessageDialog(f, "You are FEMALE");
            }
        });
        
        
        f.add(b);
        f.add(r1);
        f.add(r2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
