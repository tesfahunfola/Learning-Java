package com.pluralsight_week_6.oop2.recap;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Wand harry = new Wand("Tes", "villa", 3.3);
        Wizard beje = new Wizard("Mike","Hotel","88",harry);

        harry.yelem();
        beje.castSpell("mmm");

        ArrayList<Wizard> wizards = new ArrayList<>();


        wizards.add(new Wizard("William","Appart","88",harry));



        for (Wizard w : wizards) {
            System.out.println(w.getName() + " has a " + w.getWand().getWood() + " wand");

        }


        Wizard.welcomeMessage();
    }
}
