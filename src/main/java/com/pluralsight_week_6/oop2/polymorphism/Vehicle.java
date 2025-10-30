package com.pluralsight_week_6.oop2.polymorphism;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String date, double originalCost, String makeModel, int year, int odometer) {
        super(description, date, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        int currentYear = LocalDate.now().getYear();
        int ageCar = currentYear - year;
        double valueCar = getOriginalCost();
        if (ageCar <= 3){
            valueCar = valueCar - getOriginalCost() * 0.03 * ageCar;
        } else if (ageCar <= 6) {
            valueCar = valueCar - getOriginalCost() * 0.06 * ageCar;
        } else if (year <= 10) {
            valueCar = valueCar - getOriginalCost() * 0.08 * ageCar;
            
        } else if (ageCar > 10) {
            valueCar = 100_000;

        }
        if (odometer > 100_000 && !(makeModel.toLowerCase().contains("honda") && !(makeModel.toLowerCase().contains("toyota")))){

            valueCar *= 0.75;
        }

        return valueCar;
    }
}
