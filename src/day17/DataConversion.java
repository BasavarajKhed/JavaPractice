package day17;

public class DataConversion {

	public static void main(String[] args) {
//		String to Integer
		String a = "124";
		String b = "567";

		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));

//		String to double

		String x = "124.78";
		String y = "567.90";

		System.out.println(Double.parseDouble(x) + Double.parseDouble(y));

//		String to Boolean

		String s = "true";
//		String s="Basava";
		System.out.println(Boolean.parseBoolean(s));

//		Primitive to String
		int i1 = 10;
		double s1 = 178.78;
		char c1 = 'A';
		boolean bool = true;

		System.out.println(String.valueOf(i1));
		System.out.println(String.valueOf(s1));
		System.out.println(String.valueOf(c1));
		System.out.println(String.valueOf(bool));

	}

}
