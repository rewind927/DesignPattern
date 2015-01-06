
package com.design.pattern.strategy;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }

    @Override
    public void quack() {
        System.out.println("Squeak,Squeak~");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void swin() {
        System.out.println("float");
    }
}
