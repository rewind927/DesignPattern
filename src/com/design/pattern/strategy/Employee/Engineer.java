package com.design.pattern.strategy.employee;

public class Engineer extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
