
package com.design.pattern.strategy.duck;

public class Quack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
