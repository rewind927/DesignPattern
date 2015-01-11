package com.design.pattern.decorator;

public abstract class Burger {
    protected String description = "Unknow Burger";
    
    public abstract String getDescription();
    public abstract float cost();
    
}
