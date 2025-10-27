package com.pluralsight_week_6.oop2;

public class App {
    static void main(String[] args) {
        House appartment = new House();
        House villa = new House();

        appartment.color = "blue";
        appartment.numberOfRooms = 12;
        appartment.hasGarden = true;
        appartment.sizeInSquareMeters = 120.88;

        appartment.openDoor();
        appartment.paint();


        villa.color = "white";



        villa.openDoor();


        Car car1 = new Car();
        Car car2 = new Car();

        car2.brand = "tesla";
        car1.color = "grey";
        car1.year = 2010;
        car1.brand = "toyota";
        car1.isElectric = false;


        car1.startEngine();
//        car2.startEngine();
        car1.honk();


    }

}
