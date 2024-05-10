package codeevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Practice3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        JPanel mainPanel = new JPanel(new BorderLayout());

        JButton searchButton = new JButton("Search");
        JTextField searchField = new JTextField();
        JTable table = new JTable();

        searchButton.addActionListener((ActionEvent e) -> {
            mainPanel.removeAll();
            
            JPanel searchPanel = new JPanel(new BorderLayout());
            searchPanel.add(searchField, BorderLayout.NORTH);
            searchPanel.add(new JScrollPane(table), BorderLayout.CENTER);
            
            mainPanel.add(searchPanel, BorderLayout.CENTER);
            
            frame.revalidate();
            frame.repaint();
        });

        mainPanel.add(searchButton, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}

