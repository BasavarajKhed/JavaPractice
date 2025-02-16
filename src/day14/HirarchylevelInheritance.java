package day14;

class Parent {
	void disply(int a) {
		System.out.println(a);
	}

}

class child1 extends Parent {
	void show(int b) {
		System.out.println(b);
	}
}

class child2 extends Parent {
	void print(int c) {
		System.out.println(c);
	}
}

public class HirarchylevelInheritance {

	public static void main(String[] args) {
		child1 ch1=new child1();
		ch1.disply(100);
		ch1.show(200);
		
		child2 ch2=new child2();
		ch2.disply(900);
		ch2.print(500);
		
		
	}

}
