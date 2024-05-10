package codeevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

class BankAccount{
    private String accName;
    private int accNumber;
    private int amount;
    private String type;
    
    public BankAccount(String accName, int accNumber, int amount, String type){
        this.accName = accName;
        this.accNumber = accNumber;
        this.amount = amount;
        this.type = type;
    }
    
    public String getAccName(){
        return accName;
    }
    
    public int getAccNumber(){
        return accNumber;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public String getType(){
        return type;
    }
}

public class BankingApplication {
    public static void main(String[] args){
        List<BankAccount> bank = new ArrayList<>();
        
        JFrame frame = new JFrame("Banking Management System");
        frame.setSize(450, 600);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        //Input panel consisting of input details
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(25, 10, 10, 10);
        
        
        //name label
        JLabel nameLabel = new JLabel("Account Name:");
        inputPanel.add(nameLabel, gbc);
        
        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(nameField, gbc);
        
        
        //number label
        JLabel numberLabel = new JLabel("Account Number:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(numberLabel, gbc);
        
        JTextField numberField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(numberField, gbc);
        
        
        //amount label
        JLabel amountLabel = new JLabel("Amount (INR):");
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(amountLabel, gbc);
        
        JTextField amountField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(amountField, gbc);
        
        
        //radio button label
        JLabel typeLabel = new JLabel("Type:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        inputPanel.add(typeLabel, gbc);
        
        //deposit
        JRadioButton depositRadioButton = new JRadioButton("Deposit");
        gbc.gridx = 1;
        inputPanel.add(depositRadioButton, gbc);

        //withdraw
        JRadioButton withdrawRadioButton = new JRadioButton("Withdraw");
        gbc.gridy = 4;
        inputPanel.add(withdrawRadioButton, gbc);
        
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(depositRadioButton);
        typeGroup.add(withdrawRadioButton);
        
        
        //Submit button
        JButton addButton = new JButton("Submit");
        gbc.gridy = 5;
        inputPanel.add(addButton, gbc);
        
        //show transaction label
        JLabel transactionLabel = new JLabel("Show Transactions");
        gbc.gridx = 1;
        gbc.gridy = 6;
//        gbc.anchor = GridBagConstraints.CENTER;
        inputPanel.add(transactionLabel, gbc);
        
        //account number label
        JLabel accNumberLabel = new JLabel("Account Number:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        inputPanel.add(accNumberLabel, gbc);
        
        JTextField accNumberField = new JTextField(20);
        gbc.gridx = 1;
        inputPanel.add(accNumberField, gbc);
        
        //button label
        JButton showButton = new JButton("Show");
        gbc.gridx = 1;
        gbc.gridy = 8;
        inputPanel.add(showButton, gbc);
        
        //table
        String[] columnNames = {"Account Name", "Account Number", "Amount", "Type"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        
        //submit button action listener
        addButton.addActionListener((ActionEvent e)->{
            String name = nameField.getText().trim();
            String numberStr = numberField.getText().trim();
            String amountStr = amountField.getText().trim();
            String type = depositRadioButton.isSelected() ? "Deposit" : "Withdraw";

            if(name.isEmpty() || numberStr.isEmpty() || amountStr.isEmpty() || type.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please fill all the details");
                return;
            }
            
            int number = Integer.parseInt(numberStr);
            int amount = Integer.parseInt(amountStr);
            
            bank.add(new BankAccount(name, number, amount, type));
            
            Object[] rowData = {name, number, amount, type};
            tableModel.addRow(rowData);
            
            nameField.setText("");
            numberField.setText("");
            amountField.setText("");
            typeGroup.clearSelection();
        });
        
        
        
        //show button action listener
        showButton.addActionListener((ActionEvent e)->{
            JOptionPane.showMessageDialog(null, new JScrollPane(table), "Table", JOptionPane.PLAIN_MESSAGE);
        });
        
        
        
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
