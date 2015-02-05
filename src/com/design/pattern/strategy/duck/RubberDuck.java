
package com.design.pattern.strategy.duck;

import java.lang.*;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
