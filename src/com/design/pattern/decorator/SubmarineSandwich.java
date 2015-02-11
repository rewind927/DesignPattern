package com.design.pattern.decorator;

public class SubmarineSandwich implements Burger {

    @Override
    public String getDescription() {
        return "submarine sandwich";
    }

    @Override
    public float cost() {
        return 1.10f;
    }

}
