package com.design.pattern.command.command;

import java.util.List;

public class MircoCommand implements Command{
    private List<Command> commands;

    public MircoCommand(List commands) {
        this.commands = commands;
    }

    @Override
    public void attack() {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).attack();
        }
    }
}
