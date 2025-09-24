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

        double original = 12 ;
        double doubled = original * 2;



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

//Take a number of hours (e.g. 27) and calculate what hour that would be on a 24-hour clock. Use % 24.
//
//Example:
//
//27 hours later → 3 o’clock
        int hours = 7;
        int hrIn24Clock = hours % 24;

        System.out.println("Hours: " + hours);
        System.out.println("Hour in 24hr clock: " + hrIn24Clock);


 //🔹 Bonus 2: Minutes to Hours and Minutes ⏳
        //Take a number of minutes (e.g. 130) and figure out how many full hours and leftover minutes that is.
        //
        //Hours = minutes / 60
        //Leftover = minutes % 60

        int minutes =130;
        int Hours = minutes / 60;
        int leftover = minutes % 60;


        System.out.println(minutes+" minutes = "+ Hours+ " hours and " + leftover + " minutes.");


//📝 Exercise: Time Calculator (No if statements)
//You are given a starting time and some extra minutes to add. Write a program that calculates the final time on a 24-hour clock.
//
//Step 1: Start

        int nrHours = 3;
        int nrMinutes = 59;
        int minutesToAdd = 183;

        int newHours;
        int leftOverMin;
        int newMinutes;

 //Step 2: Find the new hours
        newHours = nrHours + (minutesToAdd + nrMinutes)/ 60;
//Step 3: Find the leftover minutes
        leftOverMin = minutesToAdd % 60;

        newMinutes = (nrMinutes + leftOverMin)% 60;

 //Step 4: Print the final time
        //Finally, show the result as hours:minutes.
        //
        System.out.println("Final time: " + newHours + ":" + newMinutes);






    }
}
