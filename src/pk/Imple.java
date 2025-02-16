package pk;

class Person extends Drive implements Human, Animal {
    // Implementing the method from Human interface
    public void Human() {
        System.out.println("This is a human.");
    }

    // Implementing the method from Animal interface
    public void animal() {
        System.out.println("This is an animal.");
    }

    // Implementing the abstract method from Drive class
    void car() {
        System.out.println("Driving a car.");
    }
}

