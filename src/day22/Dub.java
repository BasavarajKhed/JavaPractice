package day22;

public class Dub {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 1 };

		int count = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}

		if (count > 1) {
			System.out.println("Duplicate element found");
		} else {
			System.out.println("Duplicate element not found");
		}
	}

}
