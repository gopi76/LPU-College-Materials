package cse406;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TabbedPaneDemo19
{
static public void main(String... rk)
{
JFrame f = new JFrame();
f.setSize(600, 800);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.YELLOW);
CardLayout cl = new CardLayout();
JPanel cardpanel = new JPanel();
f.add(cardpanel);
cardpanel.setLayout(cl);

JPanel p1 = new JPanel(); p1.setBackground(Color.RED);
cardpanel.add(p1, "Red");

JPanel p2 = new JPanel(); p2.setBackground(Color.green);
cardpanel.add(p2, "Green");

JPanel p4 = new JPanel(); p4.setBackground(Color.cyan);
cardpanel.add(p4, "Cyan");

JPanel p3 = new JPanel(); p3.setBackground(Color.PINK);
cardpanel.add(p3, "Pink");

f.setVisible(true);

while(true)
{

try { Thread.sleep(3000); }
catch(Exception ex){}
cl.next(cardpanel);
}
}
}
