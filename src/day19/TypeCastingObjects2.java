package day19;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class TypeCastingObjects2 {

	public static void main(String[] args) {
//		Animal an=new Dog();
//		Cat ct=(Cat)an;
//		

		// Rule 1-Conversion is valid or not
//		Type of c and d must have some relationship (either parent or child or child to parent )

//		Dog dg=new Dog();
//		Cat ct=(Cat)dg; invalud as per rule 1

//		Rule two: Assignment is valid or not
//		c muct be either same or child of A

//		Animal an=new Dog();
//		Cat ct=(Cat)an; //Valid

//		Animal an=new Dog();
//		Cat ct=(Dog)an; Not valid 

		// Rule 3 Underlying object of type d must be either same or child of C
//		Animal an=new Dog();
//		Cat ct=(Cat)an; // invalid as per rule 3
//		Dog dg=(Dog)an;

		Animal an = new Dog();
		Dog dg = (Dog) an;   // valid type casting because it is satisfing rule1 and rule 2 and rule 3
		

	}

}
