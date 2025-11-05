package com.pluralsight_week_7;

public class Exercise1 {

        public static void main(String[] args) {

//            Exercise1
            Hello hello = () -> System.out.println("Hello World!");
            hello.sayHello();

            Hello hello1 = () -> System.out.println("Hi java");
            hello1.sayHello();

//            exercise2
            Greeter greeter = name -> System.out.println("Hi " + name +"!"+ "Have a great day!");
            greeter.greet("Tees");

//            exercise3
            Calculator add = (a, b) -> a + b;
            System.out.println(add.add(5, 3));

            Calculator add1 = (a, b) -> a - b;
            System.out.println(add1.add(5, 3));

//            Exercise 5
            SquareCalculator sq1 = x -> {
                System.out.print("Calculating square...: ");
                return x *x;
            };
            int num = sq1.square(7);
            System.out.println(num);

//                    Exercise 6
            RandomPrinter randomPrinter = () -> System.out.println((Math.round(Math.random() * 10)));
            randomPrinter.printRandom();
        }
}
