package com.design.pattern.decorator;

public class Cheese extends CondimentDecorator{
    
    public Cheese(Burger burger){
        super(burger);
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
