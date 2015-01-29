package com.design.pattern.chain;

public class OrcOfficer {
    //TODO refactor this class. You can refer to OrcCommander class.
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
