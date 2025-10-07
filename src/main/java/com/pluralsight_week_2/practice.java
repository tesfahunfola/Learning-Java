package com.pluralsight_week_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("HighScoreWins.java");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String input = scanner.nextLine();
            System.out.println(input);
        }
        scanner.close();


    }
}
