package com.practice;

public class Palindrome {

	public static void main(String[] args) {

		String s1 = "MANAM";
		String org = s1;
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		if (rev.equals(org)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not Palindrome");
		}
	}

}
