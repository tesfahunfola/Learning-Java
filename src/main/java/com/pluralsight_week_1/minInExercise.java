package com.pluralsight_week_1;

import java.util.Scanner;

public class minInExercise {
    public static void main(String[] args) {

//Create a new class called InputExercise
//You are going to ask the user for the following details and store it in 3 variables:
//Favorite animal
//First tool that comes to mind
//Number of day of birth day
//You are going to print this in a silly sentence like:
//Your favorite animal is elephant, first tool that comes to mind is a saw and the 24 is the day you were born.
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your favorite animal? ");
        String favAnimal = myScanner.nextLine();
        System.out.println("First tool that comes to mind? ");
        String tool = myScanner.nextLine();
        System.out.println("Your birth date: ");
        int birthDate = myScanner.nextInt();

        System.out.printf("Your favorite animal is %s, first tool that comes to mind is a %s and the %d is the day you were born.",favAnimal, tool, birthDate);




    }
}
