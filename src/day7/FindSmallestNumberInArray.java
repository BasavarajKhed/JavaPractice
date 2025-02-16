package day7;

public class FindSmallestNumberInArray {

	public static void main(String[] args) {
		int a[] = { 12, 34, 21, 27, 74,10 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimum Number is " + min);

	}

}
