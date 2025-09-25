package com.pluralsight_week_1;

public class FormatSpecifiers {
    public static void main(String[] args) {
        int age = 23;
        String name = "Tes";
        float score = 19.99f;

        System.out.printf("My name is %s and I am %d years old. I have %.2f score",name,age,score);
    }
}
