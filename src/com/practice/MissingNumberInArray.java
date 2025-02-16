package com.practice;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int a1[] = { 1, 2,3, 4, 5,7,8,9,10 };
		
		int sum1 = 0;
		
		for (int i = 0; i < a1.length; i++) {
			sum1 = sum1 + a1[i];
		}
		
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 = sum2 + i;
		}

		int s=sum2-sum1;
		System.out.println(s);

	}

}
