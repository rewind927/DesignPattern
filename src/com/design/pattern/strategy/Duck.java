
package com.design.pattern.strategy;



public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }
 
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
    public abstract void display();

    public void swin() {
        System.out.println("swin");
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }
}
