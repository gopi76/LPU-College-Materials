import java.awt.*;
import javax.swing.*;

// 0 - plain, 1 - bold, 2 - italic, 3 - bold+itlaic

class radioButtonDemo
{
	public static void main(String[] rk)
   	{

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