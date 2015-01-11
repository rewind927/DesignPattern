package com.design.pattern.decorator;

public class BeefBurger extends Burger{

    @Override
    public String getDescription() {
        return "beff burger";
    }

    @Override
    public float cost() {
        return 1.99f + super.cost();
    }

}
