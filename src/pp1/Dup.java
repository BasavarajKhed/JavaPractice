package pp1;

public class Dup {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 8, 5, 6 };
		int num = 4;
		int count = 0;
		boolean status = false;

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == num) {
				count++;

			}
			if (count > 1) {
				System.out.println("Duplicate Number is found " + a[i]);
				status = true;
				break;

			}

		}

		if (status == false) {
			System.out.println("Duplicate not found...");
		}

	}

}
