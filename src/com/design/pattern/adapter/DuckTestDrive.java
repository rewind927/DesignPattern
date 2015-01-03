
package com.design.pattern.adapter;



public class DuckTestDrive {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);
        
        //TODO using adapter pattern
        
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
