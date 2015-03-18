package com.design.pattern.composite;

public class Developer implements Employee {
    private String name;
    private String title;

    public Developer(String name, String title) {
        this.name = name;
        this.title = title;
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
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(CompositeClient.g_indent + "Name  : " + getName());
        System.out.println(CompositeClient.g_indent + "Title: " + getTitle());
    }

}
