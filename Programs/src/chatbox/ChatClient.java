package chatbox;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient {

	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	Socket sock;
	PrintWriter writer;

	public static void main(String[] args) {
		ChatClient client = new ChatClient();
		client.go();
	}

	private void go() {

		JFrame frame = new JFrame("Simple Chat Client");
		JPanel panel = new JPanel();
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		JScrollPane scroll = new JScrollPane(incoming);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		outgoing = new JTextField(20);
		JButton button = new JButton("Send");
		button.addActionListener(new SendButtonListener());
		panel.add(BorderLayout.EAST, button);
		panel.add(scroll);
		panel.add(outgoing);
		setUpNetworking();

		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	private void setUpNetworking() {

		try {
			sock = new Socket("127.0.0.1", 4242);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("network established");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public class SendButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			outgoing.setText(" ");
			outgoing.requestFocus();
		}
	}

	public class IncomingReader implements Runnable {
		public void run() {
			String message;
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read" + message);
					incoming.append(message + "\n");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}