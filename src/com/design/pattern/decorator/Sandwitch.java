package com.design.pattern.decorator;

public class Sandwitch extends Burger{
    
    public String getDescription() {
        return "sandwitch";
    }

    @Override
    public float cost() {
        return 0.9f;
    }

}
