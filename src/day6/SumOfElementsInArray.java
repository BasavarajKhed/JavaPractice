package day6;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int sum = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum = sum + a[i];
 
		}

		System.out.println("Sum of An array " + sum);
	}

}
