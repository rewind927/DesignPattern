package com.design.pattern.bridge.shape;

import com.design.pattern.bridge.drawing.DP2;

public class V2Rectangle extends Rectangle {

    public V2Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void drawLine() {
        DP2.draw_line(x1, x2, y1, y2);
    }
}
