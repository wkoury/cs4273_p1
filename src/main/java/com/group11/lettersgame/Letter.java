package com.group11.lettersgame;

public class Letter {
	private String lowercase;
	private String uppercase;

	public Letter(String l, String u) {
		this.lowercase = l;
		this.uppercase = u;
	}

	public String getLowercase() {
		return this.lowercase;
	}

	public String getUppercase() {
		return this.uppercase;
	}
}
