package SWING;

import java.awt.event.ItemEvent;
import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Checkbox example");
        JLabel l = new JLabel();
        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("C++");
        
        checkBox1.setBounds(100,100, 100,50);
        checkBox2.setBounds(100,150, 50,50);
        l.setSize(400,100);   
        
        checkBox1.addItemListener((ItemEvent e)->{
            l.setText("JAVA Checkbox: "+(e.getStateChange()==1?"Checked":"UnChecked"));
        });
        
        checkBox2.addItemListener((ItemEvent e)->{
            l.setText("C++ Checkbox: "+(e.getStateChange()==1?"Checked":"UnChecked"));
        });
        
        f.add(l);
        f.add(checkBox1);
        f.add(checkBox2);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}