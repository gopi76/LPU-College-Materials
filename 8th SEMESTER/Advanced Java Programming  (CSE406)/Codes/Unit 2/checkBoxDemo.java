import java.awt.*;
import javax.swing.*;

class checkBoxDemo
{
	public static void main(String[] rk)
   	{
   		JCheckBox cb1 = new JCheckBox("Chess", true);
		//cb1.setBackground(Color.MAGENTA);
		//cb1.setForeground(Color.YELLOW);
		cb1.setFont(new Font("Scjksdbfhbh", 0, 40));
		JCheckBox cb2 = new JCheckBox("Polo");
		//cb2.setBackground(Color.MAGENTA);
		cb2.setFont(new Font("Scjksdbfhbh", 1, 40));

		JCheckBox cb3 = new JCheckBox("Cricket", true);
		//cb3.setBackground(Color.MAGENTA);
		cb3.setFont(new Font("Scjksdbfhbh", 2, 40));

		JCheckBox cb4 = new JCheckBox("Volleyball", false);
		//cb4.setBackground(Color.MAGENTA);
		cb4.setFont(new Font("Scjksdbfhbh", 3, 40));


		JPanel p = new JPanel();
		//p.setBackground(Color.MAGENTA);
		p.add(cb1);	p.add(cb2);	p.add(cb3);	p.add(cb4); 
		
		JFrame f = new JFrame("KE019");
	    f.add(p);
	    f.setSize(500, 700);
	    f.setResizable(false);
	    f.setLocationRelativeTo(null);
	    f.getContentPane().setBackground(Color.BLUE);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    f.setVisible(true);
	}
}