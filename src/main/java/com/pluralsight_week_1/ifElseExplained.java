package com.pluralsight_week_1;

import java.util.Scanner;

public class ifElseExplained {
    public static void main(String[] args) {

//Positive number Write a program that checks if a number is greater than 0. 👉 If yes, print "Positive number", otherwise "Not positive".

      Scanner myNum = new Scanner(System.in);

        System.out.println("Put the number: ");
        int num = myNum.nextInt();

        if (num > 0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Not positive Number");
        }

//Even or odd Given an integer, check if it’s even or odd. 👉 Print "Even" if divisible by 2, otherwise "Odd".
       Scanner newNum = new Scanner(System.in);

        System.out.println("Put the number: ");
        int evenOdd = newNum.nextInt();

        if (evenOdd%2 ==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd num");
        }

//Divisible by 3 and 5 Given a number, check if it is divisible by both 3 and 5. 👉 Print "Divisible by 3 and 5" or "Not divisible by 3 and 5".

      /*    Scanner newNum = new Scanner(System.in);

      System.out.println("Put the number: ");
        int num = newNum.nextInt();
        if (num % 3==0 && num % 5 == 0){
            System.out.println("Divisible by 3 and 5");
        }else{
            System.out.println("Not divisible by 3 and 5");
        } /*

    Safe speed Given a speed, check if it is below 30 or above 100. 👉 If true, print "Unsafe speed", otherwise "Safe speed".
       */
       /* Scanner newNum = new Scanner(System.in);
        System.out.println("Put the speed: ");
            int speed = newNum.nextInt();

            if (speed <30 || speed > 100){
                System.out.println("Unsafe speed");
            }else{
                System.out.println("Safe Speed");
            }*/
//Leap year (simple version) Given a year, check if it is divisible by 4 and not divisible by 100. 👉 Print "Leap year" or "Not leap year". (We’ll ignore the full leap-year rules for now.)
       Scanner test = new Scanner(System.in);
        System.out.println("Give me the year: ");
        int yearNum = test.nextInt();

        if (yearNum % 4 == 0 && yearNum % 100 != 0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
//Which number is bigger? Given two numbers a and b, print which one is bigger. 👉 Print "a is bigger" or "b is bigger".
        Scanner myNum2 = new Scanner(System.in);
        System.out.println("Enter your number a: ");
        int num1 = myNum2.nextInt();
        System.out.println("Enter your number b: ");
        int num2 = myNum.nextInt();

        if (num1 > num2){
            System.out.println("a is bigger");
        }else {
            System.out.println("b is bigger");
        }
//Pass or fail Given a score, check if it is at least 50. 👉 Print "Pass" or "Fail".
        Scanner myscore = new Scanner(System.in);
        System.out.println("Enter your score please: ");
        double score = myscore.nextDouble();

        if (score >= 50){
            System.out.println("Congrats! You passed!");
        }else{
            System.out.println("Sorry, you failed!");
        }

    }
}
