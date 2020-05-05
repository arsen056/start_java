package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumber {	
	private Player pl1;
	private Player pl2;

	GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void guessNumber() {				
		int randNum = (int) (Math.random() * 101);
		System.out.println("игра началась! загаданное число " + randNum);
		int playerNum1, playerNum2;		
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println(pl1.getName() + " введите число");
			pl1.setNumber(scanner.nextInt());
			playerNum1 = pl1.getNumber();
			if (playerNum1 > randNum) {
				System.out.println("Ваше число больше загаданного числа");
				pl1.setNumberPlayer(i, playerNum1);
				pl1.setAttempt(i + 1);
			} else if (playerNum1 < randNum) {
				System.out.println("Ваше число меньше загаданного числа");
				pl1.setNumberPlayer(i, playerNum1);
				pl1.setAttempt(i + 1);
			} else if (playerNum1 == randNum) {
				pl1.setAttempt(i + 1);
				System.out.println(pl1.getName() + " угадал число c " + pl1.getAttempt() + " ой попытки");
				pl1.setNumberPlayer(i, playerNum1);
				break;
			}
			if (i == 9) {
				System.out.println(pl1.getName() + " Вы не угадали число у вас закончились попытки");
			}
			System.out.println(pl2.getName() + " введите число");
			pl2.setNumber(scanner.nextInt());
			playerNum2 = pl2.getNumber();
			if (playerNum2 > randNum) {
				System.out.println("Ваше число больше загаданного числа");
				pl2.setNumberPlayer(i, playerNum2);
				pl2.setAttempt(i + 1);
			} else if (playerNum2 < randNum) {
				System.out.println("Ваше число меньше загаданного числа");
				pl2.setNumberPlayer(i, playerNum2);
				pl2.setAttempt(i + 1);
			} else if (playerNum2 == randNum) {
				pl2.setAttempt(i + 1);
				System.out.println(pl2.getName() + " угадал число c " + pl2.getAttempt() + " ой попытки");
				pl2.setNumberPlayer(i, playerNum2);
				break;
			}
			if (i == 9) {
				System.out.println(pl2.getName() + " Вы не угадали число у вас закончились попытки");
			}
		}
		System.out.print(pl1.getName() + " Ваши числа ");
		for (int i = 0; i < pl1.getNumberPlayerCopy().length; i++) {
			System.out.print(pl1.getNumberPlayerCopy()[i] + " ");
		}
		System.out.print("\n" + pl2.getName() + " Ваши числа ");
		for (int i = 0; i < pl2.getNumberPlayerCopy().length; i++) {
			System.out.print(pl2.getNumberPlayerCopy()[i] + " ");
		}
	}
}