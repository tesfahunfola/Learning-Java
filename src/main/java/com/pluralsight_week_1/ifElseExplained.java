package com.pluralsight_week_1;

import java.util.Scanner;

public class ifElseExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?");
        int time = scanner.nextInt();


        if (time > 12){
            System.out.println("It's lunch time!");
        }else {
            System.out.println("It's not lunch time!");
        }

    }
}
