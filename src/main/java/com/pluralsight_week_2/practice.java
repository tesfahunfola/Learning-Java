package com.pluralsight_week_2;

import java.io.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) throws IOException {

        try {
            FileReader file = new FileReader("src/main/java/com/pluralsight_week_2/Due_dates");
//        Scanner scanner = new Scanner(file);
            BufferedReader bufferedReader = new BufferedReader(file);
//            bufferedReader.readLine();
            String input = "";
            while ((input = bufferedReader.readLine())!=null){
//                String input = scanner.nextLine();
                System.out.println(input);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("No file");
        }



    }
}
