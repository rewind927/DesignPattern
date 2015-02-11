package com.design.pattern.memento;

import java.util.Date;

// Memento
public class Backup {
	private String state;
	private Date date;

	public Backup(String state) {
		this.state = state;
		date = new Date();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}
}
