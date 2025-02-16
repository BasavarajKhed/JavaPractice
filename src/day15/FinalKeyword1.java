package day15;

class A {
	final int a = 10;
}

public class FinalKeyword1 {

	public static void main(String[] args) {
		A aobj = new A();
//		aobj.a=100; final keyword value cannot be change
		System.out.println(aobj.a);

	}

}
