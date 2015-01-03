package com.design.pattern.command.command;

import com.design.pattern.command.army.Goblin;

public class GoblinCommand implements Command {

    private Goblin goblin;

    public GoblinCommand(Goblin goblin) {
        this.goblin = goblin;
    }

    @Override
    public void attack() {
        goblin.attack();
    }
}
