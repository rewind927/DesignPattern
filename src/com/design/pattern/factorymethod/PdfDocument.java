package com.design.pattern.factorymethod;

public class PdfDocument implements Document {

    @Override
    public void open() {
        System.out.println("Open the PdfDocument");
    }

    @Override
    public void close() {
        System.out.println("Close the pdfDocument");
    }
}
