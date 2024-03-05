import java.awt.*; 
import java.awt.event.*; 
import  javax.swing.*; 
 
class TabbedPaneDemo
{ 
     static public void main(String... rk) 
     { 
		JFrame f = new JFrame(); 
		f.setSize(600, 800); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setLocationRelativeTo(null); 
		f.getContentPane().setBackground(Color.YELLOW); 

		JTabbedPane tp = new JTabbedPane(); 
		f.add(tp); 
 
		JPanel personal_panel = new JPanel(); 
		personal_panel.setBackground(Color.magenta); 

		tp.addTab("Personal", personal_panel ); 
 
 
		JPanel academic_panel = new JPanel(); 
		academic_panel.setBackground(Color.pink); 

		tp.addTab("Academic", academic_panel ); 
 
		tp.setSelectedIndex(1); 
 
		f.setVisible(true); 
 
		try {
			Thread.sleep(3000);	
		}  
		catch(Exception e) {} 
 
		tp.removeTabAt(1); 
 
 
      } 
}