package com.practice;

public class Count {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40,30,30,30,10 };
		int s = 10;
		int count = 0;

		for(int x:a) {
			if(x==s) {
				count++;
			}
		}
		System.out.println(count);
	}

}
