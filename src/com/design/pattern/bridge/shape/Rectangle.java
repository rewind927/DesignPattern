package com.design.pattern.bridge.shape;

public class Rectangle extends Shape {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawLine(x1, y1, x2, y2);
    }
}
