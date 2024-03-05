import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuDemoDummy {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JMenuBar jmb = new JMenuBar();

        JMenu jm1 = new JMenu("File");
        JMenu jm2 = new JMenu("Edit");
        JMenu jm3 = new JMenu("View");

        JMenuItem jmi11 = new JMenuItem("New");
        JMenuItem jmi12 = new JMenuItem("Open");
        JMenuItem jmi13 = new JMenuItem("Save");

        JMenu jmi14 = new JMenu("Save As");
        JMenu jmi141 = new JMenu("PDF");

        JMenuItem jmi1411 = new JMenuItem("Location 1");
        JMenuItem jmi1412 = new JMenuItem("Location 2");
        jmi141.add(jmi1411);
        jmi141.add(jmi1412);

        JMenu jmi142 = new JMenu("CSV");
        JMenuItem jmi1421 = new JMenuItem("Location 1");
        JMenuItem jmi1422 = new JMenuItem("Location 2");
        jmi142.add(jmi1421);
        jmi142.add(jmi1422);

        JMenu jmi143 = new JMenu("DOCX");
        JMenuItem jmi1431 = new JMenuItem("Location 1");
        JMenuItem jmi1432 = new JMenuItem("Location 2");

        jmi143.add(jmi1431);
        jmi143.add(jmi1432);

        jmi14.add(jmi141);
        jmi14.add(jmi142);
        jmi14.add(jmi143);

        jm1.add(jmi11);
        jm1.add(jmi12);
        jm1.add(jmi13);
        jm1.add(jmi14);

        JMenuItem jmi21 = new JMenuItem("Cut");
        JMenuItem jmi22 = new JMenuItem("Copy");
        JMenuItem jmi23 = new JMenuItem("Paste");
        JMenuItem jmi24 = new JMenuItem("Rename");
        jm2.add(jmi21);
        jm2.add(jmi22);
        jm2.add(jmi23);
        jm2.add(jmi24);

        JMenu jmi31 = new JMenu("Zoom");
        JMenuItem jmi311 = new JMenuItem("Zoom In");
        JMenuItem jmi312 = new JMenuItem("Zoom Out");
        jmi31.add(jmi311);
        jmi31.add(jmi312);

        JMenuItem jmi32 = new JMenuItem("Layout");
        JMenuItem jmi33 = new JMenuItem("Settings");

        JCheckBoxMenuItem jmi34 = new JCheckBoxMenuItem("Word Wrap", false);

        jm3.add(jmi31);
        jm3.add(jmi32);
        jm3.add(jmi33);
        jm3.add(jmi34);

        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);

        jm1.insertSeparator(1);
        jm1.insertSeparator(3);
        jm1.insertSeparator(5);

        jm2.insertSeparator(1);
        jm2.insertSeparator(3);
        jm2.insertSeparator(5);

        jm3.insertSeparator(1);
        jm3.insertSeparator(3);

        f.setJMenuBar(jmb);

        class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jmi11) {
                    JOptionPane.showMessageDialog(f, "Do you want to create a new file?");
                } else if (e.getSource() == jmi13) {
                    JFileChooser fc = new JFileChooser("D: ");
                    fc.showSaveDialog(f);
                }
            }
        }

        MyListener m1 = new MyListener();
        jmi11.addActionListener(m1);
        jmi13.addActionListener(m1);
        
        f.setVisible(true);
    }
}
