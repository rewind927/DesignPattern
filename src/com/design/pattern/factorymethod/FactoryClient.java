package com.design.pattern.factorymethod;

public class FactoryClient {
    public static void main(String args[]) {
        //TODO: Use DocumentFactory to create Document
        TxtDocument txt = new TxtDocument();
        txt.open();
        txt.close();

        PdfDocument pdf = new PdfDocument();
        pdf.open();
        pdf.close();
    }
}