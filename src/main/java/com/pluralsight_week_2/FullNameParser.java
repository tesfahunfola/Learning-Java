package com.pluralsight_week_2;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        String trimname= name.trim();

        String [] fullname = trimname.trim().split("\\s+");
        for (String splitName : fullname){
            System.out.println(splitName);
        }
    }
}
