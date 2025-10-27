package com.pluralsight_week_6.oop2;

public class Car {
    static String latinName = "autocinetum";
    String brand;
    String color;
    int year;
    boolean isElectric;

    public void startEngine() {
        System.out.println("Starting the " + (isElectric ? "silent electric" : "rumbling") + " engine of the " + color + " " + brand + " "+ year + ".");
    }
    public void honk(){
        System.out.println("Honking the car "+ brand);
    }
}
