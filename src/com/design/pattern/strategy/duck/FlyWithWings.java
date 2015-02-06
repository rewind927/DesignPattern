package com.design.pattern.strategy.duck;

public class FlyWithWings implements FlyBehavior{
    
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
    
}
