package com.test;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 19;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}

			if (count == 2) {
				System.out.println("Prime ");
			}
			else {
				System.out.println("NP");
			}
		} else {
			System.out.println("NP");
		}
	}

}
