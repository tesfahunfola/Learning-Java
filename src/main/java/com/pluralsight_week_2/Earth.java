package com.pluralsight_week_2;

public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Tom",34, 89, "Blue");
        Human human2 = new Human("Tes", 45, 77, "Black");
        Human human3 = new Human("Fola", 34,72, "Brown");

        human1.speak();
        System.out.println("******************");
        human2.speak();
        System.out.println("******************");
        human3.speak();
    }
}
