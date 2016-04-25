package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Stax {

	public static void main(String args[]) {
		String n;
		char c = 'Y';
		Stack<String> s = new Stack<String>();

		Scanner in = new Scanner(System.in);
		while (c != 'N') {
			n = in.nextLine();
			s.push(n);
			System.out.println("Continue!!?");
			c = in.next().charAt(0);
		}
		while (!s.empty())
			System.out.print(s.pop());
		in.close();
	}
}
