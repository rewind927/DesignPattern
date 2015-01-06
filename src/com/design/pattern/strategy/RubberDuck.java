
package com.design.pattern.strategy;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
        swinBehavior = new Float();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
