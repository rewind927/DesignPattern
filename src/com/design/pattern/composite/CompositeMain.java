package com.design.pattern.composite;

public class CompositeMain {

    public static void main(String[] args) {
        Employee john = new Developer("John", 20000);
        Employee mary = new Developer("Mary", 25000);
        Employee manager = new Manager("Manager", 45000);
        manager.add(john);
        manager.add(mary);

        Employee jason = new Developer("Jason", 30000);
        Manager generalManager = new Manager("GeneralManager", 75000);
        generalManager.add(jason);
        generalManager.add(manager);
        generalManager.print();
    }
}
