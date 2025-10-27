package com.pluralsight_week_6.oop2;

public class House {
    static String latinName = "domus";
    String color;
    int numberOfRooms;
    boolean hasGarden;
    double sizeInSquareMeters;

    public void openDoor() {
        System.out.println("Opening the door of a " + color + " house with " + numberOfRooms + " rooms.");
    }
    public void paint(){
        System.out.println("Painting the house with " + color + " "+"color.");
    }
}
