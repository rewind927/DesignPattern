
package com.design.pattern.strategy;



public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwinBehavior swinBehavior;

    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }
 
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    
    public void setSwinBehavior(SwinBehavior sb) {
        swinBehavior = sb;
    }
    
    public abstract void display();

    public void swin() {
        swinBehavior.swin();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }
}
