package com.startjava.lesson_4.game;
import java.util.Arrays;

class Player {
	private String name;
	private int number;
	private int attempt;
	private int[] enteredPlayer = new int[10];

	Player(String name) {
		this.name = name;		
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int getAttempt () {
		return attempt;
	}

	public void setAttempt (int attempt) {
		this.attempt = attempt;
	}

	public int[] getEnteredPlayerCopy() {
		return Arrays.copyOf(enteredPlayer, attempt);
	}

	public void setEnteredPlayer (int index, int number) {
		enteredPlayer[index] = number;
	}

	public void fill (int number) {
		Arrays.fill(enteredPlayer, number);
	}

	public void inputNumbers(int number, int randNum, int forAttempt) {
		setNumber(number);
		if (getNumber() > randNum) {
			System.out.println("Ваше число больше загаданного числа");
			setAttempt(forAttempt + 1);
			setEnteredPlayer(forAttempt, number);
		} else if (getNumber() < randNum) {
			System.out.println("Ваше число меньше загаданного числа");
			setAttempt(forAttempt + 1);
			setEnteredPlayer(forAttempt, number);
		} else if (getNumber() == randNum) {
			setAttempt(forAttempt + 1);
			System.out.println(getName() + " Вы угадали число c " + getAttempt() + " попытки");
			setEnteredPlayer(forAttempt, number);
		}
	}

	public void outputNumbers () {
		for (int i = 0; i < getEnteredPlayerCopy().length; i++) {
			System.out.print(getEnteredPlayerCopy()[i] + " ");
		}
	}
}