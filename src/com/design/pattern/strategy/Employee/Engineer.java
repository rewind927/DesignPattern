package com.design.pattern.strategy.Employee;

public class Engineer extends EmployeeType {

    @Override
    public int payAmount(Employee employee) {
        return employee.getMonthSalary();
    }
}
