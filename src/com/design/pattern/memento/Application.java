package com.design.pattern.memento;

// Originator
public class Application {
	private String state = "default setting";

	public Backup backup() {
		return new Backup(state);
	}

	public void recover(Backup backup) {
		this.state = backup.getState();
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}