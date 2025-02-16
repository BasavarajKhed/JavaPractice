package day22;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "Welcome to java";

		String a[] = s.split(" ");

		String rev = "";

		System.out.println(Arrays.toString(a));

		for (String t : a) {

			String revword = "";

			for (int i = t.length() - 1; i >= 0; i--) {
				revword = revword + t.charAt(i);
			}

			rev = rev + revword + " ";
		}

		System.out.println(rev);
	}

}
