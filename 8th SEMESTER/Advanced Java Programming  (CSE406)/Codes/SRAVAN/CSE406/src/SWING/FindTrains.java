package SWING;
import javax.swing.*;
public class FindTrains {
    public static void main(String[] args){
        JFrame f = new JFrame("Find Trains");
        JLabel source = new JLabel("Source");
        JLabel destination = new JLabel("Destination");
        JLabel type = new JLabel("Type");
        
        source.setBounds(50, 50, 100, 30);
        destination.setBounds(50, 100, 100, 30);
        type.setBounds(50, 150, 100, 30);
        
        String[] sources = {"Delhi", "Hyderabad", "Bangalore"};
        String[] destinations = {"Chennai", "Kochi", "Vizayanagaram"};
        
        JComboBox sourcedp = new JComboBox(sources); 
        sourcedp.setBounds(150, 50, 100, 20);
        
        JComboBox destinationdp = new JComboBox(destinations); 
        destinationdp.setBounds(150, 100, 100, 20);
        
        String[] types = {"mail", "super-fast", "All"};
        JComboBox cb = new JComboBox(types); 
        cb.setBounds(150, 150, 100, 20);
        
        JButton show = new JButton("Show");
        show.setBounds(150, 200, 100, 20);
        
        String[][] trainInfo = {{"train1", "100", "10"},
                                 {"train2", "200", "12"},
                                 {"train3", "300", "13"},
                                 {"train4", "400", "8"},
                                 {"train5", "500", "15"}};
        
        String[] row ={"Train Name", "Train Number", "Travel Time (in HRS)"};
        
        
        JTable tb = new JTable(trainInfo, row);
        tb.setBounds(150, 250, 150, 80);
        
        
        f.add(tb);
        f.add(source);
        f.add(destination);
        f.add(type);
        f.add(sourcedp);
        f.add(destinationdp);
        f.add(cb);
        f.add(show);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
