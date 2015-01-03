package com.design.pattern.command.command;

import com.design.pattern.command.army.Knight;

public class KnightCommand implements Command{
	
    private Knight knight;

    public KnightCommand(Knight knight) {
        this.knight = knight;
    }

    @Override
    public void attack() {
        knight.rideHorseAndAttack();
    }

}
