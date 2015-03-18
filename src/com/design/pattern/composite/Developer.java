package com.design.pattern.composite;

public class Developer {
    private String name;
    private String title;

    public Developer(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void print() {
        System.out.println(CompositeClient.g_indent + "Name : " + getName());
        System.out.println(CompositeClient.g_indent + "Title: " + getTitle());
    }
}
