package day9;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		String s = "MadaM";
		String rev = "";
		String Original_string = s;
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (Original_string.equals(rev)) {
			System.out.println("Given string is Palindrome");
		} else {
			System.out.println("Given string is not Palindrome");
		}
	}

}
