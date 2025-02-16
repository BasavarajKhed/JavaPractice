package day4;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {

		int a = -5, b = 0, c = -1;

		if (a < b && a < c) {
			System.out.println(a);
		}

		else if (b < a && b < c) {
			System.out.println(b);
		}

		else {
			System.out.println(c);
		}

	}

}
