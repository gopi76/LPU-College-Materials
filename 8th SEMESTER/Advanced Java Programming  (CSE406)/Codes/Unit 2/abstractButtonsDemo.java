import java.awt.*;
import javax.swing.*;

class abstractButtonsDemo
{
	public static void main(String[] rk)
   	{
/*
		JRadioButton cb1 = new JRadioButton("Chess", true);
		//cb1.setBackground(Color.MAGENTA);
		//cb1.setForeground(Color.YELLOW);
		cb1.setFont(new Font("Scjksdbfhbh", 0, 40));
		JRadioButton cb2 = new JRadioButton("Polo");
		//cb2.setBackground(Color.MAGENTA);
		cb2.setFont(new Font("Scjksdbfhbh", 1, 40));

		JRadioButton cb3 = new JRadioButton("Cricket", true);
		//cb3.setBackground(Color.MAGENTA);
		cb3.setFont(new Font("Scjksdbfhbh", 2, 40));

		JRadioButton cb4 = new JRadioButton("Volleyball", false);
		//cb4.setBackground(Color.MAGENTA);
		cb4.setFont(new Font("Scjksdbfhbh", 3, 40));
	


*/		JCheckBox cb1 = new JCheckBox("Chess", true);
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


	    ButtonGroup bg = new ButtonGroup();
		bg.add(cb2);	bg.add(cb3);	bg.add(cb4);	bg.add(cb1);


        JToggleButton tb = new JToggleButton("ON", true);	
	    bg.add(tb);
		
		JPanel p = new JPanel();
		//p.setBackground(Color.MAGENTA);
		p.add(cb1);	p.add(cb2);	p.add(cb3);	p.add(cb4); p.add(tb);
		
        JButton b = new JButton("My BUTTON");
        bg.add(b);

        p.add(b);
        

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