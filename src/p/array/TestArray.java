package p.array;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		int a[] = { 1, 7, 3, 9, 5, 6, 19 };
		System.out.println("Before Sorting....");
		System.out.println(Arrays.toString(a));
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("After Sorting....");
		System.out.println(Arrays.toString(a));
	}

}
