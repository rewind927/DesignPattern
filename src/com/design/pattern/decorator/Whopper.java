package com.design.pattern.decorator;

public class Whopper extends Burger{

    public String getDescription() {
        return "whopper";
    }

    @Override
    public float cost() {
        return 1.0f;
    }
}
