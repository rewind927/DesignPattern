package com.design.pattern.factorymethod;

public class TxtDocument implements Document {
    public void open() {
        System.out.println("Open the TxtDocument");
    }

    public void close() {
        System.out.println("Close the TxtDocument");
    }
}
