package com.pluralsight_week_2;

public class Human {
    String name;
    int age;
    int heightInInchises;
    String eyeColor;

    public Human(String name, int age, int heightInInchises, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInchises = heightInInchises;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is "+ name);
        System.out.println("I am "+age+" years old");
        System.out.println("I am " + heightInInchises + " inches tall.");
        System.out.println("My eye color is "+ eyeColor);

    }
    public void eat(){
        System.out.println("I am eating....");
    }
    public void walk(){
        System.out.println("walking......");
    }
    public void work(){
        System.out.println("working...");
    }
}
