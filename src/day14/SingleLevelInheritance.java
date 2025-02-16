package day14;

class A {
	int a = 100;

	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b = 200;

	void show() {
		System.out.println(b);
	}
}

class C extends B {
	int c = 300;

	void print() {
		System.out.println(c);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {

		C Cobj = new C();
		System.out.println(Cobj.a);
		System.out.println(Cobj.b);
		System.out.println(Cobj.c);
		Cobj.display();
		Cobj.show();
		Cobj.print();
	}

}
