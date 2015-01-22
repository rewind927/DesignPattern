package com.design.pattern.strategy;

public class Float implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("float");
    }
}
