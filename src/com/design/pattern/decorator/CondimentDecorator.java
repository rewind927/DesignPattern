package com.design.pattern.decorator;

public abstract class CondimentDecorator extends Burger{

    protected Burger burger;

    public CondimentDecorator(Burger burger) {
        this.burger = burger;
    }

    public abstract String getDescription();
    
}
