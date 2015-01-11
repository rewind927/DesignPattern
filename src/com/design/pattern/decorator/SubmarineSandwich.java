package com.design.pattern.decorator;

public class SubmarineSandwich extends Burger{

    @Override
    public String getDescription() {
        return "submarine sandwch";
    }

    @Override
    public float cost() {
        return 1.10f;
    }

}
