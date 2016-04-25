package LinkList;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		char tell = 'Y';
		int n, i = 0;
		StLinkList obj = new StLinkList();
		Scanner in = new Scanner(System.in);

		Node[] a = new Node[5];
		// Node b=new Node();
		// Node c=new Node();
		while (tell != 'N') {
			n = in.nextInt();
			a[i] = new Node(n);
			// int m =in.nextInt();
			// a[i].setinfo(n);
			// b.setinfo(m);
			obj.insertEnd(a[i]);
			System.out.println("Still continue");
			tell = in.next().charAt(0);
			i++;
			// obj.insertBeg(b);
		}
		obj.insert(20, 4);
		obj.dispList();

		in.close();
	}
}