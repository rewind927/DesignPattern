package com.design.pattern.bridge;

import com.design.pattern.bridge.shape.*;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Shape> shapes = new ArrayList<Shape>();

    public Factory() {
    }

    public void create() {
        shapes.add(new V1Rectangle( 2, 2, 5, 5));
        shapes.add(new V1Circle(2, 2, 5));
        shapes.add(new V2Rectangle(1, 1, 7, 7));
        shapes.add(new V2Circle(3, 3, 6));
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
