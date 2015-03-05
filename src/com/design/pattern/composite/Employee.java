package com.design.pattern.composite;

public interface Employee {

    public void add(Employee employee);

    public void remove(Employee employee);

    public Employee getChild(int i);

    public String getName();

    public int getSalary();

    public void print();
}
