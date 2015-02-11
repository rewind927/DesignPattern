package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Caretaker
public class Recovery {
	private List<Backup> backups = new ArrayList<Backup>();

	public void add(Backup backup) {
		backups.add(backup);
	}

	public Backup retrieve(Date date) {
		for (Backup backup : backups) {
			if (backup.getDate().equals(date)) {
				backups.remove(backup);
				return backup;
			}
		}
		return null;
	}
}
