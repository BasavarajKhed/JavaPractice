package com.test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even Numbers....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even " + a[i]);
			}

		}

		System.out.println("Odd Numbers....");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println("odd " + a[i]);
			}

		}

	}

}
