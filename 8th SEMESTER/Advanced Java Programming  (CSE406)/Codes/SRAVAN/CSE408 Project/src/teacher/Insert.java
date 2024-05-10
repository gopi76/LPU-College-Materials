
package teacher;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Insert extends JFrame implements ActionListener {
    JButton submit;
    JTextField nameField, regnoField, mathsField, physicsField, chemistryField, totalField;
    
    public Insert(){
        setSize(450, 450);
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
        gbc.insets = new Insets(10, 10, 10, 10);
        
        
        JLabel name = new JLabel("Name:");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(name, gbc);
        
        nameField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(nameField, gbc);
        
        JLabel regno = new JLabel("Registration:");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(regno, gbc);
        
        regnoField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(regnoField, gbc);
        
        JLabel maths = new JLabel("Maths:");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(maths, gbc);
        
        mathsField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(mathsField, gbc);
        
        JLabel physics = new JLabel("Physics:");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(physics, gbc);
        
        physicsField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(physicsField, gbc);
        
        JLabel chemistry = new JLabel("Chemistry:");
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(chemistry, gbc);
        
        chemistryField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 5;
        add(chemistryField, gbc);
        
        JLabel total = new JLabel("Total:");
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(total, gbc);
        
        totalField = new JTextField(10);
        gbc.gridx = 2;
        gbc.gridy = 6;
        add(totalField, gbc);
        
        submit = new JButton("Submit");
        gbc.gridx = 2;
        gbc.gridy = 7;
        submit.setPreferredSize(new Dimension(100, 20));
        submit.addActionListener(this);
        add(submit, gbc);
        
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e){
        String name = nameField.getText();
        String regno = regnoField.getText();
        String mathsStr = mathsField.getText();
        String physicsStr = physicsField.getText();
        String chemistryStr = chemistryField.getText();
        String totalStr = totalField.getText();
        
        Double maths = Double.valueOf(mathsStr);
        Double physics = Double.valueOf(physicsStr);
        Double chemistry = Double.valueOf(chemistryStr);
        Double total = Double.valueOf(totalStr);
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "2002");
            
            PreparedStatement statement = connection.prepareStatement("INSERT INTO STUDENTS VALUES(?,?,?,?,?,?)");
            
            statement.setString(1, name);
            statement.setString(2, regno);
            statement.setDouble(3, maths);
            statement.setDouble(4, physics);
            statement.setDouble(5, chemistry);
            statement.setDouble(6, total);
            
            int i = statement.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Student details inserted successfully");
                nameField.setText("");
                regnoField.setText("");
                mathsField.setText("");
                physicsField.setText("");
                chemistryField.setText("");
                totalField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to insert data", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            connection.close();
            
        } catch (Exception insertEx){
            System.out.println(insertEx);
        }
        
        
    }
    
    public static void main(String[] args){
        new Insert();
    }
}
