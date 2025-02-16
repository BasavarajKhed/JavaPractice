package pk;

public class Dup {

	public static void main(String[] args) {
		String s = "abcdefghi";
//		int count = 0;
		boolean status = false;
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; i < arr.length; i++) {
				if (arr[i] == arr[j]) {
					System.out.println("Dublicate Element fount ");
					status = true;
				}
			}
		}

		if (status == false) {
			System.out.println("Dublicate element not found");
		}
	}

}
