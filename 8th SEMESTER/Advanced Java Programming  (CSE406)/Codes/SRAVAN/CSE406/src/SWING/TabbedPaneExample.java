package SWING;
import javax.swing.*;
public class TabbedPaneExample {
    public static void main(String[] args){
        JFrame f = new JFrame("Tabbed Pane Example");
        JTextArea ta = new JTextArea(200,200);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
//        p1.add(ta);
//        p2.add(ta);
//        p3.add(ta);
        
        
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,50,200,200);
        tp.add("main", p1);
        tp.add("visit", p2);
        tp.add("help", p3);
        tp.add("exit", p4);
        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
