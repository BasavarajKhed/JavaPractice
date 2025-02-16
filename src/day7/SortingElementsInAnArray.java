package day7;

import java.util.Arrays;

public class SortingElementsInAnArray {

	public static void main(String[] args) {
		int a[]= {100,800,399,489,300,600};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		

	}

}
