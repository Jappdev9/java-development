
package com.pluralsight;

class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}

class Moped extends Vehicle {
}

class Car extends Vehicle {
}

class SemiTruck extends Vehicle {
}

class Hovercraft extends Vehicle {
}

// Part 2
public class Vehicles {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(4);

        SemiTruck deliveryTruck = new SemiTruck();
        deliveryTruck.setColor("White");
        deliveryTruck.setCargoCapacity(1000);

        Hovercraft amphibiousCraft = new Hovercraft();
        amphibiousCraft.setColor("Yellow");
        amphibiousCraft.setFuelCapacity(50);
    }
}
