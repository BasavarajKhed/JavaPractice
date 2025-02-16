package day7;

public class FindLargestNumber {

	public static void main(String[] args) {
		int a[] = { 12, 34, 21, 27, 74 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Maximum Number is " + max);

	}

}
