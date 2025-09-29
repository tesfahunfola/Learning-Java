package com.pluralsight_week_1;

import java.util.Scanner;

public class MethodExeriseII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hat do you want to do (1-add, 2- subtract) ?");
        int num = scanner.nextInt();



        if (num ==1){
            System.out.println("1. Add");
            doAdd();
        }else if(num == 2 ){
            System.out.println("Your choice is 2: subtract");
            doSubtract();
        }else{
            System.out.println("Invalid input: "+num);
        }



    }

    public static void doAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second num: ");
        double num2 = scanner.nextDouble();

        double sum= num1 + num2;
        System.out.println(sum);

    }
    public static void doSubtract(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second num: ");
        double num2 = scanner.nextDouble();
        double subtract = num1 - num2;
        System.out.printf("Subtract %f - %f is %f",num1, num2, subtract);
    }

}
