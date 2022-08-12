package com.simplilearn.ph2.dto;

public class Subjects {
	
	private int id;
	private String name;
	private String shortcut;
	
	public Subjects() {}

	public Subjects(int id, String name, String shortcut) {
		this.id = id;
		this.name = name;
		this.shortcut = shortcut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortcut() {
		return shortcut;
	}

	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}

	
}
