package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.Drawing;

public abstract class Shape {
    protected Drawing myDrawing;
    public abstract void draw();

    public Shape(Drawing drawing) {
        myDrawing = drawing;
    }

    protected void drawLine(double x1, double y1, double x2, double y2) {
        myDrawing.drawLine(x1, y1, x2, y2);
    }

    protected void drawCircle(double x, double y, double r) {
        myDrawing.drawCircle(x, y, r);
    }
}
