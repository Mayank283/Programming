package graphical;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.GridLayout;

public class Example extends JFrame implements Runnable {
	JPanel left;
	JPanel right;

	public Example() {
		super("Two JPanels in here");
		left = new JPanel() {
			public void paintComponent(Graphics g) {
				g.setColor(Color.red);
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		right = new JPanel() {
			public void paintComponent(Graphics g) {
				g.setColor(Color.blue);
				g.fillRect(0, 0, getWidth(), getHeight());
			}
		};

	}

	public void run() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(1, 2));
		getContentPane().add(left);
		getContentPane().add(right);
		setVisible(true);
	}

	public static void main(String[] args) {
		Example e = new Example();
		javax.swing.SwingUtilities.invokeLater(e);
	}

}