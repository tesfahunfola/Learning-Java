package com.pluralsight_week_1;

public class CompareNumbers {
    public static void main(String[] args) {
    boolean x = isEven(14);
        System.out.println(x);
    boolean y = isPositive(95.0);
        System.out.println(y);

    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isPositive(double number){
        return number > 0;
    }
}
