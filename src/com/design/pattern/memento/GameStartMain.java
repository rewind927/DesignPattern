package com.design.pattern.memento;

public class GameStartMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.attack();
        player.attack();
        player.savePlayerStateToSavePoint();
        player.restore();
        player.idle();
        player.attack();
        player.attack();
        player.attack();
        player.attack();
        player.attack();
        player.savePlayerStateToSavePoint();
        player.idle();
        player.loadPlayerStateFromSavePoint(0);
    }
}
