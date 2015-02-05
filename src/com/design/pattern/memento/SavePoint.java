package com.design.pattern.memento;

public class SavePoint {
    private PlayerState playerState;

    public SavePoint(PlayerState playerState) {
        this.playerState = playerState;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }
}
