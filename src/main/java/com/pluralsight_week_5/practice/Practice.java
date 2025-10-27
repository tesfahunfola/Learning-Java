package com.pluralsight_week_5.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("Enter some non-zero interger. Enter 0 to end: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 0)
                break;
            list.add(number);
        }
//        System.out.println("You number: "+list);
        for (int i = list.size()-1; i >= 0; i--){
            System.out.printf("%10d%n", list.get(i));
        }

    }
}
