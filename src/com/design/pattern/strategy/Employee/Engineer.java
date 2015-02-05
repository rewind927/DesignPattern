package com.design.pattern.strategy.employee;

public class Engineer extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary();
    }
}
