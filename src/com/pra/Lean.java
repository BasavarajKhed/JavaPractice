package com.pra;

public class Lean {

	public static void main(String[] args) {
		int a[] = { 1, 23, 4, 5, 6,1 };
		int num = 1;
		int count=0;
	

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				count++;
			}
		}
		System.out.println("Number of occuranaces of an element is "+count);
	}

}
