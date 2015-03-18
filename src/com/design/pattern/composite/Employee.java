package com.design.pattern.composite;

public interface Employee {

    public String getName();

    public String getTitle();

    public void add(Employee employee);

    public void remove(Employee employee);

    public Employee getChild(int i);

    public void print();
}
