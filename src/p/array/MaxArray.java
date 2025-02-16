package p.array;

public class MaxArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 3 };

		int num = 3;

		boolean status = false;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Dublicate found " + a[i]);
					status = true;
				}
			}
		}

		if (status == false) {
			System.out.println("DOnt have dublicate found ");
		}
	}

}
