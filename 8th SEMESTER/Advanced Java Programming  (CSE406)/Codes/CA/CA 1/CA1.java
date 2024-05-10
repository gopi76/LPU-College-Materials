import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class CA1 {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Find Train CA1");
        f.setSize(800, 800);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object[][] data = {
                {"110", "HYD", "20:30"},
                {"111", "VJY", "21:00"},
                {"113", "SEC", "22:00"},
                {"114", "GNT", "23:00"},
                {"115", "NZM", "21:30"}

        };

        
        String[] columns = {"Train No", "Train Name", "Travel Time"};

        
        DefaultTableModel model = new DefaultTableModel(data, columns);

        
        JTable table = new JTable(model);

        
        table.setPreferredScrollableViewportSize(table.getPreferredSize());


        JLabel sourceLabel = new JLabel("Source:");
        JLabel destinationLabel = new JLabel("Destination:");
        JLabel trainTypesLabel = new JLabel("Train Types");

        
        JTextField source = new JTextField(10);
        JTextField destination = new JTextField(10);

        JButton search = new JButton("Search");

        String[] items = {"All","Super Fast Express","Passenger train" };
		JComboBox<String> trainTypes = new JComboBox<>(items);

		f.add(trainTypes);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        
        panel.add(sourceLabel); 
        panel.add(source);

        panel.add(destinationLabel);
        panel.add(destination);

        panel.add(trainTypesLabel);
        panel.add(trainTypes);
        
        panel.add(search);

        panel.add(table);
        
        f.add(panel);


        /*class MyListener implements ActionListener {
        	public void actionPerformed(ActionListener ae) {
        		if(ae.getSource() == search) {
        			if (source.getText()==null || destination.getText()==null || trainTypes.getSelectedItem() == null) {
        				JOptionPane.showMessageDialog("you haven't filled the details" +"in one of the field like source or destination or train type..");
        			} 
        		}

        	}
        }

        MyListener ls = new MyListener();
        search.addActionListener(ls);*/

        



        f.setVisible(true);

    }
}
