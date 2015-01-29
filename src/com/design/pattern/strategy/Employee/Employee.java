package com.design.pattern.strategy.Employee;

public class Employee {

    private EmployeeType employeeType;

    private int monthSalary = 28000;
    private int commission = 8000;
    private int bonus = 10000;

    public Employee(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
    //TODO Replace conditional with strategy pattern.
    public int payAmount() {
        switch (getType()) {
            case EmployeeType.ENGINEER:
                return monthSalary;
            case EmployeeType.MERCHANT:
                return monthSalary + bonus;
            case EmployeeType.SALESMAN:
                return monthSalary + commission;
            default:
                return monthSalary;
        }
    }

    public int getType() {
        return employeeType.getTypeCode();
    }
}
