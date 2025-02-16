package day9;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s = "Java Programming Java oops";

		int original_length=s.length();
		
		int after_Removing_character_a_lentgth=s.replace("J", "").length();
		
		int repeated_a=(original_length-after_Removing_character_a_lentgth);
		
		System.out.println("Occurances of character a in a string  "+repeated_a);
	}

}
