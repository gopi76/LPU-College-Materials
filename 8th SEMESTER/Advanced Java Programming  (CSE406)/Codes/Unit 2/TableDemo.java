import java.awt.*;
import java.awt.event.*;
import  javax.swing.*;

class TableDemo {
     static public void main(String... rk)
     {

		String [] items = {"Kerala", "Tamilnadu", "Madhya Pradesh"};
		JComboBox <String> states = new JComboBox<>(items);

		class MyListener implements ActionListener
		{
			public void actionPerformed(ActionEvent ae)
			{
				if(ae.getSource() == states)
				{
					System.out.println("You have Seleted "+ states.getSelectedItem());
				}
			}	
		}

		JFrame f = new JFrame();
		f.setSize(600, 800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.MAGENTA);


		f.add(states);	states.setBounds(200, 100, 300, 40);

		states.addItem("Punjab");
		states.addItem("Delhi");
		states.addItem("Chandigarh");

		states.addActionListener(new MyListener());

		String [] names = {"Ravi", "Arnav", "Shahbaz", "Balpreet", "A", "B", "C", "D"};
		JList <String> jl = new JList<>(names);
		JScrollPane jsp = new JScrollPane(jl);
		jsp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.add(jsp);
		jsp.setBounds(250, 200, 150, 100 );
		

		Object [][] data = { {"A", 3.78, "ML"},
						{"B", 9.11, "Full STack"},
						{"C", 6.91, "Cyber Security"},
						{"D", 6.72, "Full Stack"}
					     };

		Object [] col = {"Name", "CGPA", "Specialization"};

		JTable jtb = new JTable(data, col);
		JScrollPane jsp1 = new JScrollPane(jtb);
		f.add(jsp1);
		jsp1.setBounds(150, 400, 300, 200);
		

		f.setVisible(true);
     }
}