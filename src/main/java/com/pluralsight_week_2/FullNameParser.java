package com.pluralsight_week_2;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullNameParser2 = scanner.nextLine();
        fullNameParser2(fullNameParser2);
    } public static void fullNameParser2(String name) {
        name = name.trim();

        // variables for name parts
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        // splitting the name and store in an array
        String[] arrFullName = name.split("\\s+");

        // check the length of the array
        // if length equal to 3, populate all the fields
        // else if length equal to 2, populate first name and last name
        // else invalid input

        if(arrFullName.length  == 3) {
            firstName = arrFullName[0];
            middleName = arrFullName[1];
            lastName = arrFullName[2];
        } else if(arrFullName.length  == 2) {
            firstName = arrFullName[0];
            lastName = arrFullName[1];
        } else {
            System.out.println("Invalid name format!");
            return;
        }

        // print the name
        printName(firstName, middleName, lastName);

    }

    public static void printName(String firstName, String middleName, String lastName) {
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}

