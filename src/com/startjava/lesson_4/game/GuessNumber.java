package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumber {	
	private Player pl1;
	private Player pl2;
	Scanner scanner = new Scanner(System.in);

	GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void guessNumber() {				
		int randNum = (int) (Math.random() * 101);
		System.out.println("игра началась! загаданное число " + randNum);
		for (int i = 0; i < 10; i++) {
			inputNumber(pl1);
			if (checkNumber(pl1, randNum)) {
				break;
			}

			if (i == 9) {
				System.out.println(pl1.getName() + " Вы не угадали число у вас закончились попытки");
			}

			inputNumber(pl2);
			if (checkNumber(pl2, randNum)) {
				break;
			}

			if (i == 9) {
				System.out.println(pl2.getName() + " Вы не угадали число у вас закончились попытки");
			}
		}
		outputNumbers(pl1);
		pl1.fill();
		outputNumbers(pl2);
		pl2.fill();
	}

	private void inputNumber(Player pl) {
		System.out.println(pl.getName() + " введите число");
		int number = scanner.nextInt();
		pl.setEnteredNum(pl.getAttempt(), number);
	}

	private boolean checkNumber(Player pl, int randNum) {
		if (pl.getEnteredNums()[pl.getAttempt() - 1] != randNum) {
			if (pl.getEnteredNums()[pl.getAttempt() - 1] < randNum) {
				System.out.println("Ваше число меньше загаданного числа");
			} else {
				System.out.println("Ваше число больше загаданного числа");
			} return false;
		}
		{
			System.out.println(pl.getName() + " Вы угадали число c " + pl.getAttempt() + " попытки");
			return true;
		}
	}

	private void outputNumbers(Player pl) {
		System.out.print(pl.getName() + " Ваши числа ");
		for (int num :	pl.getEnteredNums()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}