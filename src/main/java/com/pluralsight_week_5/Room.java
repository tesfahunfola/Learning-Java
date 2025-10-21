package com.pluralsight_week_5;

import java.util.Scanner;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOcuupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean isOcuupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOcuupied = isOcuupied;
        this.isDirty = isDirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOcuupied() {
        return isOcuupied;
    }

    public void setOcuupied(boolean ocuupied) {
        isOcuupied = ocuupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        if (!isOcuupied && !isDirty){
            return true;
        }
        {
            return false;
        }
    }
}
