package com.design.pattern.command.command;

import com.design.pattern.command.army.Wizard;

public class WizardCommand implements Command {

	private Wizard wizard;

	public WizardCommand(Wizard wizard) {
		this.wizard = wizard;
	}

	@Override
	public void attack() {
		wizard.spell();
	}
}
