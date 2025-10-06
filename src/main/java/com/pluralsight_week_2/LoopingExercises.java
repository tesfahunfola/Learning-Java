package com.pluralsight_week_2;

import java.util.Scanner;

public class LoopingExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: \n");
        String fname = scanner.nextLine();

        System.out.print("Last name:  \n");
        String lname = scanner.nextLine();

        System.out.println("Fullname: "+fname+" "+lname);


    }
}
