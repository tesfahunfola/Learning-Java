package com.pluralsight_week_2;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        System.out.println("What is the serial number?");
        cellPhone1.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What is the model of the phone?");
        cellPhone1.setModel(scanner.nextLine());
        System.out.println("Who's the carrier?");
        cellPhone1.setCarrier(scanner.nextLine());
        System.out.println("What is the phone nr?");
        cellPhone1.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        cellPhone1.setOwner(scanner.nextLine());



        CellPhone cellPhone2 = new CellPhone();

        System.out.println("What is the serial number?");
        cellPhone2.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What is the model of the phone?");
        cellPhone2.setModel(scanner.nextLine());
        System.out.println("Who's the carrier?");
        cellPhone2.setCarrier(scanner.nextLine());
        System.out.println("What is the phone nr?");
        cellPhone2.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        cellPhone2.setOwner(scanner.nextLine());

display(cellPhone1);
display(cellPhone2);


        }
    public static void display(CellPhone phone) {
        System.out.println("\n--- Phone Information ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }



}
