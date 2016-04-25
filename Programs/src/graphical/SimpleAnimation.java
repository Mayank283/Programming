package graphical;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {

	JFrame frame;
	int x = 70, y = 70;

	public static void main(String[] args) {
		SimpleAnimation g = new SimpleAnimation();
		g.go();
	}

	public void go() {
		frame = new JFrame();
		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setVisible(true);
		for (int i = 0; i < 300; i++) {
			x++;
			y++;
			frame.repaint();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}
		}
	}

	public class MyDrawPanel extends JPanel {

		public void paintComponent(Graphics gd) {
			gd.setColor(Color.RED);
			gd.fillOval(x, y, 100, 100);
		}

	}

}