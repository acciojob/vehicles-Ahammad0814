package com.driver;

public class Car extends Vehicle {

    // Constructor to initialize the car with name and initial moving state
    public Car(String name, boolean isMoving) {
        super(name, isMoving);
    }

    // Method for moving the car
    public void move(int speed, int direction) {
        if (speed > 0) {
            isMoving = true;
            System.out.println(name + " is moving at " + speed + " km/h in direction " + direction + " degrees.");
        } else {
            stop();
        }
    }
}
