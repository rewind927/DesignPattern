package com.design.pattern.composite;

public class CompositeClient {
    public static StringBuffer g_indent = new StringBuffer();

    public static void main(String[] args) {
        Employee john = new Developer("John", "Developer");
        Employee mary = new Developer("Mary", "Developer");
        Employee pm = new Manager("Bob", "PM");
        pm.add(john);
        pm.add(mary);

        Employee jason = new Developer("Michael", "Sales");
        Manager generalManager = new Manager("BigPerson", "CEO");
        generalManager.add(jason);
        generalManager.add(pm);
        generalManager.print();
    }
}
