package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private int salary;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("--------------------------");
        System.out.println("Name   : " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("--------------------------");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
