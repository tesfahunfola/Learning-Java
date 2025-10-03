package com.pluralsight_week_2;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (in ISO format: yyyy-MM-dd): ");
        String input = scanner.nextLine();
        LocalDate date = LocalDate.parse(input);

        System.out.println("""
    How would you like to display? 
    1 - dd MMMM yyyy (e.g. 17 April 2025)
    2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)
    3 - MM/dd/yyyy (e.g. 04/17/2025)
    
    """);
//String formatChoice = scanner.nextLine()
//        if (Fo == 1)
    }


}
