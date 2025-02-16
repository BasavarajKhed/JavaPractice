package day12;

public class OverLoadMain {

	void main() {
		System.out.println("Test");
	}

	void main(String s) {
		System.out.println(s);
	}

	void main(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		OverLoadMain ov=new OverLoadMain();
		ov.main();
		ov.main("Basavaraj");
		ov.main(10, 20);
		

	}

}
