package day6;

public class EvenAndOddNumbersInAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int Even_Count = 0;
		int Odd_Count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				Even_Count++;

			} else {
				Odd_Count++;
			}

		}
		System.out.println("Even = " + Even_Count);
		System.out.println("Odd = " + Odd_Count);

	}

}
