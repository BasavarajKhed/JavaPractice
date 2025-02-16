package day9;

public class SwappingOfTwoStrings {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Selenium";
		String temp;

		System.out.println("Before swapping value of s1: " + s1);
		System.out.println("Before swapping value of s2: " + s2);

		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("After swapping value of s1: " + s1);
		System.out.println("After swapping value of s2: " + s2);

	}

}
