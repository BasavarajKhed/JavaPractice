package day16;

interface shape {
	int length = 10; // final and static
	int width = 20; // final and static

	void circle(); // abstract method

	default void square() {
		System.out.println("This is square...");
	}

	static void rectangel() {
		System.out.println("this is rectangle -static methos");
	}

}

public class InterfaceDemo implements shape {

	public void circle() {
		System.out.println("This is circle");
	}

	void triangle() {
		System.out.println("this is from Interfacse demo method");
	}

	public static void main(String[] args) {
		
		  InterfaceDemo id = new InterfaceDemo(); 
		  id.square(); 
		  id.circle();
		  shape.rectangel();
		
		  id.triangle();
//		shape sh = new InterfaceDemo();
//		sh.circle();
//		sh.square();
//		System.out.println(sh.length + sh.width);
//		shape.rectangel();

	}

}
