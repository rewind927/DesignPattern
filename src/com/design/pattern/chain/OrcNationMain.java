package com.design.pattern.chain;

public class OrcNationMain {
    public static void main(String[] args) {
        OrcKing orcKing = new OrcKing();

        Request defendCastleRequest = new Request(RequestType.DEFEND_CASTLE, "defend castle");
        orcKing.makeRequest(defendCastleRequest);

        Request collectTaxRequest = new Request(RequestType.COLLECT_TAX, "collect tax");
        orcKing.makeRequest(collectTaxRequest);

        Request trainSoldierRequest = new Request(RequestType.TRAIN_SOLDIER, "train soldier");
        orcKing.makeRequest(trainSoldierRequest);

        Request buildHouseRequest = new Request(RequestType.BUILD_HOUSE, "build house");
        orcKing.makeRequest(buildHouseRequest);
    }
}
