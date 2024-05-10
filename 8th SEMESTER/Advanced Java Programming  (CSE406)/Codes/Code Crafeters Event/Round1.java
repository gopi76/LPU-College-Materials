import java.awt.*;
import javax.swing.*;

public class Round1
{
    public static void main(String[] rk)
    {
	//Creating the Frame

	JFrame frame = new JFrame("Reappear Registration");
	frame.setSize(600, 800);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.getContentPane().setBackground(new Color(255, 254, 145));
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setLayout(null);

	//Adding Components in the Frame

	JLabel l = new JLabel("Reappear Registration Form");
	l.setFont(new Font("Serif", 1, 30));
	l.setForeground(Color.BLUE);
	l.setBounds(110, 20, 380, 50);
	frame.add(l);
	
	//Name

	JTextField name = new JTextField("Student Name");
	name.setBounds(200, 100, 200, 40);	frame.add(name);
	name.setFont(new Font("Serif", 0, 20));

	//Registration Number

	JTextField regno = new JTextField("Registration Number");
	regno.setBounds(200, 180, 200, 40);	frame.add(regno);
	regno.setFont(new Font("Serif", 0, 20));

	//Course

	String[] courses = { "-- Select Course --", "CSE101", "CSE310", "CSE406", "INT108"};
	JComboBox<String> course = new JComboBox<>(courses);
	course.setBounds(200, 260, 200, 40);	frame.add(course);
	course.setFont(new Font("Serif", 0, 20));

	//Register

	JButton register = new JButton("Register");
	register.setBounds(250, 340, 100, 40);	frame.add(register);
	register.setFont(new Font("Serif", 0, 20));

	//View Option

	JLabel lbl = new JLabel("View Registration Details");
	lbl.setFont(new Font("Serif", 1, 30));
	lbl.setForeground(Color.BLUE);
	lbl.setBounds(130, 460, 380, 50);
	frame.add(lbl);

	JTextField reg = new JTextField("Registration Number");
	reg.setBounds(100, 550, 200, 40);	frame.add(reg);
	reg.setFont(new Font("Serif", 2, 20));
	reg.setForeground(Color.RED);

	JButton view = new JButton("View");
	view.setBounds(320, 550, 180, 40);	frame.add(view);
	view.setFont(new Font("Serif", 3, 24));		view.setBackground(Color.ORANGE);
	view.setForeground(Color.RED);

	




	frame.setVisible(true);
    }
}