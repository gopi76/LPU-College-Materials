import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class comboBoxDemo {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("JComboBox Demo");
		f.setSize(600, 600);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.MAGENTA);

		String[] items = {"kerala","Tamil nadu","hyderabad" };
		JComboBox<String>states = new JComboBox<>(items);

		f.add(states);

		states.setBounds(200, 100, 300, 40);

		states.add("Punjab");
		states.add("chandigarh");
		states.add("delhi");


		String[] names = {"hari","giri","suri","ramesh","Suresh","mahesh"};
		JList<String> jlist = new JList<>(names);

		JScrollPane jscrollpane = new JScrollPane(jlist);
		jscrollpane.setHorizontalScrollBarPolicy(ScrollPaneConstraints.HORIZONTAL_SCROLLBAR_);

		f.add(jscrollpane);
		jscrollpane.setBounds(250, 200, 200, 40);

		Object[][] data = { {"A", 2.24, "ML"}, 
		                   {"B", 2.6,"full stack"}, 
		                   {"C", 3.0,"data science"}, 
		                   {"D", 3.5, "iot"}
		};







		f.setVisible(true);
	}
	
}