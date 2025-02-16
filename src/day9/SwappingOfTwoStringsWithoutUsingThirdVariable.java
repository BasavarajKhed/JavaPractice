package day9;

public class SwappingOfTwoStringsWithoutUsingThirdVariable {

	public static void main(String[] args) {
	
		
		String s1 = "Java";
		String s2 = "Sel";
		System.out.println("Before Swapping");
		System.out.println(s1);
		System.out.println(s2);
		s1=s1+s2;//javasel
//		s2=s1-s2;
//		s1=s1+s2;      //0,7-3=4(0,4)
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping");
		System.out.println(s1);
		System.out.println(s2);
	}

}
