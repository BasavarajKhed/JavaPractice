package test_java;

public class OverLodaed {

	void cal() {
		System.out.println("cal without param");
	}

	void cal(int x) {
		System.out.println("cal with one  param" + x);
	}

	void cal(int x, int y) {
		System.out.println("cal with two param " + (x + y));
	}

	void cal(double x, int y) {
		System.out.println("cal with change in parmeter param " + (x + y));
	}

	public static void main(String[] args) {

		OverLodaed ov = new OverLodaed();

		ov.cal();
		ov.cal(100);
		ov.cal(12.5, 19);
		ov.cal(13, 25);

	}

}
