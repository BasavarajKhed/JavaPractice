package day9;

public class RemoveJunOrSpecialCharacters {

	public static void main(String[] args) {
		String s = "!@#$%^&*())(*&^%$#@!@#$%^&* basavaraj!@#$%^&* Khed Java Selenium";

		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		
		

	}

}
