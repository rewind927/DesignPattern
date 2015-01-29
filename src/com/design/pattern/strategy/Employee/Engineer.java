package com.design.pattern.strategy.Employee;

public class Engineer extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
