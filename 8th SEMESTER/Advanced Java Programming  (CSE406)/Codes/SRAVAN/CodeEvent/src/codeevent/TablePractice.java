package codeevent;

import javax.swing.*;
public class TablePractice {
    public static void main(String[] args) {
        // Sample data for the table
        Object[][] data = {
                {"John", "Doe", 30},
                {"Jane", "Smith", 25},
                {"Alice", "Johnson", 35}
        };

        // Column names
        Object[] columnNames = {"First Name", "Last Name", "Age"};

        // Create a JTable with the data and column names
        JTable table = new JTable(data, columnNames);

        // Show the table in a JOptionPane
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "Table", JOptionPane.PLAIN_MESSAGE);
    }
}
