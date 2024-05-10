package codeevent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.stream.Collectors;

class Product{
    private String name;
    private String category;
    private double price;
    private int quantity;
    
    public Product(String name, String category, double price, int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCategory(){
        return category;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
}
public class Practice{
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        
        JFrame frame = new JFrame("Product Inventory Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());
        
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
        
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel searchLabel = new JLabel("Search:");
        searchPanel.add(searchLabel);
        JTextField searchField = new JTextField(20);
        searchPanel.add(searchField);
        
        String[] columnNames = {"Name", "Category", "Price", "Quantity"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(searchPanel, BorderLayout.SOUTH);
        
        //add product
        addButton.addActionListener((ActionEvent e)->{
            String name = nameField.getText().trim();
            String category = categoryField.getText().trim();
            String priceStr = priceField.getText().trim();
            String quantityStr = quantityField.getText().trim();
            
            if(name.isEmpty() || category.isEmpty() || priceStr.isEmpty() ||quantityStr.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please fill all the detials");
                return;
            }
            
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);
            
            products.add(new Product(name, category, price, quantity));
            
            Object[] rowData = {name, category, price, quantity};
            tableModel.addRow(rowData);
            
            nameField.setText("");
            categoryField.setText("");
            priceField.setText("");
            quantityField.setText("");
        });
        
        
        searchField.addActionListener((ActionEvent e)-> {
            String query = searchField.getText().toLowerCase();
            
            List<Product> filteredProducts = products.stream()
                    .filter(p -> p.getName().toLowerCase()
                    .contains(query) || p.getCategory().toLowerCase().contains(query)).collect(Collectors.toList());
            
            updateTable(filteredProducts, tableModel);
        });
        
        frame.setVisible(true);
    }
    
    private static void updateTable(List<Product> productList, DefaultTableModel model){
        model.setRowCount(0);
        
        for(Product product : productList){
            Object[] rowData = {product.getName(), product.getCategory(), product.getPrice(), product.getQuantity()};
            model.addRow(rowData);
        }
    }

}