package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private String title;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String title) {
        this.name = name;
        this.title = title;
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
    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println(CompositeClient.g_indent + "Name : " + getName());
        System.out.println(CompositeClient.g_indent + "Title: " + getTitle());
        System.out.println("---------------------------");

        for (Employee employee : employees) {
            CompositeClient.g_indent.append("   ");
            employee.print();
            CompositeClient.g_indent.setLength(CompositeClient.g_indent.length() - 3);
        }
    }
}
