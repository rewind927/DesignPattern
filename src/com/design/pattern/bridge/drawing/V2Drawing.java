package com.design.pattern.bridge.drawing;

public class V2Drawing extends Drawing {

    @Override
    public void drawLine(double x1, double y1, double x2, double y2) {
        DP2.draw_line(x1, x2, y1, y2);
    }

    @Override
    public void drawCircle(double x, double y, double r) {
        DP2.draw_circle(x, y, r);
    }
}
