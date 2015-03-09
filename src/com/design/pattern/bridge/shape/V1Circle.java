package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.DP1;

public class V1Circle extends Circle {

    public V1Circle(double x, double y, double r) {
        super(x, y, r);
    }

    @Override
    public void drawCircle() {
        DP1.draw_a_circle(x, y, r);
    }
}
