package day19;

class Parent {
	String name = "John";

	void m1() {
		System.out.println("This is m1");
	}
}

class Child extends Parent {
	int i = 101;

	void m2() {
		System.out.println("This is m2");
	}
}

public class TypeCastingObject {

	public static void main(String[] args) {
		/*
		 * Child c = new Child(); System.out.println(c.i); System.out.println(c.name);
		 * c.m1(); c.m2();
		 */

		/*
		 * Parent p=new Child(); p.m1(); System.out.println(p.name);
		 */
//down casting
		Parent p = new Parent();
		Child c=(Child)p;
		System.out.println(c.name);
		c.m1();
		System.out.println(c.i);
		c.m2();
		
		

	}

}
