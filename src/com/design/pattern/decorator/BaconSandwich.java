package com.design.pattern.decorator;

public class BaconSandwich extends Sandwich {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }

    @Override
    public float cost() {
        return super.cost() + 1.9f;
    }
}
