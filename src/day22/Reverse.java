package day22;

public class Reverse {

	public static void main(String[] args) {

		/*
		 * String rev = "";
		 * 
		 * for (int i = s1.length() - 1; i >= 0; i--) { rev = rev + s1.charAt(i); }
		 * 
		 * if(rev.equals(s1)) { System.out.println("Palindrome String"); }
		 * 
		 * else { System.out.println("Not a Palindrome String"); }
		 */

		String s1 = "Selenium";

		char[] a = s1.toCharArray();

		int count = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}

		if (count > 1) {
			System.out.println("Dublicate Element found");
		}

		else {
			System.out.println("Dublicate Element not found ");
		}

	}

}
