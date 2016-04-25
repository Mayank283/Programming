package Codechef;

public class bina {
	static int a[] = new int[3];

	public static void Binary(int n) {
		if (n < 1)
			System.out.println(a);
		else {
			a[n - 1] = 0;
			Binary(n - 1);
			a[n - 1] = 1;
			Binary(n - 1);
		}
	}

}
