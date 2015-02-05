
package com.design.pattern.adapter.objectadapter;


import com.design.pattern.adapter.Duck;
import com.design.pattern.adapter.MallardDuck;
import com.design.pattern.adapter.WildTurkey;

public class DuckTestDriveByObjectAdapter {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        //TODO implement with object adapter.
        
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
