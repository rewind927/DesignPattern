package com.design.pattern.decorator;

public class Bacon extends CondimentDecorator{
    
    public Bacon(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }

    @Override
    public float cost() {
        return burger.cost() + 1.5f;
    }

}
