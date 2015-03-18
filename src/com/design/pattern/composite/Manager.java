package com.design.pattern.composite;

import java.util.ArrayList;

public class Manager {
    private String name;
    private String title;
    private ArrayList employeeList = new ArrayList();

    public Manager(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void add(Object employee) {
        employeeList.add(employee);
    }

    public void remove(Object employee) {
        employeeList.remove(employee);
    }

    public void print() {
        System.out.println(CompositeClient.g_indent + "Name : " + getName());
        System.out.println(CompositeClient.g_indent + "Title: " + getTitle());
        System.out.println("---------------------------");

        for (Object employee : employeeList) {
            CompositeClient.g_indent.append("   ");
            if (employee instanceof Developer) {
                ((Developer) employee).print();
            } else if (employee instanceof Manager) {
                ((Manager) employee).print();
            }
            CompositeClient.g_indent.setLength(CompositeClient.g_indent.length() - 3);
        }
    }

}
