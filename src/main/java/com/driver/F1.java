package com.driver;

public class F1 extends Car {
    public F1(String name, int doors, int gears, int wheels, boolean isManual, int seats) {
        super(name, doors, gears, wheels, isManual, seats);
    }

    // Overriding the move method for F1-specific movement
    @Override
    public void move(int speed, int direction) {
        if (speed > 0) {
            isMoving = true;
            currentSpeed = speed;
            currentDirection = direction;
            System.out.println(name + " is racing at " + speed + " km/h in direction " + direction + " degrees.");
        } else {
            stop();
        }
    }

    // Accelerate method specific for F1
    public void accelerate(int speedIncrease) {
        if (isMoving) {
            currentSpeed += speedIncrease;
            System.out.println(name + " accelerated to " + currentSpeed + " km/h.");
        } else {
            System.out.println(name + " is not moving, cannot accelerate.");
        }
    }
}
