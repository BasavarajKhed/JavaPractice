package day22;

public class Fact {

	public static void main(String[] args) {
		int num = 3;
		int fact = 1;

		for (int i = 1; i <= 3; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}

}
