package SWING;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Combo Box Exmaple");
        
        
        JLabel lb = new JLabel();
        lb.setSize(400,100);
        
        String[] country = {"India", "USA", "Japan", "UK"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50,100,90,20);
//        JScrollPane scrollPane = new JScrollPane(cb);
//        scrollPane.setBounds(50, 100, 150, 20);

        
        JButton b = new JButton("Show");
        b.setBounds(200,100,75,20);
        
        b.addActionListener((ActionEvent e)->{
            String data = "Programming Language Selected: "+cb.getItemAt(cb.getSelectedIndex());
            lb.setText(data);
        });
        
        f.add(b);
        f.add(lb);
//        f.add(scrollPane);
        f.add(cb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
