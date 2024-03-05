import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutDemo11 { // without using the show textfield
    public static void main(String... rk) {

        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.orange);

        JPanel bottomPanel = new JPanel();
        JPanel topPanel = new JPanel();

        JButton showButton = new JButton("Show");
        JTextField textfield = new JTextField(10);

        topPanel.add(showButton);
        topPanel.add(textfield);

        JButton previousButton = new JButton("Previous");
        bottomPanel.add(previousButton);

        JButton nextButton = new JButton("Next");
        bottomPanel.add(nextButton);

        f.add(bottomPanel, BorderLayout.SOUTH);
        f.add(topPanel, BorderLayout.NORTH);

        CardLayout cl = new CardLayout();
        JPanel cardpanel = new JPanel();

        f.add(cardpanel);
        cardpanel.setLayout(cl);

        JPanel p1 = new JPanel();     p1.setBackground(Color.RED);
        cardpanel.add(p1, "Red");

        JPanel p2 = new JPanel();     p2.setBackground(Color.green);
        cardpanel.add(p2, "Green");

        JPanel p4 = new JPanel();     p4.setBackground(Color.cyan);
        cardpanel.add(p4, "Cyan");

        JPanel p3 = new JPanel();     p3.setBackground(Color.PINK);
        cardpanel.add(p3, "Pink");

        class Listener implements ActionListener {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == previousButton) {
                    cl.previous(cardpanel);
                } else if (ae.getSource() == nextButton) {
                    cl.next(cardpanel);
                } else if (ae.getSource() == showButton) {
                    cl.show(cardpanel, textfield.getText());
                }
            }
        }

        Listener l = new Listener();
        previousButton.addActionListener(l);
        nextButton.addActionListener(l);
        showButton.addActionListener(l);
        textfield.addActionListener(l);

        f.setVisible(true);

        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception ex) {
            }
            cl.next(cardpanel);
        }
    }
}
