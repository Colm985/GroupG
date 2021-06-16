package com.kainos.ea.employee_stuff;

public class Consultant implements Payable {

    private String name;
    private double dailyRate;
    private double daysWorked;

    // default constructor
    public Consultant() {

    }

    // constructor with arguments
    public Consultant(String name, double dailyRate, double daysWorked) {
        this.name = name;
        this.dailyRate = dailyRate;
        this.daysWorked = daysWorked;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(double daysWorked) {
        this.daysWorked = daysWorked;
    }

    // to string method
    @Override
    public String toString() {
        return "Consultant {" +
                "name = '" + name + '\'' +
                ", dailyRate = " + dailyRate +
                ", daysWorked = " + daysWorked +
                '}';
    }

    @Override
    public int netPay(Payable payee) {
        return (int) (getDailyRate() * getDaysWorked());
    }
}
