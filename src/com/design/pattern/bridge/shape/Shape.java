package com.design.pattern.bridge.shape;

public abstract class Shape {

    public abstract void draw();

    public Shape() {
        //TODO add drawing bridge
    }

    protected void drawLine(double x1, double y1, double x2, double y2) {
        //TODO use drawing method
    }

    protected void drawCircle(double x, double y, double r) {
        //TODO use drawing method
    }
}
