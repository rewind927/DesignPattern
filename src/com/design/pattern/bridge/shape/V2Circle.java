package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.DP2;

public class V2Circle extends Circle {

    public V2Circle(double x, double y, double r) {
        super(x, y, r);
    }

    @Override
    public void drawCircle() {
        DP2.draw_circle(x, y, r);
    }
}
