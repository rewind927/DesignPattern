package com.design.pattern.command.command;

import com.design.pattern.command.army.Warrior;

public class WarriorCommand implements Command {

	private Warrior warrior;

	public WarriorCommand(Warrior warrior) {
		this.warrior = warrior;
	}

	@Override
	public void attack() {
		warrior.attack();
	}
}
