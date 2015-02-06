
package com.design.pattern.strategy.duck;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    
}
