package com.design.pattern.iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        Iterator iterator = namesRepository.getIterator();

        while (iterator.hasNext()) {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}