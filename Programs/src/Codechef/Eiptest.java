package Codechef;

import java.util.Scanner;

public class Eiptest {

	static int num, i, c;

	static Scanner in = new Scanner(System.in);

	public int test(int a, int b) {
		for (i = 1; i <= a; i++) {
			num = in.nextInt();

			if ((num % b) == 0)

				c++;
		}
		return c;
	}
}
