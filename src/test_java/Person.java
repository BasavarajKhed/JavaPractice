package test_java;

public class Person {

	private String name;
	
	// private variable
	// Getter method for name
	/*
	 * Person(String name){ this.name=name; }
	 */	
	public String getName() {
		return name;
	}
	// Setter method for name	
	public void setName(String newName) {
		this.name = newName;
	}

	public static void main(String[] args) {

		Person myObj = new Person();
		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName()); // Outputs "John"
//		myObj.getName();
	}
}
