package com.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private String title;
    private List<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String title) {
        this.name = name;
        this.title = title;
    }

    //TODO: Implement Employee


}
