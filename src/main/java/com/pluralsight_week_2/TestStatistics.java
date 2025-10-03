package com.pluralsight_week_2;


import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int [] students = {98, 55, 67, 98, 66, 77, 12, 44, 89, 45};

        int sum = 0;

        for (int score : students){
            sum += score;

        }
//        System.out.println(sum);
        double average = (double) sum / students.length;


        System.out.println("Average:" + average);

        int high = students[0];
        int low = students[0];
        for (int score : students) {
            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }
        System.out.println("High: "+high);
        System.out.println("Low: "+ low);

        Arrays.sort(students);
        double median;

        if (students.length % 2 == 0){
            median = (students[(students.length/2 -1)]+students[students.length/2])/2;
        }else {
            median = students[students.length/2];
        }
        System.out.println("Median:"+median);
    }
}
