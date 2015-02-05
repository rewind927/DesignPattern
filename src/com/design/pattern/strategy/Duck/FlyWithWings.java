package com.design.pattern.strategy.Duck;

public class FlyWithWings implements FlyBehavior{
    
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
    
}
