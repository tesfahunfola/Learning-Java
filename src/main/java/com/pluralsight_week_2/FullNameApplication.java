package com.pluralsight_week_2;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");

        String middleName = scanner.nextLine();
        char middleIntial = ' ';
                if (!middleName.isEmpty()){
                    middleIntial = middleName.charAt(0);
                }


        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your suffix: ");
        String suffix = scanner.nextLine();
        String noSuffix = " ";
            if (!suffix.isEmpty()){
                noSuffix = suffix;
            }

        if (middleIntial != ' ' && noSuffix != " "){
            System.out.printf("Full name: %s %s. %s, %s",firstName, middleIntial, lastName, suffix);
        }else if (noSuffix != " "){
            System.out.printf("Full name: %s %s, %s",firstName, lastName, suffix);
        } else if (middleIntial != ' ') {
            System.out.printf("Full name: %s %s. %s",firstName, middleIntial, lastName);
        } else {
            System.out.printf("Full name: %s %s", firstName, lastName);
        }

    }
}
