
package com.design.pattern.strategy.duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new SwimWithTurbineEngine();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
