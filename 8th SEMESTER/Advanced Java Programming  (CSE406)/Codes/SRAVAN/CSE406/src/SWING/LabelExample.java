package SWING;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class LabelExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Label Example");
        JLabel l1 = new JLabel("Label 1");
//        JLabel l2 = new JLabel("Label 2");
        JTextField tf = new JTextField();
        JButton b = new JButton("Find IP");
        
        tf.setBounds(50, 50, 150, 20);
        b.setBounds(50, 150, 95, 30);
        l1.setBounds(50,100, 250,20);
//        l2.setBounds(50, 100, 100, 30);
        
        b.addActionListener((ActionEvent e)->{
            try{
                String host = tf.getText();
                String ip = java.net.InetAddress.getByName(host).getHostAddress();
                l1.setText("IP of "+host+" is:"+ip);
            }catch(Exception ex){
                System.out.println(ex);
            }
        });

        f.add(l1);
//        f.add(l2);
        f.add(tf);
        f.add(b);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
