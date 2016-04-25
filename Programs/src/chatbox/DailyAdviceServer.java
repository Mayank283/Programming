package chatbox;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class DailyAdviceServer {

	String[] advicelist = { "Take bites", "tight jeans.cool" };

	public void go() {
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			while (true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) (Math.random() * advicelist.length);
		return advicelist[random];
	}

	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
		try {
			Socket s = new Socket("127.0.0.1", 4242);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}