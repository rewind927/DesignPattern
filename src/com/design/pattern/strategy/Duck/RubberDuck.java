
package com.design.pattern.strategy.Duck;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
