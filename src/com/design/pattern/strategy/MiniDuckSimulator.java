
package com.design.pattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        RedHeadDuck readHeadDuck = new RedHeadDuck();
        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swin();
        mallardDuck.fly();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.swin();
        readHeadDuck.display();
        readHeadDuck.quack();
        readHeadDuck.fly();
        readHeadDuck.swin();
        modelDuck.display();
        modelDuck.quack();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.fly();
        modelDuck.swin();
    }
}
