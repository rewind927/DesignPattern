package com.design.pattern.composite;

public class CompositeClient {
    public static StringBuffer g_indent = new StringBuffer();

    public static void main(String[] args) {
        Developer john = new Developer("John", "Developer");
        Developer mary = new Developer("Mary", "Developer");
        Manager pm = new Manager("Bob", "PM");
        pm.add(john);
        pm.add(mary);

        Developer jason = new Developer("Michael", "Sales");
        Manager generalManager = new Manager("BigPerson", "CEO");
        generalManager.add(jason);
        generalManager.add(pm);
        generalManager.print();
    }
}
