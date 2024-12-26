package com.driver;
public class F1 extends Car {

    // Constructor
    public F1(String name, int capacity) {
        super(name, capacity);
    }

    // F1-specific method (optional)
    public void displayF1Info() {
        System.out.println("F1 Car: " + name + ", Capacity: " + capacity);
    }
}
