
package com.design.pattern.strategy.duck;

public abstract class Duck {

    public void quack() {
        System.out.println("quack,quack!");
    }

    public void fly() {
        System.out.println("fly");
    }

    public abstract void display();

    public void swim() {
        System.out.println("swim");
    }
}
