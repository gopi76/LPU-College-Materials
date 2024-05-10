package codeevent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class ProductInventoryManagementSwing {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Create and configure JFrame
        JFrame frame = new JFrame("Product Inventory Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create JPanel for input components
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);

        JLabel nameLabel = new JLabel("Name:");
        inputPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(nameField, gbc);

        JLabel categoryLabel = new JLabel("Category:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(categoryLabel, gbc);

        JTextField categoryField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(categoryField, gbc);

        JLabel priceLabel = new JLabel("Price:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(priceLabel, gbc);

        JTextField priceField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(priceField, gbc);

        JLabel quantityLabel = new JLabel("Quantity:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(quantityLabel, gbc);

        JTextField quantityField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(quantityField, gbc);

        JButton addButton = new JButton("Add Product");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        inputPanel.add(addButton, gbc);

        // Create JPanel for search components
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel searchLabel = new JLabel("Search:");
        searchPanel.add(searchLabel);
        JTextField searchField = new JTextField(20);
        searchPanel.add(searchField);

        // Create JTable for displaying products
        String[] columnNames = {"Name", "Category", "Price", "Quantity"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Add components to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(searchPanel, BorderLayout.SOUTH);

        // Action listener for "Add Product" button
        addButton.addActionListener((ActionEvent e) -> {
            String name = nameField.getText().trim();
            String category = categoryField.getText().trim();
            String priceStr = priceField.getText().trim();
            String quantityStr = quantityField.getText().trim();
            
            if (name.isEmpty() || category.isEmpty() || priceStr.isEmpty() || quantityStr.isEmpty()) {
                // Display a message indicating missing information
                JOptionPane.showMessageDialog(frame, "Please fill in all details before adding the product.");
                return;
            }
            
            // Parse price and quantity
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);
            
            // Add product to list
            products.add(new Product(name, category, price, quantity));
            
            // Update table
            Object[] rowData = {name, category, price, quantity};
            tableModel.addRow(rowData);
            
            // Clear input fields
            nameField.setText("");
            categoryField.setText("");
            priceField.setText("");
            quantityField.setText("");
        });

        // Action listener for search field
        searchField.addActionListener((ActionEvent e) -> {
            String query = searchField.getText().toLowerCase();
            
            // Filter products based on search query
            List<Product> filteredProducts = products.stream()
                    .filter(p -> p.getName().toLowerCase().contains(query) || p.getCategory().toLowerCase().contains(query))
                    .collect(Collectors.toList());
            
            // Update table with filtered products
            updateTable(filteredProducts, tableModel);
        });

        // Display frame
        frame.setVisible(true);
    }

    private static void updateTable(List<Product> productList, DefaultTableModel model) {
        model.setRowCount(0);

        for (Product product : productList) {
            Object[] rowData = {product.getName(), product.getCategory(), product.getPrice(), product.getQuantity()};
            model.addRow(rowData);
        }
    }
}