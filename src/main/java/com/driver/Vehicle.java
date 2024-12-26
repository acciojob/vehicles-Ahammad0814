package com.driver;
// Vehicle.java
public class Vehicle {
    protected String name;
    protected int capacity;

    // Constructor to initialize name and capacity
    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter for vehicle name
    public String getVehicleName() {
        return name;
    }

    // Getter for vehicle capacity
    public int getVehicleCapacity() {
        return capacity;
    }

    // Method to display basic vehicle info
    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Capacity: " + capacity);
    }
}


