package com.design.pattern.decorator;

public class CheeseBurger extends Burger{

    @Override
    public String getDescription() {
        return "chesse burger";
    }

    @Override
    public float cost() {
        return 0.99f + super.cost();
    }
    
}
