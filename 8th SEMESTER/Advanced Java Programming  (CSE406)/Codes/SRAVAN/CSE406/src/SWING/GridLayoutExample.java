package SWING;

import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Grid Layout Exmaple");
        
        JButton btn1 = new JButton("1");    
        JButton btn2 = new JButton("2");    
        JButton btn3 = new JButton("3");    
        JButton btn4 = new JButton("4");    
        JButton btn5 = new JButton("5");    
        JButton btn6 = new JButton("6");    
        JButton btn7 = new JButton("7");    
        JButton btn8 = new JButton("8");    
        JButton btn9 = new JButton("9");
        
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3,3));
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
