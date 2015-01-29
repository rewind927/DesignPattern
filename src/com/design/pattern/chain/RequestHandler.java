package com.design.pattern.chain;

public abstract class RequestHandler {

    public RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        //TODO pass request to next handler.
    }

    protected void printHandling(Request request) {
        System.out.println(this + " handling request \"" + request + "\"");
    }

    @Override
    public abstract String toString();

}
