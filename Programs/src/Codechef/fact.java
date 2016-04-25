package Codechef;

import java.util.Scanner;

class fact {

	public static void main(String[] args) {
		int n, limit, i;
		Scanner in = new Scanner(System.in);
		limit = in.nextInt();
		int sum[] = new int[limit];
		for (i = 0; i < limit; i++) {
			n = in.nextInt();
			while (n / 5 != 0) {
				n /= 5;
				sum[i] += n;
			}

		}
		i = 0;
		while (i < limit)
			System.out.println(sum[i++]);
		in.close();
	}
}