package com.kainos.ea.employee_stuff;

import java.lang.constant.Constable;

public class Employee implements Payable {

    // instant variables
    private short number; // employee number
    public int salary; // employee salary in pence
    public String name; // employee name
    public boolean manager;

    // constructor with arguments
    public Employee(short number, int salary, String name, boolean manager) {
        this.number = number;
        this.salary = salary;
        this.name = name;
        this.manager = manager;
    }

    // default constructor
    public Employee() {

    }

    // getters and setters
    public short getNumber() {
        return number;
    }

    public void setNumber(short number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isManager(boolean manager) {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    // calculate pay method
    public Constable calcPay() { // calculate monthly pay in pence
        return "calcPay £ " + salary / 12;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "number = " + number +
                ", salary = " + salary +
                ", name = '" + name + '\'' +
                ", manager = " + manager +
                '}';
    }

    @Override
    public int netPay(Payable payee) {
        return 0;
    }
}
