package com.design.pattern.bridge.shape;

public abstract class Circle extends Shape {

    protected double x;
    protected double y;
    protected double r;

    public abstract void drawCircle();

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircle();
    }
}
