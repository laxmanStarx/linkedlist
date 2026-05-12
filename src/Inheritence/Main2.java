package Inheritence;

// Multilevel Inheritance Example using Vehicle

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Car inherits Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// SportsCar inherits Car
class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car runs at high speed");
    }
}

public class Main2 {
    public static void main(String[] args) {

        SportsCar s = new SportsCar();

        // Method from Vehicle class
        s.start();

        // Method from Car class
        s.drive();

        // Method from SportsCar class
        s.speed();
    }
}