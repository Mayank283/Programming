package chatbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {

	ArrayList clientOutputStreams;
	private ServerSocket serversock;

	public class ClientHandler implements Runnable {
		BufferedReader reader;
		Socket sock;

		public ClientHandler(Socket clientSocket) {
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		public void run() {
			String message;
			try {
				while ((message = reader.readLine()) != null) {
					System.out.println("read" + message);
					tellEveryone(message);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new ChatServer().go();
	}

	public void go() {
		clientOutputStreams = new ArrayList();
		try {
			serversock = new ServerSocket(4242);
			while (true) {
				Socket clientsocket = serversock.accept();
				PrintWriter writer = new PrintWriter(clientsocket.getOutputStream());
				clientOutputStreams.add(writer);
				Thread t = new Thread(new ClientHandler(clientsocket));
				t.start();
				System.out.println("Got Connection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tellEveryone(String message) {
		java.util.Iterator it = clientOutputStreams.iterator();
		while (it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(message);
				writer.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
