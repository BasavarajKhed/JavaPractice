package com.test;

public class EvenOdd {

	public static void main(String[] args) {
		int num = 1234;
		int ecount = 0;
		int odcount = 0;

		while (num > 0) {
			int rem = num % 10;

			if (rem % 2 == 0) {
				ecount++;
			} else {
				odcount++;
			}
			num = num / 10;
		}
		
		System.out.println(ecount);
		System.out.println(odcount);
	}

}
