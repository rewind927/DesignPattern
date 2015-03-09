package com.design.pattern.bridge.shape;

public abstract class Rectangle extends Shape {

    protected double x1;
    protected double y1;
    protected double x2;
    protected double y2;

    public abstract void drawLine();

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawLine();
    }

}
