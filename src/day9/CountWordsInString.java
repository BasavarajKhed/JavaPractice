package day9;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {

		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println("Number of words in a string " + count);

	}

}
