package com.startjava.lesson_4.game;

import java.util.Arrays;

class Player {
	private String name;
	private int attempt;
	private int[] enteredNums = new int[10];

	Player(String name) {
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public int[] getEnteredNums() {
		return Arrays.copyOf(enteredNums, attempt);
	}

	public void setEnteredNums(int index, int number) {
		enteredNums[index] = number;
	}

	public void fill(int number) {
		Arrays.fill(enteredNums, number);
	}
}