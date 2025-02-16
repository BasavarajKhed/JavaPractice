package day19;

public class TypeCastingObject3 {

	public static void main(String[] args) {
//		Object o =new String("welcome");
//		StringBuffer sb=(StringBuffer)o; //rule1,rule2,rule3 failed

//		String s=new String("welcome");
//		StringBuffer sb=(StringBuffer)s; rule1 -failed

//		
//		Object o=new String("welcome");
//		StringBuffer sb=(String)o;  //rule is not valid

//		String s=new String("welcome");
//		StringBuffer sb=(String)s; //rule 2 failed
		Object o = new String("welcome");

		String s = (String) o;
		System.out.println(s);

	}

}
