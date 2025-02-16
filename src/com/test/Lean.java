package com.test;

public class Lean {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int num = 5;
		boolean status = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println("Number Found...");
				status = true;
				break;
			}

		}
		if (status == false) {
			System.out.println("Number not found...");
		}

	}

}
