
package com.design.pattern.strategy.duck;



public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }
 
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }
    
    public abstract void display();

    public void swin() {
        swimBehavior.swim();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }
}
