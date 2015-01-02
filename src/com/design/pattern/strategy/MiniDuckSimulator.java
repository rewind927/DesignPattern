
package com.design.pattern.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        RedHeadDuck readHead = new RedHeadDuck();
        ModelDuck model = new ModelDuck();

        mallard.display();
        mallard.fly();
        rubberDuckie.display();
        rubberDuckie.fly();
        readHead.display();
        readHead.fly();
        model.display();
        model.fly();
    }
}
