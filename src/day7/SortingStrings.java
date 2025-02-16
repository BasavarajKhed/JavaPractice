package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
//		String s[]= {"Basavaraj","Camerian","Aania","Danoj"};
		char s[]={'f','s','r','s'};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(s));
	}

}
