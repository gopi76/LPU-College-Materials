import java.awt.*;
import javax.swing.*;

class ButtonTest19 {
    public static void main(String[] rk){

        JRadioButton rb1 = new JRadioButton("Chess", true);
        rb1.setFont(new Font("Scjksdbfhbh", 0, 40));
        
        JRadioButton rb2 = new JRadioButton("Polo");
        rb2.setFont(new Font("Scjksdbfhbh", 1, 40));

        JRadioButton rb3 = new JRadioButton("Cricket", true);
        rb3.setFont(new Font("Scjksdbfhbh", 2, 40));

        JRadioButton rb4 = new JRadioButton("Volleyball", false);
        rb4.setFont(new Font("Scjksdbfhbh", 3, 40));



        JCheckBox cb1 = new JCheckBox("Chess", true);
        cb1.setFont(new Font("Scjksdbfhbh", 0, 40));
        
        JCheckBox cb2 = new JCheckBox("Polo");
        cb2.setFont(new Font("Scjksdbfhbh", 1, 40));

        JCheckBox cb3 = new JCheckBox("Cricket", true);
        cb3.setFont(new Font("Scjksdbfhbh", 2, 40));

        JCheckBox cb4 = new JCheckBox("Volleyball", false);
        cb4.setFont(new Font("Scjksdbfhbh", 3, 40));


        ButtonGroup bg = new ButtonGroup();
        bg.add(cb2);
        bg.add(cb3);
        bg.add(cb4);
        bg.add(cb1);
        
        JToggleButton tb = new JToggleButton("ON", true);
        bg.add(tb);
        
        JPanel p = new JPanel();
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(cb4);
        p.add(tb);

        JButton b = new JButton("My BUTTON");
        bg.add(b);

        p.add(b);
        JFrame f = new JFrame("Ravi Kant Sahu");
        f.add(p);
        f.setSize(500, 700);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.BLUE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}