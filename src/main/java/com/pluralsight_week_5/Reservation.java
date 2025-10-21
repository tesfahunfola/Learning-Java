package com.pluralsight_week_5;

public class Reservation {
    private String RoomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double reservationTotal) {
        RoomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public double getPrice(){
        double basePrice = 124.0;
        if (RoomType.equalsIgnoreCase("king")){
            basePrice = 139;
        }
        if (isWeekend){
            basePrice *= 1.1;
        }
        return basePrice;
    }
}
