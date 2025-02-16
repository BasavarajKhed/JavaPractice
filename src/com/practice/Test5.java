package com.practice;

public class Test5 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Selenium";
		System.out.println("Before Swap");

		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat(s2); // JavaSelenium
		s2 = s1.substring(0, s1.length() - s2.length()); //
		// 0,(12-8)
		// 0, 4
		s1 = s1.substring(s2.length());

		
		System.out.println("After Swap");

		System.out.println(s1);
		System.out.println(s2);
		

	}

}
