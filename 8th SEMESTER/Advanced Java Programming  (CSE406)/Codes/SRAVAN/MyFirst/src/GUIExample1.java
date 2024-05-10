import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.*;
import javax.swing.*;

public class GUIExample1 {
    public static void main(String[] args){
        //FRAME
        JFrame frame = new JFrame("FORM");
        
        //TEXT FIELD
        JTextField tf = new JTextField();
        tf.setBounds(100,70,140,25);
        
        //LABELS
        JLabel Name, Gender, Sports;
        
        Name = new JLabel("Name: ");
        Name.setBounds(50, 70, 80, 30);
        
        Gender = new JLabel("Gender: ");
        Gender.setBounds(50, 110, 100, 30);
        
        Sports = new JLabel("Sports: ");
        Sports.setBounds(50,140,100,30);
        
        
        //RADIO BUTTON
        JRadioButton male = new JRadioButton("male");
        male.setBounds(100,110,80,30);
        
        JRadioButton female = new JRadioButton("female");
        female.setBounds(180,110,80,30);
               
        
        //CHECKBOX
        JCheckBox cricket = new JCheckBox("cricket");
        cricket.setBounds(100,140,80,30);
        
        JCheckBox football = new JCheckBox("football");
        football.setBounds(180,140,80,30);
        
        JCheckBox volleyball = new JCheckBox("volleyball");
        volleyball.setBounds(100,170,80,30);
        
        JCheckBox chess = new JCheckBox("chess");
        chess.setBounds(180,170,80,30);
        
        
        //REGISTER BUTTON
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100,210,140,25);
        
        //ADDING EVERYTHING TO FRAME
        frame.add(registerButton);
        frame.add(tf);
        frame.add(Name);
        frame.add(Gender);
        frame.add(male);
        frame.add(female);
        frame.add(Sports);
        frame.add(cricket);
        frame.add(football);
        frame.add(volleyball);
        frame.add(chess);
        
        frame.setSize(350,350);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
        registerButton.addActionListener((ActionEvent e) -> {
            String name = tf.getText();
            String gender = male.isSelected() ? "MR" : "MRS";
            String sports = "";
            
            if (cricket.isSelected()) {
                sports += "Cricket";
            }
            if (football.isSelected()) {
                sports += "Football";
            }
            if (volleyball.isSelected()) {
                sports += "Volleyball";
            }
            if (chess.isSelected()) {
                sports += "Chess";
            }
            
            String message = gender + "." + name + " you have registered for " + sports + ".";
            JOptionPane.showMessageDialog(frame, message, "Registration Information", JOptionPane.INFORMATION_MESSAGE);
        });

    }
    
}
