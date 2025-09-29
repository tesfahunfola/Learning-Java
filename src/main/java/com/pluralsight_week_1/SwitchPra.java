package com.pluralsight_week_1;

import java.util.Scanner;

public class SwitchPra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the month?");
        String sc=scanner.nextLine();
//        int numOfDay;

        switch (sc){
            case "Jan": case "Mar":case "May":case "Jul":case "Aug":case "Oct":case "Dec":
                System.out.println("numOfDay = 31");
                break;
            case "Apr":case "Jun":case "Sep":case "Nov":
                System.out.println("numOfDay = 30");
                break;
            case "Feb":
                System.out.println("numOfDay = 28");
                break;
            default:
                System.out.println("Invalid month "+ "'"+ sc + "'");
                break;
        }




    }
}
