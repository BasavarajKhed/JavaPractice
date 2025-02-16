package day6;

public class OneDimensionalArray {

	public static void main(String[] args) {

		/*
		 * declare array add values into array Find size of an array read single value
		 * from an array read multiple values from an array
		 */
//approach one
		/*
		 * int a[]=new int[5];
		 * 
		 * a[0]=100; a[1]=200; a[2]=300; a[3]=400; a[4]=500;
		 */
//		Approach 2
		int a[] = { 100, 200, 300, 400, 500 };
//Length of an array
		System.out.println("Length of an array "+ a.length);
		// Read Single value from array
		System.out.println(a[0]);

//		for (int i = 0; i <= a.length - 1; i++) {
//			System.out.println(a[i]);
//		}

		
		for(int x:a) {
			System.out.println(x);
		}
	}

}
