
package com.design.pattern.strategy.Duck;

public class Quack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
