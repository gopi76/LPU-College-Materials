package codeevent;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

class Book{
    private String name;
    private String author;
    private int year;
    
    public Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getYear(){
        return year;
    }
}

public class Practice2 {
    public static void main(String[] args){
        List<Book> book = new ArrayList<>();
        
        JFrame frame = new JFrame("Library Management System");
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 10, 5, 10);
        
        
        JLabel nameLabel = new JLabel("Name:");
        inputPanel.add(nameLabel, gbc);
        
        JTextField nameField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(nameField, gbc);
        
        JLabel authorLabel = new JLabel("Author:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(authorLabel, gbc);
        
        JTextField authorField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(authorField, gbc);
        
        JLabel yearLabel = new JLabel("Year:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(yearLabel, gbc);
        
        JTextField yearField = new JTextField(15);
        gbc.gridx = 1;
        inputPanel.add(yearField, gbc);
        
        JButton addButton = new JButton("Add Book");
        gbc.gridx = 1;
        gbc.gridy = 4;
//        gbc.anchor = GridBagConstraints.CENTER;
        inputPanel.add(addButton, gbc);
        
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel searchLabel = new JLabel("Search:");
        searchPanel.add(searchLabel);
        JTextField searchField = new JTextField(15);
        searchPanel.add(searchField);
        
        String[] columnNames = {"Name", "Author", "year"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(searchPanel, BorderLayout.SOUTH);
        
        addButton.addActionListener((ActionEvent e)->{
            String name = nameField.getText().trim();
            String author = authorField.getText().trim();
            String yearStr = yearField.getText().trim();
            
            if(name.isEmpty() || author.isEmpty() || yearStr.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please fill all the details");
                return;
            }
            
            int year = Integer.parseInt(yearStr);
            
            book.add(new Book(name,author,year));
            
            Object[] rowData = {name, author, year};
            tableModel.addRow(rowData);
            
            nameField.setText("");
            authorField.setText("");
            yearField.setText("");
        });
        
        searchField.addActionListener((ActionEvent e) -> {
            String query = searchField.getText().toLowerCase();
            
            List<Book> filteredBooks = book.stream()
                    .filter(p -> p.getName().toLowerCase()
                    .contains(query) || p.getAuthor().toLowerCase().contains(query)).collect(Collectors.toList());
            
            updateTable(filteredBooks, tableModel);
        });
        
        frame.setVisible(true);
    }
    
    private static void updateTable(List<Book> bookList, DefaultTableModel model){
        model.setRowCount(0);
        
        for(Book book : bookList){
            Object[] rowData = {book.getName(), book.getAuthor(), book.getYear()};
            model.addRow(rowData);
        }
    }
}
