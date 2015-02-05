
package com.design.pattern.strategy.duck;

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
    public void swim() {
        System.out.println("swim with turbine engine");
    }
}
