package com.test;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4 };

		int min = a[0];

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
