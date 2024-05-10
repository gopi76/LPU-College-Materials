package jdbcproject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCproject {
    public static void main(String[] args) {
        
        // Create the frame
        JFrame frame = new JFrame("Student Details Form");
        frame.setSize(400, 250);
        frame.setLayout(null);

        // Labels and TextFields for each field
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 80, 25);
        frame.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);
        frame.add(nameField);

        JLabel regNoLabel = new JLabel("Reg No:");
        regNoLabel.setBounds(50, 60, 80, 25);
        frame.add(regNoLabel);
        JTextField regNoField = new JTextField();
        regNoField.setBounds(150, 60, 200, 25);
        frame.add(regNoField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 90, 80, 25);
        frame.add(emailLabel);
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 90, 200, 25);
        frame.add(emailField);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 120, 80, 25);
        frame.add(genderLabel);
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genders);
        genderBox.setBounds(150, 120, 80, 25);
        frame.add(genderBox);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 150, 80, 25);
        frame.add(cityLabel);
        JTextField cityField = new JTextField();
        cityField.setBounds(150, 150, 200, 25);
        frame.add(cityField);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 180, 100, 25);
        submitButton.addActionListener((ActionEvent e) -> {
            // Retrieve data from the fields
            String name = nameField.getText();
            String regNo = regNoField.getText();
            String email = emailField.getText();
            String gender = (String) genderBox.getSelectedItem();
            String city = cityField.getText();
            
            try {
                // Load JDBC driver and establish connection
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "2002");
                
                // Prepare SQL statement and insert data
                PreparedStatement insertOp = con.prepareStatement("insert into details values(?, ?, ?, ?, ?)");
                insertOp.setString(1, name);
                insertOp.setString(2, regNo);
                insertOp.setString(3, email);
                insertOp.setString(4, gender);
                insertOp.setString(5, city);
                int i = insertOp.executeUpdate();
                
                // Display success/failure message
                if (i > 0) {
                    JOptionPane.showMessageDialog(frame, "Success");
                } else {
                    JOptionPane.showMessageDialog(frame, "Failed to insert data", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
//                PreparedStatement updateOp = con.prepareStatement("update details set city=? where reg_no=?");
//                updateOp.setString(1, city);
//                updateOp.setString(2, regNo);
//                int j = updateOp.executeUpdate();
//                
//                if (j > 0) {
//                    JOptionPane.showMessageDialog(frame, "Success");
//                } else {
//                    JOptionPane.showMessageDialog(frame, "Failed to update data", "Error", JOptionPane.ERROR_MESSAGE);
//                }
                
                // Close connection
                con.close();
            } catch (ClassNotFoundException | SQLException ex) {
                // Handle exceptions
                JOptionPane.showMessageDialog(frame, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        frame.add(submitButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
