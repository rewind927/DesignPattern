package com.design.pattern.memento;


public class Player {
    private PlayerState playerState;

    public Player() {
        playerState = new PlayerState(100, 0, PlayerState.State.IDLE_STATE);
    }

    public SavePoint savePlayerStateToSavePoint() {
        System.out.println("====================== savePlayerStateToSavePoint:" + playerState.getTime() + " ======================");
        return new SavePoint(playerState);
    }

    public void loadPlayerStateFromSavePoint(SavePoint savePoint) {
        playerState = savePoint.getPlayerState();
        System.out.println("====================== loadPlayerStateToSavePoint:" + playerState.getTime() + " ======================");
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
