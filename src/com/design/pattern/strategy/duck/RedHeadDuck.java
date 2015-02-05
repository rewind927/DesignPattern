
package com.design.pattern.strategy.duck;

public class RedHeadDuck extends Duck {
    
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new SwimWithWebbedFeet();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
