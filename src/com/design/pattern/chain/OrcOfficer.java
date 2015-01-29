package com.design.pattern.chain;

public class OrcOfficer {
    public void handleRequest(Request request) {
        printHandling(request);
    }

    protected void printHandling(Request request) {
        System.out.println(this + " handling request \"" + request + "\"");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
