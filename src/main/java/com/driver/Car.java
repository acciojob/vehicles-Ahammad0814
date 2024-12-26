package com.driver;

public class Car extends Vehicle {
    protected int doors;
    protected int gears;
    protected int wheels;
    protected boolean isManual;
    protected int seats;
    protected int currentGear;

    // Constructor with additional car-specific attributes
    public Car(String name, int doors, int gears, int wheels, boolean isManual, int seats) {
        super(name);
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.seats = seats;
        this.currentGear = 0;
    }

    // Getter methods for car-specific attributes
    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    // Change the car's gear
    public void changeGear(int gear) {
        if (gear <= gears && gear >= 0) {
            currentGear = gear;
            System.out.println(name + " changed to gear " + gear);
        }
    }

    // Change the car's speed
    public void changeSpeed(int speed) {
        if (speed > 0) {
            currentSpeed = speed;
            System.out.println(name + " is moving at " + speed + " km/h.");
        } else {
            stop();
        }
    }

    // Method to steer the car
    public void steer(int direction) {
        currentDirection = direction;
        System.out.println(name + " is steering at " + direction + " degrees.");
    }
}
