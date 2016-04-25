package LinkList;

import java.util.Scanner;

public class LL {

	int data;
	LL node;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		LL a = new LL();
		LL b = new LL();
		a.data = in.nextInt();
		b.data = in.nextInt();
		a.node = b;

		while (a != null) {
			System.out.print(a.data + "->");
			a = a.node;
		}
		in.close();
	}

}
