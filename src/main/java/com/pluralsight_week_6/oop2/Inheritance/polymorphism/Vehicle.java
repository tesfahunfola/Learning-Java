package com.pluralsight_week_6.oop2.Inheritance.polymorphism;

public class Vehicle extends Asset {
   private String address;
   private int condition;
   private  int squareFoot;
   private int lotSize;

    public Vehicle(String description, String date, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, date, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {
        return super.getValue();
    }
}
