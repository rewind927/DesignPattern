package com.design.pattern.facade;

public class FacadeClient {

    public static void main(String[] args) {
        //TODO use facade client
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
