package com.design.pattern.memento;


import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayerState playerState;
    private List<PlayerState> saveList;

    public Player() {
        playerState = new PlayerState(100, 0, PlayerState.State.IDLE_STATE);
        saveList = new ArrayList<PlayerState>();
    }

    public void savePlayerStateToSavePoint() {
        System.out.println("====================== savePlayerStateToSavePoint:" + playerState.getTime() + " ======================");
        saveList.add(playerState);
    }

    public void loadPlayerStateFromSavePoint(int index) {
        playerState = saveList.get(index);
        System.out.println("====================== savePlayerStateToSavePoint:" + playerState.getTime() + " ======================");
        System.out.println("load complete!");
        showPlayerState();
        System.out.println("================================================================================================");
    }

    public void attack() {
        int hp = playerState.getHp();
        int exp = playerState.getExp();

        hp -= (int) (Math.random() * 100);
        exp += (int) (Math.random() * 100);

        playerState = new PlayerState(hp, exp, PlayerState.State.ATTACK_STATE);
        showPlayerState();
        coolTime();
    }

    public void restore() {
        int hp = playerState.getHp();
        int exp = playerState.getExp();

        hp += (int) (Math.random() * 100);
        exp += (int) (Math.random() * 10);

        playerState = new PlayerState(hp, exp, PlayerState.State.RESTORE_STATE);
        showPlayerState();
        coolTime();
    }

    public void idle() {
        int hp = playerState.getHp();
        int exp = playerState.getExp();
        playerState = new PlayerState(hp, exp, PlayerState.State.IDLE_STATE);
        showPlayerState();
        coolTime();
    }

    public void coolTime() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showPlayerState() {
        System.out.println(String.format("| player state: %-10s | hp: %-10d | exp: %-10d | time: %-25s |", playerState.getState(), playerState.getHp(), playerState.getExp(), playerState.getTime()));
    }
}
