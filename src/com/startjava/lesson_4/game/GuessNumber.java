package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumber {	
	private Player pl1;
	private Player pl2;

	GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	Scanner scanner = new Scanner(System.in);
	public void guessNumber() {				
		int randNum = (int) (Math.random() * 101);
		System.out.println("игра началась! загаданное число " + randNum);
		for (int i = 0; i < 10; i++) {
			inputNumber(pl1);
			if (checkNumber(pl1, pl1.getEnteredNums()[i], randNum) == true) {
				break;
			}

			if (i == 9) {
				System.out.println(pl1.getName() + " Вы не угадали число у вас закончились попытки");
			}

			inputNumber(pl2);
			if (checkNumber(pl2, pl2.getEnteredNums()[i], randNum) == true) {
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

	public void inputNumber(Player pl) {
		System.out.println(pl.getName() + " введите число");
		int number = scanner.nextInt();
		pl.setEnteredNum(pl.getAttempt(), number);
	}

	public boolean checkNumber(Player pl, int number, int randNum) {
		if (number > randNum) {
			System.out.println("Ваше число больше загаданного числа");
			return false;
		} else if (number < randNum) {
			System.out.println("Ваше число меньше загаданного числа");
			return false;
		} else {
			System.out.println(pl.getName() + " Вы угадали число c " + pl.getAttempt() + " попытки");
			return true;
		}
	}

	public void outputNumbers(Player pl) {
		System.out.print(pl.getName() + " Ваши числа ");
		for (int num:pl.getEnteredNums()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}