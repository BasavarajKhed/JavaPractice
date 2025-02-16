package day4;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=100,b=200,c=30;
		
		if(a>b && a>c) {
			System.out.println("A is Greater " +a);
		}
		
		else if(b>a &&b>c) {
			System.out.println("B is Greater " +b);
		}
		else {
			System.out.println("C is Greater " +c);
		}
	}

}
