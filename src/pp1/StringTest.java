package pp1;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * String s="testabc"; int t=s.replace("t", "").length(); int ts=s.length();
		 * 
		 * System.out.println("Numver of times t character repeated..." +(ts-t));
		 * 
		 */

		String s1 = "TEST";
		String s2 = "JAVA";
		System.out.println("BS");
		System.out.println(s1);
		System.out.println(s2);
		s1 = s1.concat(s2);

		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("AS");
		System.out.println("s1=: "+s1);
		System.out.println("s2=: "+s2);
	}

}
