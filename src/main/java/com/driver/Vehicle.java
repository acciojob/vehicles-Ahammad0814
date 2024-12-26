package com.driver;
package com.driver;

public class Vehicle {
    protected String name;
    protected boolean isMoving;

    // Constructor to initialize the vehicle name and moving state
    public Vehicle(String name, boolean isMoving) {
        this.name = name;
        this.isMoving = isMoving;
    }

    // Method to check if the vehicle is moving
    public boolean isMoving() {
        return isMoving;
    }

    // Method to stop the vehicle
    public void stop() {
        isMoving = false;
        System.out.println(name + " has stopped.");
    }

    // Method to display the vehicle's current status
    public void displayStatus() {
        if (isMoving) {
            System.out.println(name + " is moving.");
        } else {
            System.out.println(name + " is not moving.");
        }
    }
}
