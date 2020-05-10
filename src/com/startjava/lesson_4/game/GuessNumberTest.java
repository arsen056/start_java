package com.startjava.lesson_4.game;

import java.util.Scanner;

class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		String next;

		do {
			System.out.println("Введите имя первого пользователя");
			Player player1 = new Player(scanner.nextLine());

			System.out.println("Введите имя второго пользователя");
			Player player2 = new Player(scanner.nextLine());

			GuessNumber guessNum = new GuessNumber(player1, player2);
			guessNum.guessNumber();
			
			System.out.println("\n Хотите продолжить?");
			do {
				next = scanner.nextLine();
				switch (next) {
					case "нет":
						System.out.println("игра закончена");	
						break;									
					case "да":
						System.out.println("игра началась заново");
						break;				
					default:							
						System.out.println("Введите ответ еще раз");
				}
			} while (!next.equals("да") && !next.equals("нет"));
		} while (next.equals("да"));		
	}
}