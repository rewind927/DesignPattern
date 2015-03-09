package com.design.pattern.bridge;

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
        //TODO add drawing bridge
        shapes.add(new Rectangle(2, 2, 5, 5));
        shapes.add(new Circle(2, 2, 5));
        shapes.add(new Rectangle(1, 1, 7, 7));
        shapes.add(new Circle(3, 3, 6));
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
