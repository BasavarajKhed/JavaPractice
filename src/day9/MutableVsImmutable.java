package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// Mutable
		int a[] = { 700, 200, 300, 400 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));

		// Immutable-cannot change
		/*
		 * String s = "Welcome"; System.out.println(s); s.concat("To JAVA");
		 * System.out.println(s);
		 * 
		 * String concatinatedstring=s.concat("To JAVA");
		 * System.out.println(concatinatedstring); System.out.println(s);
		 */

		/*
		 * StringBuffer s=new StringBuffer("Welcome"); System.out.println(s);
		 * 
		 * s.append(" to java"); System.out.println(s);
		 */

		StringBuilder s = new StringBuilder("Welcome");
		System.out.println(s);

		s.append(" to java");
		System.out.println(s);
		
		
		

	}

}
