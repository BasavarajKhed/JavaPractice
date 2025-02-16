package day22;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		int a[] = { 8, 2, 9, 4, 7, 1, 3, 5, 6 };

		System.out.println("Before Sorting...........");
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));

	}

}
