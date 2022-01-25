package com.group11.lettersgame;

public class Letter {
	private char lowercase;
	private char uppercase;

	public Letter(char l, char u) {
		this.lowercase = l;
		this.uppercase = u;
	}

	public char getLowercase() {
		return this.lowercase;
	}

	public char getUppercase() {
		return this.uppercase;
	}
}
