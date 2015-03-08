package com.design.pattern.bridge;

import com.design.pattern.bridge.drawing.V1Drawing;
import com.design.pattern.bridge.drawing.V2Drawing;
import com.design.pattern.bridge.shape.Circle;
import com.design.pattern.bridge.shape.Rectangle;
import com.design.pattern.bridge.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Shape> shapes = new ArrayList<Shape>();

    public Factory() {
    }

    public void create() {
        shapes.add(new Rectangle(new V1Drawing(), 2, 2, 5, 5));
        shapes.add(new Circle(new V1Drawing(), 2, 2, 5));
        shapes.add(new Rectangle(new V2Drawing(), 1, 1, 7, 7));
        shapes.add(new Circle(new V2Drawing(), 3, 3, 6));
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
