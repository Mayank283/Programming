package Sort;

import java.util.*;

public class msort {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int length = in.nextInt();

		int[] a = new int[length];

		System.out.println("Enter Array to sort one by one");

		for (int i = 0; i < length; i++)
			a[i] = in.nextInt();

		mergesort(a, 0, length - 1);

		for (int i = 0; i < length; i++)
			System.out.print(a[i] + " ");
		in.close();
	}

	public static void merge(int a[], int start, int mid, int end) {

		int p = start;
		int q = mid + 1;

		int[] arr = new int[end - start + 1];
		int k = 0;

		for (int i = start; i <= end; i++) {
			if (p > mid)
				arr[k++] = a[q++];

			else if (q > end)
				arr[k++] = a[p++];

			else if (a[p] > a[q])
				arr[k++] = a[p++];

			else
				arr[k++] = a[q++];
		}

		for (p = 0; p < k; p++)
			a[start++] = arr[p];
	}

	public static void mergesort(int a[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;

			mergesort(a, start, mid);
			mergesort(a, mid + 1, end);

			merge(a, start, mid, end);
		}
	}
}