package com.pluralsight_week_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String customer = name();
        int ticket = ticketNum();
//        System.out.println(customer);
//        System.out.println(ticket);
        LocalDate resyDate = date();
        String PrintTicket = (ticket == 1) ? "ticket" : "tickets";

//        System.out.println(resyDate);

        System.out.printf(" %d %s reserved for %s under %s%n",ticket,PrintTicket, resyDate.toString(), customer);
    }
    public static String name(){
        System.out.print("Please enter your name: ");
        String nameUSer= scanner.nextLine().trim();
        String[] parts = nameUSer.split("\\s+");
        String first = parts[0];
        String last = parts[parts.length-1];
        return last + ","+ first;

    }
    public static LocalDate date(){
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateFormat = scanner.nextLine().trim();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.parse(dateFormat, formatter);
    }
    public static int ticketNum(){
        System.out.print("How many tickets would you like? ");
        String ticketNumUser= scanner.nextLine().trim();
        return Integer.parseInt(ticketNumUser);

    }


}
