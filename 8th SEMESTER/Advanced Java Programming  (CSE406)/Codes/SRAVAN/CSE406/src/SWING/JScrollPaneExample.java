package SWING;

import javax.swing.*;

public class JScrollPaneExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Scroll Pane Exmaple");
        
        JScrollPane sp = new JScrollPane();
        
        f.add(sp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
