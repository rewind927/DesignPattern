package com.design.pattern.chain;

public class OrcKing {

    public void makeRequest(Request request) {
        if (request.getRequestType() == RequestType.DEFEND_CASTLE) {
            new OrcSoldier().handleRequest(request);
        } else if (request.getRequestType() == RequestType.COLLECT_TAX) {
            new OrcOfficer().handleRequest(request);
        } else if (request.getRequestType() == RequestType.TRAIN_SOLDIER) {
            new OrcCommander().handleRequest(request);
        }
    }
}
