package com.design.pattern.composite;

public class Developer implements Employee {
    private String name;
    private int salary;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void add(Employee employee) {
    }

    public void remove(Employee employee) {
    }

    public Employee getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void print() {
        System.out.println("--------------------------");
        System.out.println("Name  : " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("--------------------------");
    }
}