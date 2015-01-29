package com.design.pattern.decorator;

public class CheeseSandwich extends Sandwich {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public float cost() {
        return super.cost() + 0.9f;
    }
}
