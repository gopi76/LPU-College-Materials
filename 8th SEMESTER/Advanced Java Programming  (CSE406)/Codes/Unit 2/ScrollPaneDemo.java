import java.awt.*;
import javax.swing.*;

class ScrollPaneDemo
{
   static public void main(String[] rk)
    {
		JFrame f = new JFrame("ScrollPane Demo");
		f.setSize(800, 800);

		String[] items = {"Amazon", "Optymyzer", "Infenion", "Infosys", "Capgemini", "CTS", "Wipro"};

		JList<String> ls = new JList<>(items);

		f.setLayout(null); 

		f.add(ls);
		ls.setBounds(250, 100, 100, 80);

		JScrollPane jsp11 = new JScrollPane(ls, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 	ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
		




		JTextArea ta = new JTextArea("Write your review...");

		JScrollPane jsp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 	ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
		
		//JScrollPane jsp = new JScrollPane(ta);

		f.add(jsp);
		f.add(jsp11);
		jsp.setBounds(200, 200, 150, 100);

		//ta.setLineWrap(true); // for limited in the text area.
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);

		f.setVisible(true);
    }
}