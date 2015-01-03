package com.design.pattern.command;

import com.design.pattern.command.army.BaseballPlayer;
import com.design.pattern.command.army.Goblin;
import com.design.pattern.command.army.Knight;
import com.design.pattern.command.army.SonGoku;
import com.design.pattern.command.army.Warrior;
import com.design.pattern.command.army.Wizard;
import com.design.pattern.command.command.BaseballPlayerCommand;
import com.design.pattern.command.command.Command;
import com.design.pattern.command.command.GoblinCommand;
import com.design.pattern.command.command.KnightCommand;
import com.design.pattern.command.command.MircoCommand;
import com.design.pattern.command.command.SonGokuCommand;
import com.design.pattern.command.command.WarriorCommand;
import com.design.pattern.command.command.WizardCommand;
import com.design.pattern.command.remotecontrol.SimpleRemoteControl;

import java.util.ArrayList;
import java.util.List;

public class FightMain {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();
        Goblin goblin = new Goblin();
        BaseballPlayer baseballPlayer = new BaseballPlayer();
        SonGoku sonGoku = new SonGoku();

        Command knightCommand = new KnightCommand(knight);
        Command wizardCommand = new WizardCommand(wizard);
        Command warriorCommand = new WarriorCommand(warrior);
        Command goblinCommand = new GoblinCommand(goblin);
        Command baseballPlayerCommand = new BaseballPlayerCommand(baseballPlayer);
        Command sonGoKuCommand = new SonGokuCommand(sonGoku);
        
        List<Command> commandList= new ArrayList<Command>();
        commandList.add(sonGoKuCommand);
        commandList.add(baseballPlayerCommand);
        Command mircoCommand = new MircoCommand(commandList);

        remoteControl.addCommand(knightCommand);
        remoteControl.addCommand(wizardCommand);
        remoteControl.addCommand(warriorCommand);
        remoteControl.addCommand(goblinCommand);
        remoteControl.addCommand(baseballPlayerCommand);
        remoteControl.addCommand(sonGoKuCommand);
        remoteControl.addCommand(mircoCommand);

        System.out.println(remoteControl);

        for (int i = 0; i < remoteControl.getCommandsSize(); i++) {
            System.out.println("-------------"+i+"----------------");
            remoteControl.buttonWasPressed(i);
        }
        
    }
}
