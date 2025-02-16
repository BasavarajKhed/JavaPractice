package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings g1 = new Greetings();
		g1.m1();
		String s = g1.m2();
		System.out.println(s);
		g1.m3("Basavaraj");
		int a = g1.m4(97);
		System.out.println(a);
	}

}
