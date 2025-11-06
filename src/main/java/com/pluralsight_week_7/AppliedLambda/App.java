package com.pluralsight_week_7.AppliedLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    static void main(String[] args) {
        List<Integer> test = Arrays.asList(1,2,3,4,5,6);

        IntFilter isEven = (number) -> number % 2 == 0;

        List<Integer> filtered = filterNumbers(isEven, test);
        System.out.println(filtered);

    }
    public static List<Integer> filterNumbers(IntFilter filter, List<Integer> numbers){

        List<Integer> result = new ArrayList<>();

        for (int num : numbers){
            if (filter.filter(num)){
                result.add(num);
            }
        }
        return result;
    }
}
