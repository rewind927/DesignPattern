package com.design.pattern.chain;

public class OrcKing {

    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    public void makeRequest(Request request) {
        //TODO refactor this code by chain of responsibility pattern.
        if (request.getRequestType() == RequestType.DEFEND_CASTLE) {
            new OrcSoldier().handleRequest(request);
        } else if (request.getRequestType() == RequestType.COLLECT_TAX) {
            new OrcOfficer().handleRequest(request);
        } else if (request.getRequestType() == RequestType.TRAIN_SOLDIER) {
            chain.handleRequest(request);
        }
    }

    private void buildChain() {
        //TODO refactor this. new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
        chain = new OrcCommander(null);
    }
}
