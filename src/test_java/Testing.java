package test_java;

class Animal2 {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class



class Dogw extends Animal2 {
    public void bark() {
        System.out.println("The dog barks.");
    }
}


class Monkey extends Animal2 {
    public void jump() {
        System.out.println("Monkey is jumping");
    }
}
