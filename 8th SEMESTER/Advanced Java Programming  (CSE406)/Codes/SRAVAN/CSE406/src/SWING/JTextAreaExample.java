package SWING;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JTextAreaExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Text Area Example");
        JLabel l1 = new JLabel();
        JLabel l2 = new JLabel();
        JButton b = new JButton("Count Words");
        
        l1.setBounds(50,25,100,30);
        l2.setBounds(160,25,100,30);
        b.setBounds(100,300,120,30);
        
        JTextArea area = new JTextArea();
        area.setBounds(20,75,250,200);
        
        b.addActionListener((ActionEvent e)->{
            String text = area.getText();
            String words[] = text.split("\\s");
            l1.setText("Words: "+ words.length);
            l2.setText("Characters: "+ text.length());
        });
        
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
