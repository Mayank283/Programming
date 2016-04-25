package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ambiguous {

	public static void main(String[] args) {
		int i, num;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (i = 0; i < n; i++) {
			num = in.nextInt();
			a[i] = num;
			b[num - 1] = i + 1;
		}
		if (Arrays.equals(a, b))
			System.out.println("ambiguous");
		else
			System.out.println("not ambiguous");
		in.close();
	}

}
