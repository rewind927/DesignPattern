
package com.design.pattern.strategy;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
