package com.design.pattern.memento;

import java.sql.Timestamp;

public class PlayerState {
    private int hp;
    private int exp;
    private String state;
    private String time;

    public PlayerState(int hp, int exp, String state) {
        this.hp = hp;
        this.exp = exp;
        this.state = state;
        this.time = new Timestamp(new java.util.Date().getTime()).toString();
    }

    public static class State {
        public static final String ATTACK_STATE = "attack";
        public static final String IDLE_STATE = "idle";
        public static final String RESTORE_STATE = "restore";
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public String getState() {
        return state;
    }

    public String getTime() {
        return time;
    }
}
