package pk;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.Human();  
        // Outputs "This is a human."
        person.animal(); 
        // Outputs "This is an animal."
        person.car();   
        // Outputs "Driving a car."
    }
}
