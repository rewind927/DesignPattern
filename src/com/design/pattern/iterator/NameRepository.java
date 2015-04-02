package com.design.pattern.iterator;

import java.util.ArrayList;

public class NameRepository implements Container {
    public String names[] = {"Ethan", "Jason", "Karen", "Ascii"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        //TODO: Implement hasNext()
        @Override
        public boolean hasNext() {
            return false;
        }

        //TODO: Implement next()
        @Override
        public Object next() {
            return null;
        }
    }
}