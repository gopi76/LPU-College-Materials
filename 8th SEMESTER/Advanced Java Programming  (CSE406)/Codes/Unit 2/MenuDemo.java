import java.awt.*;
import javax.swing.*;

class MenuDemo {
	public static void main(String[] rk) {

		JFrame jf = new JFrame("MenuDemo");
		jf.setSize(600, 600);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);


        JMenuItem male = new JMenuItem("Male");
        JMenuItem female = new JMenuItem("Female");
        JMenuItem other = new JMenuItem("others");

        /*JMenu submenumale = new JMenu("Choose one");
        JMenuItem ageless = new JMenuItem("age < 18");
        JMenuItem agebtw = new JMenuItem("age > 18 and age <= 25");
        JMenuItem agegreat = new JMenuItem("age > 25");

        submenumale.add(ageless);
        submenumale.add(agebtw);
        submenumale.add(agegreat);
        male.add(submenumale); */


        JMenu menu1 = new JMenu("Gender");
        menu1.add(male);
        menu1.add(female);
        menu1.add(other);



        JMenuItem cricket = new JMenuItem("Cricket");
        JMenuItem hockey  = new JMenuItem("hockey");
        JMenuItem shuttle  = new JMenuItem("shuttle");
        JMenuItem volleyball  = new JMenuItem("volleyball");
        JMenuItem ruby  = new JMenuItem("ruby");

        

        JMenu sports = new JMenu("sports");
        sports.add(cricket);
        sports.add(hockey);
        sports.add(shuttle);
        sports.add(volleyball);
        sports.add(ruby);


        JMenuBar menubar = new JMenuBar();
        menubar.add(menu1);
        menubar.add(sports);
        

        jf.setJMenuBar(menubar);
        jf.setBackground(Color.BLUE);
		jf.setVisible(true);
	}
}