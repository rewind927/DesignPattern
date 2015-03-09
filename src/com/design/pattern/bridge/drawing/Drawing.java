package com.design.pattern.bridge.drawing;

public abstract class Drawing {
    public abstract void drawLine(double x1, double y1, double x2, double y2);
    public abstract void drawCircle(double x, double y, double r);
}
