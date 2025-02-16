package day7;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

//		Number should be in range
//		Should not have Dublicates
		int a[] = { 1, 2,3, 4,5, 6,7,8,10,11 };

		int sum1 = 0;

		for (int i = 0; i <= a.length - 1; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in the array: " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= 11; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sum of range of elements in the array: " + sum2);

		System.out.println("Missing Number is " + (sum2 - sum1));
	}

}
