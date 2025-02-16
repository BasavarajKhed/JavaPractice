package com.practice;

public class Max {

	public static void main(String[] args) {
		

		int a[] = { 10, 20, 30, 40, 50,5 };
		int min = a[0];

		for (int i = 1; i <= a.length-1; i++) {
			if (a[i] < min) {
				min = a[i];

			}
		}
		System.out.println(min);
	}

}
