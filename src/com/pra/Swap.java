package com.pra;

public class Swap {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		/*
		 * x = x + y; y = x - y; x = x - y;
		 */
		System.out.println("Before Swapp-----");
		System.out.println(x);
		System.out.println(y);

		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapp-------");
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
