
package com.design.pattern.strategy;

public class Quack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
