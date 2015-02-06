package com.design.pattern.strategy.employee;

public class Merchant extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.MERCHANT;
    }
}
