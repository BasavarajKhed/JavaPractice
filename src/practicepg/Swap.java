package practicepg;

public class Swap {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println("Before Swapping");
		System.out.println(x);
		System.out.println(y);

		/*
		 * x = x + y; y = x - y; x = x - y;
		 * 
		 * System.out.println("After Swapping");
		 * 
		 * System.out.println(x); System.out.println(y);
		 */

		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swapping");
		System.out.println(x);
		System.out.println(y);

	}

}
