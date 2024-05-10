package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import teacher.Teacher;

public class Login extends JFrame implements ActionListener{
    JButton login;
    JTextField nameField, passwordField;
    
    Login(){
        getContentPane().setBackground(Color.getHSBColor(55, 44, 33));
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
        gbc.insets = new Insets(5, 5, 5, 5);
        
        
        JLabel name = new JLabel("Username:");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(name, gbc);
        
        nameField = new JTextField(15);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(nameField, gbc);

        
        JLabel password = new JLabel("Password:"); 
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(password, gbc);
        
        passwordField = new JTextField(15);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(passwordField, gbc);
        
        login = new JButton("Login");
        gbc.gridx = 2;
        gbc.gridy = 3;
        login.addActionListener(this);
        add(login, gbc);
        
        
        setSize(450, 450);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String userName = nameField.getText();
        String password = passwordField.getText();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "2002");
            PreparedStatement teacherStatement = connection.prepareStatement("SELECT * FROM teacher WHERE name=? AND password=?");
            teacherStatement.setString(1, userName);
            teacherStatement.setString(2, password);
            ResultSet teacherResult = teacherStatement.executeQuery();
            if(teacherResult.next()){
                setVisible(false);
                new Teacher();
            }else{
                PreparedStatement studentStatement = connection.prepareStatement("SELECT * FROM students WHERE name=? AND regno=?");
                studentStatement.setString(1, userName);
                studentStatement.setString(2, password);

                ResultSet studentResult = studentStatement.executeQuery();
                if(studentResult.next()){
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }
            
            connection.close();
                
        } catch(Exception loginE){
            System.out.println(loginE);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
