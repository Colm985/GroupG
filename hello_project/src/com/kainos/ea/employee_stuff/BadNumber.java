package com.kainos.ea.employee_stuff;

public class BadNumber {

    private static final int MIN_SALARY = 0;
    private int salary;

    public void setSalary(int salary) throws SalaryTooLowException {

        if (salary >= MIN_SALARY) {
            this.salary = salary;
        } else {
            throw new SalaryTooLowException(
                    String.format("Salary £%,.2f is below the minimum salary £%,.2f.",
                            salary/100.0, MIN_SALARY/100.0));

        }

    }

}
