package com.pluralsight_week_6.oop2.recap;

public class Professor extends Wizard{
    private String subject;

    public Professor(String name, String house, String powerLevel, Wand wand, String subject) {
        super(name, house, powerLevel, wand);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teachSpell(String spell){
        System.out.println("Professor "+ getName() + " teaches you"+ spell +" in Transfiguration class");
    }
}
