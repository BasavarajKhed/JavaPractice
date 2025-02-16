package day7;

public class LenearSearchOfAnArray {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 400, 600 };
		int num = 200;
		boolean status = false;

		/*
		 * for (int i = 0; i <= a.length - 1; i++) {
		 * 
		 * if (a[i] == num) {
		 * 
		 * System.out.println("Element is Found "); status = true; break; }
		 * 
		 * }
		 */

		for (int x : a) {
			if (x == num) {
				System.out.println("Element is Found ");
				status = true;
				break;
			}
		}

		if (status == false)
			System.out.println("Element is not found");

	}

}
