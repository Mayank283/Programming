package Sort;

import java.util.Scanner;

public class Qsort {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int length = in.nextInt();

		int[] a = new int[length];

		System.out.println("Enter Array to sort one by one");
		for (int i = 0; i < length; i++)
			a[i] = in.nextInt();

		quickSort(a, 0, length - 1);

		for (int i = 0; i < length; i++)
			System.out.print(a[i] + " ");
		in.close();
	}

	public static int partition(int a[], int start, int end) {

		int pIndex = start;
		int pivot = a[end];
		int temp = 0;
		for (int i = start; i < end; i++) {

			if (a[i] <= pivot) {
				temp = a[i];
				a[i] = a[pIndex];
				a[pIndex] = temp;
				pIndex = pIndex + 1;
			}
		}
		temp = a[end];
		a[end] = a[pIndex];
		a[pIndex] = temp;
		return pIndex;
	}

	public static void quickSort(int a[], int start, int end) {
		if (start < end) {
			int pivotindex = partition(a, start, end);
			quickSort(a, start, pivotindex - 1);
			quickSort(a, pivotindex + 1, end);
		}
	}
}