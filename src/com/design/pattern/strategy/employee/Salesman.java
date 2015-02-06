package com.design.pattern.strategy.employee;

public class Salesman extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getCommission();
    }
}
