package day9;

public class ReverseString {

	public static void main(String[] args) {
	/*	String s= "welcome";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String is " + rev);*/
		
		//approach 2
	/*	String s="seleniumtest";
		String rev="";
		
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		
		System.out.println("Reverse String is " + rev);
		
		*/
		
		//Approach 3
	/*	StringBuffer s=new StringBuffer("welcome");
		System.out.println("Reverse String" +s.reverse());
		*/
		
		
		//Approach 4
		StringBuilder s=new StringBuilder("welcome");
		System.out.println("Reverse String" +s.reverse());
		
		
		
		String a="Shib";
		String rev1="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev1=rev1+a.charAt(i);
		}
		
		System.out.println(rev1);
		
		
		
		
	}

}
