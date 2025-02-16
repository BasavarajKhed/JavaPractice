package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "welcome";
//		String s=new String("welcome");
//		System.out.println(s);

		// length()
//		System.out.println(s.length());
		System.out.println("welcome".length());

		// concat()-joining strings
		String s1 = "welcome";
		String s2 = "to java";
		String s3 = "automation";
		System.out.println(s1 + s2);

		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));

		System.out.println(s1.concat(s2 + s3));
		System.out.println("welcome" + "to java");
		System.out.println("welcome".concat("to java"));

		// trim()

		s = "   welcome   ";
		System.out.println("Before trim");
		System.out.println(s);

		System.out.println(s.trim());
		System.out.println("After trim: " + s.trim().length());

		// charAt()
		s = "welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));

		// contains()-returns true or false
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("COME"));
		System.out.println(s.contains("welme"));

		// equals and equalsIgnoreCase-Compare Strings
		s1 = "welcome";
		s2 = "welcome";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));

		// replace()-replace single or multiple characters in sequence

		s = "welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X'));// wXlcomX to sXlXnium java sXlXnium python sXlXnium c#
		System.out.println(s.replace("selenium", "playwright"));// welcome to playwright java playwright python
																// playwright c#

		// substring()-extract substring from main string
		s = "welcome";
		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(1, 4));
		System.out.println(s.substring(3, 6));
		System.out.println(s.substring(1, 5));

		// toUpperCase
		s = "welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

//		split()
		s = "basavarajkhed@gmail.com";

		String a[] = s.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);

		String amount = "$15,20,55";
		System.out.println(amount.replace("$", "").replace(",", ""));

		s = "abc,123@xyz";
		String a1[] = s.split(",");
		System.out.println(Arrays.toString(a1));

		String a2[] = a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		
		
		s="abc 123";
		String a3[]=s.split(" ");
		System.out.println(Arrays.toString(a3));
		
		
		String name="John Kenedy";
		System.out.println(name.contains("john"));
		System.out.println(name.replace('J', 'j').contains("john"));
		System.out.println(name.toLowerCase().contains("john"));
		
		
	}

}
