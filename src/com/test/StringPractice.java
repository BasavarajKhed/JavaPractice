package com.test;

public class StringPractice {

	public static void main(String[] args) {
		
		String a="Basavaraj";

		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		
		if(rev.equals(a)) {
		System.out.println("String is Palindrome..... ");
		}
		else {
			System.out.println("String is Not Palindrome..... ");
		}
	}

}
