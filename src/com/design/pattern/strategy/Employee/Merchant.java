package com.design.pattern.strategy.Employee;

public class Merchant extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getBonus();
    }
}
