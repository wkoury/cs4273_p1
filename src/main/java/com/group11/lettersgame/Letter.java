package com.group11.lettersgame;

public class Letter {
	private String lowercase;
	private String uppercase;
	private int index;

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

	// Return the random number, but 1-indexed
	public int getIndexPlusOne() {
		return this.index + 1;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
