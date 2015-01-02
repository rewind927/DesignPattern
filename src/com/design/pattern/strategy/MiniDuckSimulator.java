
package com.design.pattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        RedHeadDuck readHeadDuck = new RedHeadDuck();
        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.fly();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
        readHeadDuck.display();
        readHeadDuck.quack();
        readHeadDuck.fly();
        modelDuck.display();
        modelDuck.quack();
        //TODO change fly behavior, use FlyWithRocket to fly by setter function. 
        modelDuck.fly();
    }
}
