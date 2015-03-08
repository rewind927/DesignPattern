package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.Drawing;

public class Circle extends Shape {

    private double x;
    private double y;
    private double r;

    public Circle(Drawing drawing, double x, double y, double r) {
        super(drawing);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        drawCircle(x, y, r);
    }
}
