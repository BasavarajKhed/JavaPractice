package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		try {
			System.out.println(100 / a);
		} catch (ArithmeticException e) {
			System.out.println("Invalid data");
		}
		
		

	}

}
