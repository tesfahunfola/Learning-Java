package com.pluralsight;

public class RecapExercise {
    public static void main(String[] args) {
        //🔹 Challenge A: Double Trouble
        //Create an double with any value you like.
        //Multiply it by 2.
        //Print both the original and the doubled value.
        //Example output:
        //
        //Original: 12.0
        //Doubled: 24.0

        double original =12 ;
        double doubled;

        doubled = original * 2;

        System.out.println(original);
        System.out.println(doubled);


        //🔹 Challenge B: Name + Number
        //Make a String with your name.
        //Make an int with your favorite number.
        //Print them in one sentence using concatenation.
        //Example output:
        //
        //My name is Maaike and my favorite number is 7

        String myName= "Tesfahun";
        int favoriteNum= 23;

        System.out.println("My name is " + myName+ " and my favorite number is "+ favoriteNum);

        //🔹 Challenge C: Random Surprise
        //Generate a random number between 0 and 10.
        //Print it.
        //Add 5 to it and print the new value.
        //Example output:
        //
        //Random number: 3
        //After adding 5: 8
        int randomNum;
        int newNum;

        randomNum = (int) Math.round(Math.random()*10);
        newNum = randomNum + 5;

        System.out.println(randomNum);
        System.out.println(newNum);



    }
}
