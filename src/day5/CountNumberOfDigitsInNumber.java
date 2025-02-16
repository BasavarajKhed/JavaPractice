package day5;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {

		int num = 789;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number Of Digits " + count);
	}

}
