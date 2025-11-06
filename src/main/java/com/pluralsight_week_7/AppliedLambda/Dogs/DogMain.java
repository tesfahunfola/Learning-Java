package com.pluralsight_week_7.AppliedLambda.Dogs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DogMain {
    static void main(String[] args) {
        List<Dog> dogs1 = Arrays.asList(
                new Dog("leo",5, "Poodle"),
                new Dog("Buchu", 8, "Woody"),
                new Dog("Des", 2, "Labrador"));

        DogFilter olderThanFive = dog -> dog.getAge() > 5;
        DogFilter isLabrador = dog -> dog.getBreed().equalsIgnoreCase("Labrador");
        List<Dog> oldDogs = filterDogs(olderThanFive, dogs1);
        List<Dog> labradors = filterDogs(isLabrador, dogs1);

        // Step E: Print the results
        System.out.println("Dogs older than 5:");
        System.out.println(oldDogs);

        System.out.println("\nLabradors:");
        System.out.println(labradors);
    }
    public static List<Dog> filterDogs(DogFilter filter, List<Dog> dogs) {
        List<Dog> result = new ArrayList<>();

        for (Dog d : dogs) {
            if (filter.filter(d)) {
                result.add(d);
            }
        }
        return result;
    }
}

