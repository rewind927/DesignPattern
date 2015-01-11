package com.design.pattern.decorator;

public class BaconBurger extends Burger{
    
    public String getDescription() {
        return "bacon burger";
    }

    @Override
    public float cost() {
        return 1.60f + super.cost();
    }

}
