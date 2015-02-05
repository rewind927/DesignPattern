
package com.design.pattern.adapter.objectadapter;


import com.design.pattern.adapter.Duck;
import com.design.pattern.adapter.MallardDuck;
import com.design.pattern.adapter.WildTurkey;

public class DuckTestDriveByObjectAdapter {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck fakeDuck = new TurkeyObjectAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe fake Duck says...");
        testDuck(fakeDuck);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
