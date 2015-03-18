package com.design.pattern.factorymethod;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Open the PdfDocument");
    }

    public void close() {
        System.out.println("Close the pdfDocument");
    }
}
