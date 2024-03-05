import java.awt.*;
import javax.swing.*;

class setBoundsDemo {
	public static void main(String[] rk) {
 
        JTextField txtview = new JTextField("Feb 8, 2024");
        txtview.setBounds(50, 50, 60, 20);

	    JLabel gender = new JLabel("Gender : ");

	    JRadioButton rb1 = new JRadioButton("Male");
	    JRadioButton rb2 = new JRadioButton("Female");

	    JLabel sports = new JLabel("Sports : ");

	    JCheckBox cb1 = new JCheckBox("cricket");
	    JCheckBox cb2 = new JCheckBox("shuttle");
	    JCheckBox cb3 = new JCheckBox("volleyball");
	    JCheckBox cb4 = new JCheckBox("basket ball");


	    ButtonGroup bg_radio = new ButtonGroup();
	    bg_radio.add(rb1); 
	    bg_radio.add(rb2); 

	    ButtonGroup bg_checkbox = new ButtonGroup();
	    bg_checkbox.add(cb1);  bg_checkbox.add(cb2); bg_checkbox.add(cb3); bg_checkbox.add(cb4);

	    JPanel p = new JPanel();
	    p.add(txtview, true);
        p.add(gender); 
        p.add(rb1);  p.add(rb2);
	    p.add(sports);  //p.add(bg_checkbox);

            

        JFrame jf = new JFrame("setBoundsDemo");
        jf.add(p);
		jf.setSize(500, 500);
		jf.setResizable(false);
	    jf.setLocationRelativeTo(null);
	    jf.getContentPane().setBackground(Color.BLUE);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    //jf.setLayout(null);


	    jf.setVisible(true);
	}
}