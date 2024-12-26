package com.driver;

public class Vehicle {
    protected String name;
    protected int capacity;

    // Constructor
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

    // A generic method to display vehicle info
    public void displayInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Vehicle Capacity: " + capacity);
    }
}

