package com.practice;

public class ReverseString {

	public static void main(String[] args) {

	/*	String s1 = "Selenium";
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		System.out.println(rev);
	}
*/
		
		String s1="Welcome";
		
		String rev="";
		
		char a[]=s1.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
	System.out.println(rev);
	
}
}