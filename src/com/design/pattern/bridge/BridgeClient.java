package com.design.pattern.bridge;

import com.design.pattern.bridge.shape.Shape;

import java.util.List;

public class BridgeClient {

    public static void main(String[] args) {
        List<Shape> myShapes;
        Factory myFactory = new Factory();

        myFactory.create();
        myShapes = myFactory.getShapes();
        for (Shape shape : myShapes) {
            shape.draw();
        }
    }
}
