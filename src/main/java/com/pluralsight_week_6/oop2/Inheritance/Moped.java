package com.pluralsight_week_6.oop2.Inheritance;

public class Moped extends Vehicle{
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped() {
        super();
    }

    static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Blue");
        slowRide.getFuelCapacity(5);

        System.out.println(slowRide.getColor());
    }


}
