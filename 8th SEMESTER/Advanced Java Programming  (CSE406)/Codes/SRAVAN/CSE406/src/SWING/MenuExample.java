package SWING;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class MenuExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Menu Example");
        
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");
        
        
        JMenuItem i1 = new JMenuItem("New file");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Exit");
        JCheckBoxMenuItem i5 = new JCheckBoxMenuItem("check");
        
        
        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        i4.addActionListener((ActionEvent e) -> {
            int option = JOptionPane.showConfirmDialog(f, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        
        
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
