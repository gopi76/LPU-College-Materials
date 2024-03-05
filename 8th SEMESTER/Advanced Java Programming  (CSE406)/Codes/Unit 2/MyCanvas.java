import java.awt.*;
import javax.swing.*;

class MyCanvas extends Canvas {

	int x = 0;
	boolean left, right;

	void move() {

		if(right == true) {
			x++;
		} 
		else if(left == true) {
			x--;
		}

		if(x == 550) x = 0;

		try { 
			Thread.sleep(5);
		} catch(Exception ex) {

	    }


		repaint();
	}

    public void paint(Graphics g) {

    	g.setColor(Color.RED);
    	g.fillOval(20+x, 20, 20, 20);
    	move();


    	int[] x = { 150, 200, 100, 500, 300 };
    	int[] y = { 100, 300, 150,  50, 150 };

    	//g.drawPolyLine(x, y, 5);
    	g.drawPolygon(x, y, 5);
    	//g.fillPolygon(x, y, 5);


    	g.setColor(Color.BLUE);
    	g.setFont();
    }

	public static void main(String args[]) {

		JFrame jf = new JFrame("Feb 13, 2024");
		jf.setSize(600, 600);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

        
        class MyListener extends KeyAdapter {
        	public void keyPressed(KeyEvent k) {

        		if(k.getKeyCode() == KeyEvent.VK_LEFT){
        			left = true;
        			right = false;
        		} else if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
        			left = false;
        			right = true;
        		}
        	}
        }



		MyListener l = new MyListener();

		MyCanvas c = new MyCanvas();
		c.addKeyListener(l);

		jf.add(c);
		jf.setVisible(true);
	}
}