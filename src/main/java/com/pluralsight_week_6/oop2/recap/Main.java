package com.pluralsight_week_6.oop2.recap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Wand harry = new Wand("Tes", "villa", 3.3);
        Wizard beje = new Wizard("Mike","Hotel","88",harry);

        harry.yelem();
        beje.castSpell("mmm");

//        ArrayList<Wizard> wizards = new ArrayList<>();


//        wizards.add(new Wizard("William","Appart","88",harry));


//       Professor McGonagall = new Professor("McGonall","villa","7", harry,"Yelem");
//        McGonagall.teachSpell(" Expelliarmus");


//        for (Wizard w : wizards) {
//            System.out.println(w.getName() + " has a " + w.getWand().getWood() + " wand");
//
//        }

        List<Wizard> wizards = new ArrayList<>();
        wizards.add(new Professor("McGonagall", "Gryffindor", "4", harry, harry.getWood()));
        wizards.add(new DarkWizard("Voldemort", "Slytherin", "100", harry));
        wizards.add(new Wizard("Harry", "Gryffindor", "75", harry));

        System.out.println("++++++++++++");
        for (Wizard w : wizards) {
            w.castSpell("Tes");  // Each uses their own version!
            if (w instanceof Professor) {
                Professor p = (Professor) w;  // Cast it to access Professor-specific methods
                System.out.println("🧙‍🏫 Professor detected — teaches " + p.getSubject());
            } else if (w instanceof DarkWizard) {
                System.out.println("⚠️ Use caution! Dark wizard detected!");
                
            } else if (w instanceof Wizard) {
                System.out.println("Regular wizard encountered.");
                
            }
        }
        System.out.println("*************");



//        Wizard.welcomeMessage();
    }
}
