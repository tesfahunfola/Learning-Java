package com.pluralsight_week_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String gamescore = scanner.nextLine();
        System.out.println(gamescore);
//        String gamescore = "Home:Visitor|21:9";

        String[] tokens = gamescore.split(":|\\|");


        String home = tokens[0];
        String away = tokens[1];
        int homeScore = Integer.parseInt(tokens[2]);
        int visitorScore = Integer.parseInt(tokens[3]);

        if (homeScore > visitorScore){
            System.out.println("Winner :"+home);
        }else {
            System.out.println("Winner: "+away);
        }

    }
}
