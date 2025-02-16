package day22;

public class Swap {

	public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Java";
		System.out.println("Before Swapping......");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat(s2);

		s2 = s1.substring(0, s1.length() - s2.length());

		s1 = s1.substring(s2.length());

		System.out.println("After Swapping......");
		System.out.println(s1);
		System.out.println(s2);

	}

}
