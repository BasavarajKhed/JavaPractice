package com.practice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

//		String s2="Welcome";
//		System.out.println(s1==s2);

//		String s3=new String("Test");
//		String s4=new String("Test");
//		System.out.println(s3==s4);
//		String s1="Welcome";
//		System.out.println(s1.length());
		String s1 = "Welcome";
		String s2 = "Java";
		String s3 = "automation";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2 + s3));

		// trim()-remove spaces right and left side
		s1 = "   Welcome   ";
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.trim());

		// charAt Methods -returns a character from index based
		s1 = "Welcome";

		System.out.println(s1.charAt(3));
//		checks string is main part of string
		System.out.println(s1.contains("lco"));

//	Equals and equalsIgnoreCase

		s1 = "welcome";
		s2 = "welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));

//		replace
		s1 = "welcome to selenium java selenium python selenium c#";
		System.out.println(s1.replace('e', 'X'));
		System.out.println(s1.replace("selenium", "playwright"));

		// substring()-extract from the main string
		s1 = "Selenium";
		System.out.println(s1.substring(1, 5));
		// touppercase
		// toLowerCase
		// split
		s1 = "abc@gmail.com";
		String a[] = s1.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);

		System.out.println(Arrays.toString(a));

		String amount = "$15,20,55";
//		System.out.println(amount.replace("$", ""));

		System.out.println(amount.replace("$", "").replace(",", ""));

		String s = "abc,123@xyz";

		String a1[] = s.split(",");
		String a2[] = a1[1].split("@");

		System.out.println(a1[0]); //abc
		System.out.println(a2[0]); //123
		System.out.println(a2[1]); //xyz
		
		
		

	}

}
