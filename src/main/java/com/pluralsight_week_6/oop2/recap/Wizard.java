package com.pluralsight_week_6.oop2.recap;

public class Wizard {

    private String name;
    private String house;
    private String powerLevel;
    static String school = "Hogwarts";
    private Wand wand;

    public Wizard(String name, String house, String powerLevel, Wand wand) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
        this.wand = wand;
    }


    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(String powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void castSpell(String spell){

        System.out.println(name + " from " + house+ " casts " + spell);
    }

    static void welcomeMessage(){
        System.out.println("Welcome to " + school + "!");
    }


}


