package com.design.pattern.chain;

public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.COLLECT_TAX) {
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
