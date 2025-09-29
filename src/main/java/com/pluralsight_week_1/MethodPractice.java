package com.pluralsight_week_1;

import java.text.Format;

public class MethodPractice {
    public static void main(String[] args) {
        sayHello();
        sayGoodMorning();
        sayGoodbye();
        displayMenu();
        displayMenu();
        System.out.println(CompareNumbers.isPositive(16));
    }
    public  static void sayHello(){
        System.out.println("Hello, world!");

    }
    public  static void sayGoodbye(){
        System.out.println("Good Bye");

    }
    public  static void sayGoodMorning(){
        System.out.println("Good morning");
    }
    public  static void displayMenu(){
       ;
        System.out.println("""
                === MENU ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                """);

    }
}
