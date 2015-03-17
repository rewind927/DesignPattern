package com.design.pattern.factorymethod;

public class PdfFactory implements DocumentFactory {

    @Override
    public Document create() {
        Document pdf = new PdfDocument();
        System.out.println("Create the PdfDocument");
        return pdf;
    }
}
