package com.design.pattern.decorator;

public class Chicken extends CondimentDecorator{
    
    private Burger burger;
    
    public Chicken(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Chicken";
    }

    @Override
    public float cost() {
        return burger.cost() + 1.9f;
    }

}
