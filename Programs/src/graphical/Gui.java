package graphical;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {
	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		Gui g = new Gui();
		g.go();
	}

	public void go() {
		frame = new JFrame();
		label = new JLabel();
		MyDrawPanel drawPanel = new MyDrawPanel();
		label.setText("Currently it is me");

		JButton labelbutton = new JButton();
		labelbutton.addActionListener(new LabelListener());
		labelbutton.setText("Click me to change label");

		JButton colorbutton = new JButton();
		colorbutton.addActionListener(new ColorListener());
		colorbutton.setText("Click me to change color");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 600);
		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelbutton);
		frame.getContentPane().add(BorderLayout.NORTH, label);

		frame.setVisible(true);
	}

	public class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText("Changed the label");
		}
	}

	public class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
		}
	}
}
