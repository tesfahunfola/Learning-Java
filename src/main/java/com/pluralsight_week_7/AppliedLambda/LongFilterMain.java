package com.pluralsight_week_7.AppliedLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongFilterMain {
    public static void main(String[] args) {

        List<String> longWord = Arrays.asList("java", "lambdas", "awesome", "fun");
        StringFilter charStr = text -> text.length() > 5;

        List<String> filtered = filterWords(charStr, longWord);
        System.out.println(filtered);

    }
    public static List<String> filterWords(StringFilter filter, List<String> words){
        List<String> result = new ArrayList<>();

        for (String word : words){
            if (filter.filter(word)){
                result.add(word);
            }
        }
        return result;
    }
}
