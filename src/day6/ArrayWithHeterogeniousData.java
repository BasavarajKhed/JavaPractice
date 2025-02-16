package day6;

public class ArrayWithHeterogeniousData {

	public static void main(String[] args) {

		Object a[] = { 100, 10.3, "Basavaraj", true, 'H', 3536.6f, 1234657l };

		/*
		 * for (Object x : a) { System.out.println(x); System.out.println(a[0]);
		 * 
		 * }
		 */
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

}
