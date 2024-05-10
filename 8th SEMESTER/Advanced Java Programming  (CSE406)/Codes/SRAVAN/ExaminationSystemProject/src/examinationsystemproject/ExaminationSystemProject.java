package examinationsystemproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExaminationSystemProject {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Examination System");
        frame.setLayout(new BorderLayout());
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        //log in page
        JPanel startPagePanel = new JPanel(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        //heading
        JLabel headingLabel = new JLabel("LOGIN");
        startPagePanel.add(headingLabel, gbc);
        
        //name label
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        startPagePanel.add(nameLabel, gbc);
        
        //name field
        JTextField nameField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        startPagePanel.add(nameField, gbc);
        
        //password label
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        startPagePanel.add(passwordLabel, gbc);
        
        //name field
        JTextField passwordField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 2;
        startPagePanel.add(passwordField, gbc);
        
        //login button
        JButton loginButton = new JButton("login");
        gbc.gridx = 1;
        gbc.gridy = 3;
        startPagePanel.add(loginButton, gbc);
        
        //action listener for login button
        loginButton.addActionListener((ActionEvent e)->{
            String name = nameField.getText();
            String password = passwordField.getText();
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/class", "root", "2002");
                PreparedStatement teacherStatement = con.prepareStatement("SELECT * FROM teacher WHERE name=? AND password=?");
                teacherStatement.setString(1, name);
                teacherStatement.setString(2, password);
                
                ResultSet teacherResult = teacherStatement.executeQuery();
                
                if(teacherResult.next()){
                    startPagePanel.removeAll();
                    
                    JPanel teacherStartPagePanel = new JPanel(new GridBagLayout());
                    GridBagConstraints teacherGBC = new GridBagConstraints();
                    teacherGBC.gridx = 0;
                    teacherGBC.gridy = 0;
                    teacherGBC.anchor = GridBagConstraints.WEST;
                    teacherGBC.insets = new Insets(10, 10, 10, 10);
                    
                    //Heading
                    JLabel teacherHeadingLabel = new JLabel("EXAMINATION MANAGEMENT SYSTEM");
                    teacherStartPagePanel.add(teacherHeadingLabel, teacherGBC);

                    //Insert button
                    JButton insertButton = new JButton("INSERT");
                    teacherGBC.gridx = 0;
                    teacherGBC.gridy = 1;
                    teacherGBC.anchor = GridBagConstraints.CENTER;
                    teacherStartPagePanel.add(insertButton, teacherGBC);
                    
                    //Insert button action listener
                    insertButton.addActionListener((ActionEvent insertE) -> {
                        teacherStartPagePanel.removeAll();
                        
                        JPanel insertInputPanel = new JPanel(new GridBagLayout());
                        GridBagConstraints insertGBC = new GridBagConstraints();
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 0;
                        insertGBC.anchor = GridBagConstraints.WEST;
                        insertGBC.insets = new Insets(10, 10, 10, 10);
                        
                        //label for insert heading
                        JLabel insertHeadingLabel = new JLabel("INSERT STUDENT DETAILS");
                        insertInputPanel.add(insertHeadingLabel, insertGBC);
                        
                        //name label
                        JLabel insertNameLabel = new JLabel("Name:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 1;
                        insertInputPanel.add(insertNameLabel, insertGBC);

                        //name field
                        JTextField insertNameField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 1;
                        insertInputPanel.add(insertNameField, insertGBC);
                        
                        //registration number
                        JLabel insertRegNoLabel = new JLabel("Registration No:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 2;
                        insertInputPanel.add(insertRegNoLabel, insertGBC);

                        //reg field
                        JTextField insertRegNoField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 2;
                        insertInputPanel.add(insertRegNoField, insertGBC);

                        //maths label
                        JLabel mathsLabel = new JLabel("Maths:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 3;
                        insertInputPanel.add(mathsLabel, insertGBC);
                        
                        //maths field
                        JTextField mathsField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 3;
                        insertInputPanel.add(mathsField, insertGBC);
                        
                        //physics label
                        JLabel physicsLabel = new JLabel("Physics:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 4;
                        insertInputPanel.add(physicsLabel, insertGBC);
                        
                        //physics field
                        JTextField physicsField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 4;
                        insertInputPanel.add(physicsField, insertGBC);
                        
                        //chemistry label
                        JLabel chemistryLabel = new JLabel("Chemistry:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 5;
                        insertInputPanel.add(chemistryLabel, insertGBC);
                        
                        //chemistry field
                        JTextField ChemistryField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 5;
                        insertInputPanel.add(ChemistryField, insertGBC);
                        
                        //total label
                        JLabel totalLabel = new JLabel("Total:");
                        insertGBC.gridx = 0;
                        insertGBC.gridy = 6;
                        insertInputPanel.add(totalLabel, insertGBC);
                        
                        //total field
                        JTextField totalField = new JTextField(20);
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 6;
                        insertInputPanel.add(totalField, insertGBC);
                        
                        //submit button
                        JButton insertSubmitButton = new JButton("Insert");
                        insertGBC.gridx = 1;
                        insertGBC.gridy = 6;
                        insertInputPanel.add(insertSubmitButton, insertGBC);
                        
                        
                        
                        teacherStartPagePanel.add(insertInputPanel, teacherGBC);
                        frame.revalidate();
                        frame.repaint();
                    });
                    
                    
                    startPagePanel.add(teacherStartPagePanel, gbc);
                    frame.revalidate();
                    frame.repaint();
                } else{
                    PreparedStatement studentStatement = con.prepareStatement("SELECT * FROM students WHERE name=? AND regno=?");
                    studentStatement.setString(1, name);
                    studentStatement.setString(2, password);
                        
                    ResultSet studentResult = studentStatement.executeQuery();
                    if(studentResult.next()){
                        startPagePanel.removeAll();
                        frame.revalidate();
                        frame.repaint();
                    }
                }
                
                teacherResult.close();
                teacherStatement.close();
                con.close();
                
            } catch(Exception loginE){
                System.out.println(loginE);
            }
        });
        
        frame.add(startPagePanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
