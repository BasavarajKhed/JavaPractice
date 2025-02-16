package day22;

public class CountWords {
	public static void main(String[] args) {

		String s = "Welcome to TCC BAsavaraj";

		int count = 1;

		for (int i = 0; i < s.length(); i++) {
			/*
			 * if ((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) { count++; }
			 */
			
			if((s.charAt(i)==' ' &&(s.charAt(i+1)!=' ')))
				count++;
			/*if(s.charAt(i)!=' ') {
				
			}*/
		}

		System.out.println(count);

	}

}
