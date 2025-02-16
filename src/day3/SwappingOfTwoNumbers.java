package day3;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;

		/*	int c;

		System.out.println("Before Swapping");
		System.out.println(a);

		System.out.println(b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping");
		System.out.println(a);
		
		

		System.out.println(b);
	*/	
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
