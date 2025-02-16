package day18;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("program is stared");

		String s = null;
		try {
			System.out.println(s.length());
		}

		catch (Exception e) {
			System.out.println("Handled Exception....");
			System.out.println(e.getMessage());

		}

		finally {
			System.out.println("Entered into finally block");
		}

		System.out.println("Program finished");

	}

}
