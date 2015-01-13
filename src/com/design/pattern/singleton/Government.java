package com.design.pattern.singleton;

public class Government {
    private int officer;

    public static Government getInstance() {
        // TODO refactor with singleton pattern and add thread safe mechanism
        return new Government();
    }

    public void setOfficer(int officer) {
        this.officer = officer;
    }

    public int getOfficer() {
        return officer;
    }
}
