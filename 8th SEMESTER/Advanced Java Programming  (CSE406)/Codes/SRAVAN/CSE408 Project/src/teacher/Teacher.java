package teacher;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Teacher extends JFrame implements ActionListener{
    JButton insert, update, delete, search, uploadPapers, uploadTimeTable; 
    
    public Teacher(){
        setSize(450, 450);
//        getContentPane().setBackground(Color.getHSBColor(55, 44, 33));
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
        gbc.insets = new Insets(10, 10, 10, 10);
        
        insert = new JButton("Insert");
        gbc.gridx = 1;
        gbc.gridy = 1;
        insert.setPreferredSize(new Dimension(100, 50));
        insert.addActionListener(this);
        add(insert, gbc);
        
        
        update = new JButton("Update");
        gbc.gridx = 2;
        gbc.gridy = 1;
        update.setPreferredSize(new Dimension(100, 50));
        update.addActionListener(this);
        add(update, gbc);
        
        delete = new JButton("Delete");
        gbc.gridx = 1;
        gbc.gridy = 2;
        delete.setPreferredSize(new Dimension(100, 50));
        delete.addActionListener(this);
        add(delete, gbc);
        
        search = new JButton("Search");
        gbc.gridx = 2;
        gbc.gridy = 2;
        search.setPreferredSize(new Dimension(100, 50));
        search.addActionListener(this);
        add(search, gbc);
        
        uploadPapers = new JButton("<html><center>Upload<br>Paper</center></html>");
        gbc.gridx = 1;
        gbc.gridy = 5;
        uploadPapers.setPreferredSize(new Dimension(100, 50));
        uploadPapers.addActionListener(this);
        add(uploadPapers, gbc);
        
        uploadTimeTable = new JButton("<html><center>Upload<br>TimeTable</center></html>");
        gbc.gridx = 2;
        gbc.gridy = 5;
        uploadTimeTable.setPreferredSize(new Dimension(100, 50));
        uploadTimeTable.addActionListener(this);
        add(uploadTimeTable, gbc);
        
        
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        String message = e.getActionCommand();
        
        if(message.equals("Insert")){
            setVisible(false);
            new Insert();
        }else if(message.equals("Update")){
            JOptionPane.showMessageDialog(null, "Update");
        }else if(message.equals("Delete")){
            JOptionPane.showMessageDialog(null, "Delete");
        }else if(message.equals("Search")){
            JOptionPane.showMessageDialog(null, "Search");
        }else if(message.equals("<html><center>Upload<br>Paper</center></html>")){
            JOptionPane.showMessageDialog(null, "Upload Paper");
        }else if(message.equals("<html><center>Upload<br>TimeTable</center></html>")){
            JOptionPane.showMessageDialog(null, "Upload TimeTable");
        }
    }
    
    public static void main(String[] args){
        new Teacher();
    }

}
