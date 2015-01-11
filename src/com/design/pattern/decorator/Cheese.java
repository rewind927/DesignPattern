package com.design.pattern.decorator;

public class Cheese extends CondimentDecorator{
    
    private Burger burger;
    
    public Cheese(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    @Override
    public float cost() {
        return burger.cost() + 0.9f;
    }

}
