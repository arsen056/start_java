package com.startjava.lesson2_3.game;
import java.util.Arrays;

class Player {
	private String name;

	Player(String name) {
		this.name = name;		
	}

	public String getName() {
		return name;		
	}

	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	private int attempt;

	public int getAttempt () {
		return attempt;
	}

	public void setAttempt (int attempt) {
		this.attempt = attempt;
	}

	private int [] numberPlayer = new int [10];

	public int [] getNumberPlayerCopy() {
		return Arrays.copyOf(numberPlayer, attempt);
	}

	public void setNumberPlayer (int index, int number) {
		numberPlayer[index] = number;
	}

	public void fill (int number) {
		Arrays.fill(numberPlayer, number);
	}
}