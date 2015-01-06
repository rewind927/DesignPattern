
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

    @Override
    public void quack() {
        System.out.println("silence");
    }

    @Override
    public void swin() {
        System.out.println("swin with turbine engine");
    }
}
