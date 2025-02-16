package com.test;

public class Practice {

	public static void main(String[] args) {
		int num=12321;
		int org=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}

		if(rev==org) {
			System.out.println("PN");
		}
		else {
			System.out.println("NP");
		}
		
	}

}
