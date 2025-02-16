package practicepg;

public class Dup {

	public static void main(String[] args) {
		String s = "welcome";

		char[] arr = s.toCharArray();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;

				}

			}
		}

		if (count > 1) {
			System.out.println("Dublicate Element found");
		} else {
			System.out.println("Dublicate Element not found ");
		}
	}

}
