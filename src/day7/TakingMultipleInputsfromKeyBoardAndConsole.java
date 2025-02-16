package day7;

import java.util.Scanner;

public class TakingMultipleInputsfromKeyBoardAndConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter First Number");
		 * 
		 * int a = sc.nextInt();
		 * 
		 * System.out.println("Enter Second Number");
		 * 
		 * int b = sc.nextInt();
		 * 
		 * 
		 * System.out.println("Addition of Two Numbers "+(a+b));
		 */

		System.out.println("Enter Your Correct Name");
		String name = sc.next();
		System.out.println("your Name is: " + name);
		System.out.println("Enter Your Age ");
		int age = sc.nextInt();
		System.out.println("Your age is" + age);

		System.out.println("Enter unknown value ");
		Object value = sc.next();
		System.out.println("Your Unknown Value is " + value);

	}

}
