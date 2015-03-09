package com.design.pattern.facade;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle::draw()");
    }
}
