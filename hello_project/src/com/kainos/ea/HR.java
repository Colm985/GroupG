package com.kainos.ea;
import com.kainos.ea.employee_stuff.Consultant;
import com.kainos.ea.employee_stuff.Employee;
import com.kainos.ea.employee_stuff.PayrollSystem;
import com.kainos.ea.employee_stuff.SalesEmployee;

public class HR {

    public static void main(String[] args) {

        //johnE.setNumber("Hello!");
        //System.out.println(1/0);

        try {
            Class eClass = Class.forName("com.kainos.ea.employee_stuff.Employee");
            //Employee emp1 = (Employee) eClass.getDeclaredConstructor().newInstance();

            Employee johnE = new Employee();
            johnE.setName("John Smith");
            johnE.setSalary(18200_00);
            johnE.setNumber((short) 815);

            System.out.println("\n" + johnE.toString() + " " + johnE.calcPay());

            SalesEmployee johnS = new SalesEmployee();
            johnS.setCommissionRate((float) 1.4);
            johnS.setSalesTotal(2450);

            System.out.println(johnS.toString());

            SalesEmployee semp1 = new SalesEmployee();
            semp1.setSalary(15000);
            semp1.setCommissionRate(2);
            semp1.setSalesTotal(50);
            semp1.setName("O'Kane, Colm");
            semp1.setManager(true);

            System.out.println(semp1.toString());

            SalesEmployee semp2 = new SalesEmployee();
            semp2.setSalary(25000);
            semp2.setCommissionRate(2);
            semp2.setSalesTotal(49);
            semp2.setName("Kane, Colin");
            semp2.setManager(false);

            if (semp2.getSalesTotal() > 50) {
                System.out.println(semp2.toString());
            } else if (semp2.getSalesTotal() < 50) {
                System.out.println("Not good enough...");
            }

            Consultant con1 = new Consultant();
            con1.setName("Dan Craig");
            con1.setDailyRate(100.0);
            con1.setDaysWorked(4);

            System.out.println(con1.toString());

        } catch (ClassNotFoundException e1){
            System.err.println("Class not found: " + e1.getMessage());

        }

    }

}
