import javax.swing.*;
import java.awt.*;  //for color , Only class accepts both RED & red.

//import java.util.*;

class MyFrame {
	public static void main(String args[]) {

		JFrame f = new JFrame("KE019");

		//to set the size of the UI screen 
		f.setSize(850,850);            

		//to set the background color of frame(total 13 color-predefined), for jframe use getcontentpane()
		//f.getContentPane().setBackground(Color.RED);

		//for light colors with 0-255
		f.getContentPane().setBackground(new Color(20,60,90));  // above 255 it will throw illegal exception.

		//null means ui will come at center of the screen.
		f.setLocationRelativeTo(null);  

		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


		f.setResizable(false);


		//f.setVisible(true);         //it must be end of the code.

           
        // to create a button and add to the JFrame.
		JButton btn1 = new JButton("Submit1");
		f.add(btn1);

		JButton btn2 = new JButton("Submit2");
		f.add(btn2);


		f.setVisible(true);         //it must be end of the code.
	}
}