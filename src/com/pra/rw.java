package com.pra;

public class rw {

	public static void main(String[] args) {
		String s1="test";
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		
		if(rev.equals(s1)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}

	}

}
