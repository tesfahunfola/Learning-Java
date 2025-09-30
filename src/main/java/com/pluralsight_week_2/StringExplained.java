package com.pluralsight_week_2;

public class StringExplained {
    public static void main(String[] args) {
       String text = "   Blala    la";
               text = text.trim();
        System.out.println(text);
        System.out.println(text);
        if (text.endsWith("la")){
            System.out.println(true);
        }
        System.out.println(text);
    }
}
