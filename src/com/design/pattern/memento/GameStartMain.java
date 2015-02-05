package com.design.pattern.memento;

public class GameStartMain {
    public static void main(String[] args) {
        //TODO save and load savePoint by memento pattern.
        Player player = new Player();
        SaveList saveList = new SaveList();
        player.attack();
        player.attack();
        //add save point
        player.restore();
        player.idle();
        player.attack();
        player.attack();
        player.attack();
        player.attack();
        //add save point
        player.attack();
        player.idle();
        //load save point
    }
}
