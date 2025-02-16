package practicepg;

public class PerfectNumber {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		System.out.println(num);
		if (sum == num) {
			System.out.println("Perfect Number");
		}

		else {
			System.out.println("Not A Perfect Number");
		}

	}

}
