package com.design.pattern.iterator;

import java.util.ArrayList;

public class NameRepository implements Container {
    public String names[] = {"Ethan", "Jason", "Karen", "Ascii"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}