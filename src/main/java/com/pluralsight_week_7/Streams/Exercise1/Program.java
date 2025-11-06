package com.pluralsight_week_7.Streams.Exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Tesfahun","Fola",23));
        people.add(new Person("Bryce", "Sherman", 27));
        people.add(new Person("Nikki", "Fowler", 41));
        people.add(new Person("Greta", "Russell", 29));
        people.add(new Person("Ida", "Bush", 52));
        people.add(new Person("Andrea", "Lucas", 45));
        people.add(new Person("Kelli", "Chan", 33));
        people.add(new Person("Eugenia", "Miranda", 38));
        people.add(new Person("Alyssa", "Wade", 24));
        people.add(new Person("Nita", "Mora", 49));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first or last name: ");
        String searchName = scanner.nextLine().toLowerCase().trim();

        List<Person> matchedPeople = new ArrayList<>();

        for (Person name : people){
            if (name.getFirstName().toLowerCase().contains(searchName) || name.getLastName().toLowerCase().contains(searchName)){
                matchedPeople.add(name);
            }

        }
        if (matchedPeople.isEmpty()){
            System.out.println("No name found");
        }else {
            System.out.println("Matched people: ");
            for (Person name : matchedPeople){
                System.out.println(name);
            }
        }
    }
}
