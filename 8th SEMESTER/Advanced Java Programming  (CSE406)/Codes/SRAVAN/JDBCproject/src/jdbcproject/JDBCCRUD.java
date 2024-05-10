package jdbcproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class JDBCCRUD {
    public static void main(String[] args){
        JFrame frame = new JFrame("CRUD");
        frame.setLayout(new BorderLayout());
        frame.setSize(450,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        
        JPanel startPagePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        //Heading
        JLabel headingLabel = new JLabel("DATABASE MANAGEMENT SYSTEM");
        startPagePanel.add(headingLabel, gbc);
        
        //Insert button
        JButton insertButton = new JButton("INSERT");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        startPagePanel.add(insertButton, gbc);
        
        //Insert button action listener
        insertButton.addActionListener((ActionEvent e) -> {
            startPagePanel.removeAll();
            
            //panel for insert operation
            JPanel insertInputPanel = new JPanel(new GridBagLayout());
            GridBagConstraints insertGBC = new GridBagConstraints();
            insertGBC.gridx = 0;
            insertGBC.gridy = 0;
            insertGBC.anchor = GridBagConstraints.WEST;
            insertGBC.insets = new Insets(10, 10, 10, 10);
            
            //label for insert heading
            JLabel insertHeadingLabel = new JLabel("INSERT OPERATION");
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
            
            //email
            JLabel insertEmailLabel = new JLabel("E-mail:");
            insertGBC.gridx = 0;
            insertGBC.gridy = 3;
            insertInputPanel.add(insertEmailLabel, insertGBC);
            
            //email field
            JTextField insertEmailField = new JTextField(20);
            insertGBC.gridx = 1;
            insertGBC.gridy = 3;
            insertInputPanel.add(insertEmailField, insertGBC);
            
            //gender
            JLabel insertGenderLabel = new JLabel("Gender:");
            insertGBC.gridx = 0;
            insertGBC.gridy = 4;
            insertInputPanel.add(insertGenderLabel, insertGBC);
            
            //gender box
            String[] insertGenders = {"Male", "Female", "Other"};
            JComboBox<String> insertGenderBox = new JComboBox<>(insertGenders);
            insertGBC.gridx = 1;
            insertGBC.gridy = 4;
            insertInputPanel.add(insertGenderBox, insertGBC);
            
            //city
            JLabel insertCityLabel = new JLabel("City:");
            insertGBC.gridx = 0;
            insertGBC.gridy = 5;
            insertInputPanel.add(insertCityLabel, insertGBC);
            
            //email field
            JTextField insertCityField = new JTextField(20);
            insertGBC.gridx = 1;
            insertGBC.gridy = 5;
            insertInputPanel.add(insertCityField, insertGBC);
            
            //submit button
            JButton insertSubmitButton = new JButton("Insert");
            insertGBC.gridx = 1;
            insertGBC.gridy = 6;
            insertInputPanel.add(insertSubmitButton, insertGBC);
            
            //action listener for submit button
            insertSubmitButton.addActionListener((ActionEvent insertE) -> {
                String name = insertNameField.getText();
                String regNo = insertRegNoField.getText();
                String email = insertEmailField.getText();
                String gender = (String) insertGenderBox.getSelectedItem();
                String city = insertCityField.getText();
                
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","2002");
                    
                    PreparedStatement insertOperation = con.prepareStatement("insert into details values(?,?,?,?,?)");
                    insertOperation.setString(1, name);
                    insertOperation.setString(2, regNo);
                    insertOperation.setString(3, email);
                    insertOperation.setString(4, gender);
                    insertOperation.setString(5, city);
                    
                    int i = insertOperation.executeUpdate();
                    
                    if(i>0){
                        JOptionPane.showMessageDialog(frame, "Success");
                        insertNameField.setText("");
                        insertRegNoField.setText("");
                        insertEmailField.setText("");
                        insertGenderBox.setSelectedIndex(-1);
                        insertCityField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Failed to insert data", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    con.close();
                    
                } catch (Exception insertEx){
                    System.out.println(insertEx);
                }
            });
            
            startPagePanel.add(insertInputPanel, gbc);
            frame.revalidate();
            frame.repaint();
        });
        
        //Update button
        JButton updateButton = new JButton("UPDATE");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        startPagePanel.add(updateButton, gbc);
        
        //Update action listener
        updateButton.addActionListener((ActionEvent e)->{
            startPagePanel.removeAll();
            
            //panel for update operation
            JPanel updateInputPanel = new JPanel(new GridBagLayout());
            GridBagConstraints updateGBC = new GridBagConstraints();
            updateGBC.gridx = 0;
            updateGBC.gridy = 0;
            updateGBC.anchor = GridBagConstraints.WEST;
            updateGBC.insets = new Insets(10, 10, 10, 10);
            
            //label for update heading
            JLabel updateHeadingLabel = new JLabel("UPDATE OPERATION");
            updateInputPanel.add(updateHeadingLabel, updateGBC);
            
            //name label
            JLabel updateNameLabel = new JLabel("Name:");
            updateGBC.gridx = 0;
            updateGBC.gridy = 1;
            updateInputPanel.add(updateNameLabel, updateGBC);
            
            //name field
            JTextField updateNameField = new JTextField(20);
            updateGBC.gridx = 1;
            updateGBC.gridy = 1;
            updateInputPanel.add(updateNameField, updateGBC);
            
            // registration number
            JLabel updateRegNoLabel = new JLabel("Registration No:");
            updateGBC.gridx = 0;
            updateGBC.gridy = 2;
            updateInputPanel.add(updateRegNoLabel, updateGBC);

            // reg field
            JTextField updateRegNoField = new JTextField(20);
            updateGBC.gridx = 1;
            updateGBC.gridy = 2;
            updateInputPanel.add(updateRegNoField, updateGBC);

            // email
            JLabel updateEmailLabel = new JLabel("E-mail:");
            updateGBC.gridx = 0;
            updateGBC.gridy = 3;
            updateInputPanel.add(updateEmailLabel, updateGBC);

            // email field
            JTextField updateEmailField = new JTextField(20);
            updateGBC.gridx = 1;
            updateGBC.gridy = 3;
            updateInputPanel.add(updateEmailField, updateGBC);

            // gender
            JLabel updateGenderLabel = new JLabel("Gender:");
            updateGBC.gridx = 0;
            updateGBC.gridy = 4;
            updateInputPanel.add(updateGenderLabel, updateGBC);

            // gender box
            String[] genders = { "Male", "Female", "Other" };
            JComboBox<String> updateGenderBox = new JComboBox<>(genders);
            updateGBC.gridx = 1;
            updateGBC.gridy = 4;
            updateInputPanel.add(updateGenderBox, updateGBC);

            // city
            JLabel updateCityLabel = new JLabel("City:");
            updateGBC.gridx = 0;
            updateGBC.gridy = 5;
            updateInputPanel.add(updateCityLabel, updateGBC);

            // email field
            JTextField updateCityField = new JTextField(20);
            updateGBC.gridx = 1;
            updateGBC.gridy = 5;
            updateInputPanel.add(updateCityField, updateGBC);

            // submit button
            JButton submitButton = new JButton("Update");
            updateGBC.gridx = 1;
            updateGBC.gridy = 6;
            updateInputPanel.add(submitButton, updateGBC);

            // action listener for submit button
            submitButton.addActionListener((ActionEvent updateE) -> {
                String name = updateNameField.getText();
                String regNo = updateRegNoField.getText();
                String email = updateEmailField.getText();
                String gender = (String) updateGenderBox.getSelectedItem();
                String city = updateCityField.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "2002");

                    PreparedStatement updateOperation = con.prepareStatement("UPDATE details SET name=?, email=?, gender=?, city=? WHERE reg_num=?");
                    updateOperation.setString(1, name);
                    updateOperation.setString(2, email);
                    updateOperation.setString(3, gender);
                    updateOperation.setString(4, city);
                    updateOperation.setString(5, regNo);

                    int i = updateOperation.executeUpdate();

                    if (i > 0) {
                        JOptionPane.showMessageDialog(frame, "Success");
                        updateNameField.setText("");
                        updateRegNoField.setText("");
                        updateEmailField.setText("");
                        updateGenderBox.setSelectedIndex(-1);
                        updateCityField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Failed to update data", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    con.close();

                } catch (Exception updateEx) {
                    System.out.println(updateEx);
                }
            });

            
            startPagePanel.add(updateInputPanel, gbc);
            frame.revalidate();
            frame.repaint();
        });

        
        
        //Delete button
        JButton deleteButton = new JButton("DELETE");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        startPagePanel.add(deleteButton, gbc);
        
        //action listener for delete button
        deleteButton.addActionListener((ActionEvent e) ->{
            startPagePanel.removeAll();
            
            JPanel deleteInputPanel = new JPanel(new GridBagLayout());
            GridBagConstraints deleteGBC = new GridBagConstraints();
            deleteGBC.gridx = 0;
            deleteGBC.gridy = 0;
            deleteGBC.anchor = GridBagConstraints.WEST;
            deleteGBC.insets = new Insets(10, 10, 10, 10);
            
            //delete heading
            JLabel deleteHeadingLabel = new JLabel("DELETE OPERATION");
            deleteInputPanel.add(deleteHeadingLabel, deleteGBC);
            
            
            // registration number
            JLabel deleteRegNoLabel = new JLabel("Registration No:");
            deleteGBC.gridx = 0;
            deleteGBC.gridy = 1;
            deleteInputPanel.add(deleteRegNoLabel, deleteGBC);

            // reg field
            JTextField deleteRegNoField = new JTextField(20);
            deleteGBC.gridx = 1;
            deleteGBC.gridy = 1;
            deleteInputPanel.add(deleteRegNoField, deleteGBC);
            
            // submit button
            JButton submitButton = new JButton("Delete");
            deleteGBC.gridx = 1;
            deleteGBC.gridy = 2;
            deleteInputPanel.add(submitButton, deleteGBC);
            
            submitButton.addActionListener((ActionEvent deleteE)->{
                String regNo = deleteRegNoField.getText();
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "2002");

                    PreparedStatement deleteOperation = con.prepareStatement("delete from details WHERE reg_num=?");
                    deleteOperation.setString(1, regNo);

                    int i = deleteOperation.executeUpdate();

                    if (i > 0) {
                        JOptionPane.showMessageDialog(frame, "Success");
                        deleteRegNoField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Failed to delete data", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    con.close();

                } catch (Exception deleteEx) {
                    System.out.println(deleteEx);
                }
                
            });
            
            startPagePanel.add(deleteInputPanel, gbc);
            frame.revalidate();
            frame.repaint();
        });
        
        //Search button
        JButton searchButton = new JButton("SEARCH");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        startPagePanel.add(searchButton, gbc);
        
        //action listener for search
        searchButton.addActionListener((ActionEvent e)->{
            startPagePanel.removeAll();
            
            JPanel searchInputPanel = new JPanel(new GridBagLayout());
            GridBagConstraints searchGBC = new GridBagConstraints();
            searchGBC.gridx = 0;
            searchGBC.gridy = 0;
            searchGBC.anchor = GridBagConstraints.WEST;
            searchGBC.insets = new Insets(10, 10, 10, 10);
            
            //delete heading
            JLabel searchHeadingLabel = new JLabel("SEARCH OPERATION");
            searchInputPanel.add(searchHeadingLabel, searchGBC);
            
            
            // registration number
            JLabel searchRegNoLabel = new JLabel("Registration No:");
            searchGBC.gridx = 0;
            searchGBC.gridy = 1;
            searchInputPanel.add(searchRegNoLabel, searchGBC);

            // reg field
            JTextField searchRegNoField = new JTextField(20);
            searchGBC.gridx = 1;
            searchGBC.gridy = 1;
            searchInputPanel.add(searchRegNoField, searchGBC);
            
            // submit button
            JButton submitButton = new JButton("Search");
            searchGBC.gridx = 1;
            searchGBC.gridy = 2;
            searchInputPanel.add(submitButton, searchGBC);
            
            //submit button action listener
            submitButton.addActionListener((ActionEvent searchE) -> {
                String regNo = searchRegNoField.getText();

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "2002");

                    PreparedStatement searchOperation = con.prepareStatement("SELECT * FROM details WHERE reg_num=?");
                    searchOperation.setString(1, regNo);

                    ResultSet rs = searchOperation.executeQuery();

                    // Check if ResultSet is not empty
                    if (rs.next()) {
                        // Create data structures to hold the data
                        Vector<Vector<Object>> data = new Vector<>();
                        Vector<String> columnNames = new Vector<>();

                        // Add column names
                        columnNames.add("Name");
                        columnNames.add("Registration Number");
                        columnNames.add("E-mail");
                        columnNames.add("Gender");
                        columnNames.add("City");

                        // Populate data from ResultSet
                        do {
                            Vector<Object> row = new Vector<>();
                            row.add(rs.getString("name"));
                            row.add(rs.getString("reg_num"));
                            row.add(rs.getString("email"));
                            row.add(rs.getString("gender"));
                            row.add(rs.getString("city"));
                            data.add(row);
                        } while (rs.next());

                        // Create table model
                        DefaultTableModel model = new DefaultTableModel(data, columnNames);

                        // Create JTable
                        JTable table = new JTable(model);

                        // Show the table in a JOptionPane
                        JOptionPane.showMessageDialog(null, new JScrollPane(table), "Search Result", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No record found for registration number: " + regNo, "Search Result", JOptionPane.INFORMATION_MESSAGE);
                    }

                    con.close();
                } catch (Exception searchEx) {
                    System.out.println(searchEx);
                }
            });
            
            startPagePanel.add(searchInputPanel, gbc);
            frame.revalidate();
            frame.repaint();
        });
        
        
        frame.add(startPagePanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
