package day15;

class ABC {
	void m1(int a) {
		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	void m1(int a) { // overriding
		System.out.println(a * a);
	}
	void m2(int b) {
		System.out.println(b*b);
	}
	void m2(int a, int b) { // overloading
		System.out.println(a + b);
	}

}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		XYZ xobj=new XYZ();
		xobj.m1(10);
		xobj.m2(12,13);
		xobj.m2(15);
		
		

	}

}
