package com.design.pattern.strategy.employee;

public class Salesman extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
