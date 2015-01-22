package com.design.pattern.strategy;

public class SwimWithWebbedFeet implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("swim with webbed feet");
    }

}
