package com.pluralsight_week_1;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Bob", "Smith "));
    }
    public static String formatName(String first, String last){
        return first + ','+last;
    }
}
