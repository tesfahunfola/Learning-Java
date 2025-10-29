package com.pluralsight_week_6.oop2.Inheritance.polymorphism;

public class Asset {

    private String description;
    private String date;
    private double originalCost;


    public Asset(String description, String date, double originalCost) {
        this.description = description;
        this.date = date;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public double getValue(){

        return 0;
    }
}

