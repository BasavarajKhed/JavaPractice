package day2;

public class PrimeNumber {

	public static void main(String[] args) {
//Number Should be divide by 1 or itself then Given Number will be ProimeNumber
		int num = 7;

		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Given Number Is a Prime Number " + num);
			} else {
				System.out.println("Given Number Is Not a Prime Number " + num);
			}

		} else {
			System.out.println("Given Number Is Not a Prime Number " + num);
		}

	}

}
