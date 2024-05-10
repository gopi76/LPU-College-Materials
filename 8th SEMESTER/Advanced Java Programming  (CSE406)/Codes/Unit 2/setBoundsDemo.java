import java.awt.*;
import javax.swing.*;

public class setBoundsDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("SetBoundsDemo");
        jf.setSize(500, 500);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0, 2, 10, 10)); // GridLayout with 2 columns and spacing

        JTextField txtview = new JTextField("Feb 8, 2024");
        JLabel gender = new JLabel("Gender : ");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");

        JLabel sports = new JLabel("Sports : ");
        JCheckBox cb1 = new JCheckBox("cricket", true);
        JCheckBox cb2 = new JCheckBox("shuttle");
        JCheckBox cb3 = new JCheckBox("volleyball");
        JCheckBox cb4 = new JCheckBox("basket ball");

        ButtonGroup bg_radio = new ButtonGroup();
        bg_radio.add(rb1);
        bg_radio.add(rb2);

        // Add components to the panel
        p.add(txtview); // This will span across two columns
        p.add(new JLabel()); // Empty label for alignment

        p.add(gender);
        p.add(rb1);
        p.add(new JLabel()); // Empty label for alignment
        p.add(rb2);

        p.add(sports);
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(cb4);

        // Set background color of the panel
        p.setBackground(Color.BLUE);

        // Add panel to the frame
        jf.add(p);

        jf.setVisible(true);
    }
}
