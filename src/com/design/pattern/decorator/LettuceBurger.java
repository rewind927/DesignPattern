package com.design.pattern.decorator;

public class LettuceBurger extends Burger{

    public String getDescription() {
        return "lettuce burger";
    }

    @Override
    public float cost() {
        return 1.1f + super.cost();
    }
}
