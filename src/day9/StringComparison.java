package day9;

public class StringComparison {

	public static void main(String[] args) {
		//case1
	/*	String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
	/*	String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2); //it compare the objects
		System.out.println(s1.equals(s2)); // compare the values of objects
	*/
		
		//case3
	/*	String s1="abc";
		String s2=new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
*/
		//case4
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}

}
