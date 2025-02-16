package day7;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayfromUserInput {

	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter a value for the position of "+i+" :");
			a[i] = sc.nextInt();

		}

		System.out.println("Array elemts are ");
		System.out.println(Arrays.toString(a));

	}

}
