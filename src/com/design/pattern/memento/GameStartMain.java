package com.design.pattern.memento;

public class GameStartMain {
    public static void main(String[] args) {
        Player player = new Player();
        SaveList saveList = new SaveList();
        player.attack();
        player.attack();
        saveList.addSavePointToSaveList(player.savePlayerStateToSavePoint());
        player.restore();
        player.idle();
        player.attack();
        player.attack();
        player.attack();
        player.attack();
        saveList.addSavePointToSaveList(player.savePlayerStateToSavePoint());
        player.attack();
        player.idle();
        player.loadPlayerStateFromSavePoint(saveList.getSavePointFromSaveList(0));
    }
}
