package com.kainos.ea.employee_stuff;

public class SalesEmployee extends Employee {

    public float commissionRate;
    public int salesTotal;

    // constructor with super
    public SalesEmployee(short number, int salary, String name, boolean manager) {
        super(number, salary, name, manager);
    }

    public SalesEmployee() {

    }

    // getters and setters
    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = (float) (commissionRate * 0.95);
    }

    public int getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }

//    @Override
//    public String calcPau(){
//       return (super.calcPay() + commissionRate * salesTotal);
//}

    @Override
    public String toString() {
        return "SalesEmployee {" +
                "salary = " + salary +
                ", name = '" + name + '\'' +
                ", commissionRate = " + commissionRate +
                ", salesTotal = " + salesTotal +
                ", is Manager? = " + manager +
                '}';
    }
}
