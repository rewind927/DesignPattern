
package com.design.pattern.command;

import com.design.pattern.command.army.BaseballPlayer;
import com.design.pattern.command.army.Goblin;
import com.design.pattern.command.army.Knight;
import com.design.pattern.command.army.SonGoku;
import com.design.pattern.command.army.Warrior;
import com.design.pattern.command.army.Wizard;

public class FightMain {

    public static void main(String[] args) {

        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Warrior warrior = new Warrior();
        Goblin goblin = new Goblin();
        BaseballPlayer baseballPlayer = new BaseballPlayer();
        SonGoku sonGoku = new SonGoku();

        knight.rideHorseAndAttack();
        wizard.spell();
        warrior.attack();
        goblin.attack();
        baseballPlayer.swingBat();
        sonGoku.superSaiyan();
        sonGoku.kamehameha();

    }
}
