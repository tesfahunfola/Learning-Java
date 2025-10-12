package com.pluralsight_week_2;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

public class practice {
    public static void main(String[] args) throws IOException {
        practice2();
        practice1();



    }
    public static void practice1(){
        try {
            FileReader file = new FileReader("src/main/java/com/pluralsight_week_2/Due_dates");
            BufferedReader bufferedReader = new BufferedReader(file);
            bufferedReader.readLine();
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
    public static void practice2(){

    }
}
