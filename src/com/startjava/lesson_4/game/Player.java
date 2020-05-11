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

	public int[] getEnteredNum() {
		return Arrays.copyOf(enteredNums, attempt);
	}

	public void setEnteredNum(int index, int number) {
		enteredNums[index] = number;
		attempt++;
	}

	public void fill(int number) {
		Arrays.fill(enteredNums, number);
	}
}