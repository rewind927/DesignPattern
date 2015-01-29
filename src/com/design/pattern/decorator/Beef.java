package com.design.pattern.decorator;

public class Beef extends CondimentDecorator{
    
    private Burger burger;
    
    public Beef(Burger burger){
        this.burger = burger;
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
