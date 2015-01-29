package com.design.pattern.strategy.Employee;

public class Salesman extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
