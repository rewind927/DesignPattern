package com.design.pattern.decorator;

public class ChickenBurger extends Burger{
    
    public String getDescription() {
        return "cheen burger";
    }

    @Override
    public float cost() {
        return 1.50f + super.cost();
    }
}
