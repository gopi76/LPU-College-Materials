import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SimpleTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sample data for the table
        Object[][] data = {
                {"John", "Doe", 30},
                {"Jane", "Smith", 25},
                {"Bob", "Johnson", 35}
        };

        // Column names
        String[] columnNames = {"First Name", "Last Name", "Age"};

        // Create a default table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the default table model
        JTable table = new JTable(model);

        // Set preferred size for better visualization (optional)
        table.setPreferredScrollableViewportSize(table.getPreferredSize());

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
