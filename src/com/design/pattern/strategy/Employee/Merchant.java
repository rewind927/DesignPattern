package com.design.pattern.strategy.Employee;

public class Merchant extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.MERCHANT;
    }
}
