package com.pluralsight_week_6.oop2.recap;

public class DarkWizard extends Wizard{
    public DarkWizard(String name, String house, String powerLevel, Wand wand) {
        super(name, house, powerLevel, wand);
    }

    @Override
    public void castSpell(String spell) {
        System.out.println(getName() + " from " + getHouse() +
                " growls menacingly and casts the forbidden spell: " + spell + "!");
    }

    public void summonDarkForces() {
        System.out.println(getName() + " whispers to the shadows... Dark forces awaken!");
    }
}
