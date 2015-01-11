package com.design.pattern.decorator;

public class Lettuce extends CondimentDecorator{
    
    private Burger burger;
    
    public Lettuce(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", Lettuce";
    }

    @Override
    public float cost() {
        return burger.cost() + 0.7f;
    }

}
