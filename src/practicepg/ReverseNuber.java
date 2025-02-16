package practicepg;

public class ReverseNuber {

	public static void main(String[] args) {

		int num = 1217;

		int orgnum = num;

		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(rev);
		/*
		 * if (rev == orgnum) { System.out.println("Palindrome Num"); } else {
		 * System.out.println("Not A Palindrome Number"); }
		 */

	}

}
