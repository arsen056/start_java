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
			playerNum1 = scanner.nextInt();
			pl1.inputNumbers(playerNum1, randNum, i);
			if (playerNum1 == randNum) {
				break;
			}

			if (i == 9) {
				System.out.println(pl1.getName() + " Вы не угадали число у вас закончились попытки");
			}

			System.out.println(pl2.getName() + " введите число");
			playerNum2 = scanner.nextInt();
			pl2.inputNumbers(playerNum2, randNum, i);
			if (playerNum2 == randNum) {
				break;
			}

			if (i == 9) {
				System.out.println(pl2.getName() + " Вы не угадали число у вас закончились попытки");
			}
		}
		System.out.print(pl1.getName() + " Ваши числа ");
		pl1.outputNumbers();
		pl1.fill(0);
		System.out.print("\n" + pl2.getName() + " Ваши числа ");
		pl2.outputNumbers();
		pl2.fill(0);
	}
}