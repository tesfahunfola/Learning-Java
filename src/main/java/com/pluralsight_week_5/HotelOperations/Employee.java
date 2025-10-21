package com.pluralsight_week_5.HotelOperations;

import java.time.LocalTime;

public class Employee {

    private Long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(Long employeeId, String name, String department, double payRate, double hoursWorked, double startTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }


    public double getTotalPay(){

        return hoursWorked * payRate;

    }
    public double getRegularHours(){

        if (hoursWorked < 40){
            return hoursWorked;
        }else {
            return 40;
        }

    }
    public double getOvertimeHours(){

        if (hoursWorked > 40){
            return hoursWorked -40;
        }else {
            return 0;
        }

    }

    public void punchIn(double time){
        startTime = time;
    }
    public void punchOut(double time){
        hoursWorked += (time- startTime);
    }
    public void punchIn(){
        startTime = getTimeAsDouble();
    }
    public void punchOut(){

        hoursWorked += (getTimeAsDouble() -startTime);
    }
    public double getTimeAsDouble(){
        LocalTime lt  = LocalTime.now();
        double hours = lt.getHour();
        double minutes = lt.getMinute();

        return hours + minutes;
    }
}
