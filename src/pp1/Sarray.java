package pp1;

public class Sarray {

	public static void main(String[] args) {
		String a = "TET";
		
		  String rev = "";
		  
		  for (int i = a.length() - 1; i >= 0; i--) { 
			  rev = rev + a.charAt(i); 
			  }
		 if(rev.equals(a)) {
			 System.out.println("PN");
		 }
		 else {
			 System.out.println("NP");
		 }
		  
		 

	/*	char ac[] = a.toCharArray();

		for (int i = ac.length - 1; i >= 0; i--) {
			System.out.print(ac[i]);
		}
*/
		
//		StringBuilder s=new StringBuilder(a);
//		System.out.println(s.reverse());
		
//		StringBuffer sf=new StringBuffer(a);
//		System.out.println(sf.reverse());
		
		
	}

}
