
package com.design.pattern.strategy.Duck;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}
