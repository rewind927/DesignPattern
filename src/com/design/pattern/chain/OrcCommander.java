package com.design.pattern.chain;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.TRAIN_SOLDIER) {
            printHandling(request);
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
