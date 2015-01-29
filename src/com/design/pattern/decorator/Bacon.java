package com.design.pattern.decorator;

public class Bacon extends CondimentDecorator{
    
    private Burger burger;
    
    public Bacon(Burger burger){
        this.burger = burger;
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
