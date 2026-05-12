package Inheritence;

// Multilevel Inheritance Example in Java

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Puppy inherits Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Main {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        // Method from Animal class
        p.eat();

        // Method from Dog class
        p.bark();

        // Method from Puppy class
        p.weep();
    }
}
