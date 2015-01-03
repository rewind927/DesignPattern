package com.design.pattern.command.command;

import com.design.pattern.command.army.BaseballPlayer;

public class BaseballPlayerCommand implements Command{
    
    private BaseballPlayer baseballPlayer;
    
	public BaseballPlayerCommand(BaseballPlayer baseballPlayer){
	    this.baseballPlayer = baseballPlayer;
	}

    @Override
    public void attack() {
        baseballPlayer.swingBat();
    }
}
