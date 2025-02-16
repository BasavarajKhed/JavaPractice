package practicepg;

public class TestString {

	public static void main(String[] args) {

		String s = "madam";
//		String rev = "";

		/*
		 * for (int i = s.length() - 1; i >= 0; i--) { rev = rev + s.charAt(i); }
		 * 
		 * if(rev.equals(s)) { System.out.println("Palindrome String"); } else {
		 * System.out.println("Not a palindrome String"); }
		 */
		char a[] = s.toCharArray();
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		if (count > 1) {
			System.out.println("Dublicate found");
		} else {
			System.out.println("Dublicate Not Found");
		}

	}

}
