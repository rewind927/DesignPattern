package com.design.pattern.chain;

public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.DEFEND_CASTLE) {
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
