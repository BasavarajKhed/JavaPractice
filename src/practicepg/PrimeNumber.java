package practicepg;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 11;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Given Number Is Palindrome Number");
			}

			else {
				System.out.println("Given Number is Not a Palindrome Number");
			}
		}

		else {
			System.out.println("Given Number is not a Prime Number");
		}

	}

}
