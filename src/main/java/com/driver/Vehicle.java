package com.driver;

public class Vehicle {
    protected String name;
    protected boolean isMoving;
    protected int currentSpeed;
    protected int currentDirection;

    // Constructor with name and moving state
    public Vehicle(String name) {
        this.name = name;
        this.isMoving = false;  // Vehicles are initially not moving
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    // Getter methods for name, speed, and direction
    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    // Method to stop the vehicle
    public void stop() {
        isMoving = false;
        currentSpeed = 0;
        System.out.println(name + " has stopped.");
    }

    // Method to move the vehicle
    public void move(int speed, int direction) {
        if (speed > 0) {
            isMoving = true;
            currentSpeed = speed;
            currentDirection = direction;
            System.out.println(name + " is moving at " + speed + " km/h in direction " + direction + " degrees.");
        } else {
            stop();
        }
    }

    // Method to check if the vehicle is moving
    public boolean isMoving() {
        return isMoving;
    }
}
