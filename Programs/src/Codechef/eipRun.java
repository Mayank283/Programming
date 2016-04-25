package Codechef;

import java.util.Scanner;

public class eipRun {
	public static void main(String[] args) {

		int n, k, r;

		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		k = in.nextInt();

		r = new Eiptest().test(n, k);

		System.out.println(r);

		in.close();
	}
}