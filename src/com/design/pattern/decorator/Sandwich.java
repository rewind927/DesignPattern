package com.design.pattern.decorator;

public class Sandwich extends Burger{
    
    public String getDescription() {
        return "sandwich";
    }

    @Override
    public float cost() {
        return 0.99f;
    }

}
