package com.pra;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6,7, 8, 10 };

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}

		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}

		System.out.println(sum2 - sum1);
	}

}
