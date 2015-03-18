package com.design.pattern.factorymethod;

public class FactoryClient {
    public static void main(String args[]) {
        DocumentFactory documentFactory = new TxtFactory();
        Document document = documentFactory.create();

        document.open();
        document.close();
    }
}
