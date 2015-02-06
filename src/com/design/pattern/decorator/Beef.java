package com.design.pattern.decorator;

public class Beef extends CondimentDecorator{
    
    public Beef(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Beef";
    }

    @Override
    public float cost() {
        return burger.cost() + 1.6f;
    }

}
