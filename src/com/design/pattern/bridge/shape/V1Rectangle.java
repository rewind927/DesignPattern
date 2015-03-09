package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.DP1;

public class V1Rectangle extends Rectangle {

    public V1Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void drawLine() {
        DP1.draw_a_line(x1, y1, x2, y2);
    }
}
