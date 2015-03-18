package com.design.pattern.factorymethod;

public class TxtDocument implements Document {

    @Override
    public void open() {
        System.out.println("Open the TxtDocument");
    }

    @Override
    public void close() {
        System.out.println("Close the TxtDocument");
    }
}
