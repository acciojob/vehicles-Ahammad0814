package com.driver;
public class Car extends Vehicle {

    // Constructor
    public Car(String name, int capacity) {
        super(name, capacity);
    }

    // Car-specific method (optional)
    public void displayCarInfo() {
        System.out.println("Car: " + name + ", Capacity: " + capacity);
    }
}
