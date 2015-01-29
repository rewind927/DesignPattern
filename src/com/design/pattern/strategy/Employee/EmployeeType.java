package com.design.pattern.strategy.Employee;

public abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MERCHANT = 2;

    public abstract int getTypeCode();
}
