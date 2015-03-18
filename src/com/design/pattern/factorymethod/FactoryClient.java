package com.design.pattern.factorymethod;

public class FactoryClient {
    public static void main(String args[]) {
        DocumentFactory txtFactory = new TxtFactory();
        Document document = txtFactory.create();

//        DocumentFactory pdfFactory = new PdfFactory();
//        Document document = pdfFactory.create();

        document.open();
        document.close();
    }
}
