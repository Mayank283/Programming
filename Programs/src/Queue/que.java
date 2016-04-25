package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class que {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		int n;
		char c = 'Y';
		Scanner in = new Scanner(System.in);
		while (c != 'N') {
			n = in.nextInt();
			q.add(n);
			System.out.println("Continue!!?");
			c = in.next().charAt(0);
		}
		q = interLeave(q);

		while (!q.isEmpty())
			System.out.print(q.remove());
		in.close();
	}

	public static Queue<Integer> interLeave(Queue<Integer> p) {
		int halfSize = p.size() / 2;
		Queue<Integer> q2 = new LinkedList<Integer>();
		for (int i = 0; i < halfSize; i++)
			q2.add(p.remove());
		while (!q2.isEmpty()) {
			p.add(q2.remove());
			p.add(p.remove());
		}
		return p;
	}
}
