package com.pluralsight_week_1;

import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        printWelcome();
        displayPlayerName("Chelsea and Hope");
        showLevel(11);
        Scanner scan = new Scanner(System.in);
        System.out.println("Who is attacker? ");
        String attackerPer = scan.nextLine();
        System.out.println("Who is target? ");
        String targetPer = scan.nextLine();
        System.out.println("Reason of attack: ");
        String reasonPer = scan.nextLine();
        attack(attackerPer, targetPer, reasonPer);
        String man = getPlayerTitle("'     __       __    __  ____    ____     __    __       ______  __    __   _______  __          _______. _______     ___      \n" +
                "'    |  |     |  |  |  | \\   \\  /   /    |  |  |  |     /      ||  |  |  | |   ____||  |        /       ||   ____|   /   \\     \n" +
                "'    |  |     |  |  |  |  \\   \\/   /     |  |  |  |    |  ,----'|  |__|  | |  |__   |  |       |   (----`|  |__     /  ^  \\    \n" +
                "'    |  |     |  |  |  |   \\      /      |  |  |  |    |  |     |   __   | |   __|  |  |        \\   \\    |   __|   /  /_\\  \\   \n" +
                "'    |  `----.|  `--'  |    \\    /       |  `--'  |    |  `----.|  |  |  | |  |____ |  `----.----)   |   |  |____ /  _____  \\  \n" +
                "'    |_______| \\______/      \\__/         \\______/      \\______||__|  |__| |_______||_______|_______/    |_______/__/     \\__\\ \n" +
                "'                                                                                                                              ");
        System.out.println(man);





    }
    public static void printWelcome(){
        System.out.println("Welcome my sweatheart to my Code Quest!");
    }
    public static void displayPlayerName(String playerName){
        System.out.printf("Player joined: %s \n",playerName);
    }
 //public static void showLevel(int level)
    //Write a static method that prints:
    //
    //"Level: [level]"
    //→ Call it twice with different levels.

    public static void showLevel(int level){
        System.out.println("Level: "+ level);
    }

    public static void attack(String attacker, String target, String reasonOfAttack){

        System.out.printf("%s attacks %s by %s", attacker, target, reasonOfAttack);
    }
    //. public static String getPlayerTitle(String name)
    //Return a string like:
    //"Lord " + name or "Princess " + name"
    //→ Call it in main() and print the result.
    public static String getPlayerTitle(String name){
        return name;
    }
}
