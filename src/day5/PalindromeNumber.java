package day5;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 16461;
		int originalNum = num;
		int rev=0 ;
		

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
			
	
		}
		if(rev==originalNum) {
			System.out.println("P");
		}
		else {
			System.out.println("NP");
		}
		
		
		
	}

}
