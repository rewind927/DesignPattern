package com.design.pattern.bridge.shape;

public class Circle extends Shape {

    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircle(x, y, r);
    }
}
