package com.driver;

public class F1 extends Car {

    // Constructor to initialize the F1 car
    public F1(String name, boolean isMoving) {
        super(name, isMoving);
    }

    // Method to accelerate the F1 car (positive or negative acceleration)
    public void accelerate(int speedIncrease) {
        if (isMoving) {
            if (speedIncrease > 0) {
                System.out.println(name + " accelerated by " + speedIncrease + " km/h.");
            } else if (speedIncrease < 0) {
                System.out.println(name + " decelerated by " + (-speedIncrease) + " km/h.");
            }
        } else {
            System.out.println(name + " is not moving, cannot accelerate.");
        }
    }

    // Overriding move to provide specific behavior for F1 cars
    @Override
    public void move(int speed, int direction) {
        if (speed > 0) {
            isMoving = true;
            System.out.println(name + " is racing at " + speed + " km/h in direction " + direction + " degrees.");
        } else {
            stop();
        }
    }
}
