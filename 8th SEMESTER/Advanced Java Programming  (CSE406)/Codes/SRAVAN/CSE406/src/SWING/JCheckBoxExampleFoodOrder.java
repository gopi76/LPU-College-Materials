package SWING;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JCheckBoxExampleFoodOrder {
    public static void main(String[] args){
        JFrame f = new JFrame("Food Order");
        
        JLabel l = new JLabel("Food Ordering System");
        l.setBounds(50,50,300,20);
        
        JCheckBox cb1 = new JCheckBox("Pizza @100");
        JCheckBox cb2 = new JCheckBox("Burger @30");
        JCheckBox cb3 = new JCheckBox("Tea @10");
        
        cb1.setBounds(100,100,150,20);
        cb2.setBounds(100,150,150,20);
        cb3.setBounds(100,200,150,20);
        
        JButton b = new JButton("Order");
        b.setBounds(100,250,80,30);
        
        
        b.addActionListener((ActionEvent e)->{
            float amount = 0;
            String msg = "";
            if(cb1.isSelected()){
                amount += 100;
                msg += "Pizza: 100\n";
            }
            
            if(cb2.isSelected()){
                amount += 30;
                msg += "Burger: 30\n";
            }
            
            if(cb3.isSelected()){
                amount += 10;
                msg += "Tea: 10\n";
            }
            
            msg+="-------------\n";
            JOptionPane.showMessageDialog(f,msg+"Total: "+amount);
            
        });
        
        f.add(l);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);
        
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
