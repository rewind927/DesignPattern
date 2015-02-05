package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class SaveList {
    private List<SavePoint> saveList;

    public SaveList() {
        saveList = new ArrayList<SavePoint>();
    }

    public void addSavePointToSaveList(SavePoint savePoint) {
        saveList.add(savePoint);
    }

    public SavePoint getSavePointFromSaveList(int index) {
        if (index >= saveList.size()) {
            return null;
        } else {
            return saveList.get(index);
        }
    }
}
