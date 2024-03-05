import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//cardlayouts must be added to Jpanel only. 

class CardLayoutDemo {
    public static void main(String... rk) {

        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.orange);

        // to set the logo of the specific frame
        f.setIconImage(new ImageIcon("textgeneration.png").getImage());

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

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        cardpanel.add(p1, "Red");

        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN);
        cardpanel.add(p2, "Green");

        JPanel p4 = new JPanel();
        p4.setBackground(Color.CYAN);
        cardpanel.add(p4, "Cyan");

        JPanel p3 = new JPanel();
        p3.setBackground(Color.PINK);
        cardpanel.add(p3, "Pink");

        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == previousButton) {
                    cl.previous(cardpanel);
                } else if (ae.getSource() == nextButton) {
                    cl.next(cardpanel);
                } else if (ae.getSource() == showButton || ae.getSource() == textfield) {
                    String color = textfield.getText();
                    switch (color.toLowerCase()) {
                        case "red":
                            cl.show(cardpanel, "Red");
                            break;
                        case "green":
                            cl.show(cardpanel, "Green");
                            break;
                        case "cyan":
                            cl.show(cardpanel, "Cyan");
                            break;
                        case "pink":
                            cl.show(cardpanel, "Pink");
                            break;
                        default:
                            JOptionPane.showMessageDialog(f, "Invalid color!");
                    }
                }
            }
        };

        previousButton.addActionListener(buttonListener);
        nextButton.addActionListener(buttonListener);
        showButton.addActionListener(buttonListener);
        textfield.addActionListener(buttonListener);

        f.setVisible(true);
    }
}
