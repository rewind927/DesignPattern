package com.design.pattern.strategy.employee;

public class Employee {

    private EmployeeType employeeType;

    private int monthSalary = 28000;
    private int commission = 8000;
    private int bonus = 10000;

    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public int payAmount() {
        return employeeType.payAmount(this);
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
