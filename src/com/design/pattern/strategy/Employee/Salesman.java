package com.design.pattern.strategy.Employee;

public class Salesman extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getCommission();
    }
}
