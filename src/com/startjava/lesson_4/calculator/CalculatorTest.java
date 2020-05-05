package com.startjava.lesson_4.calculator;

import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String next, mathExpression;
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		do {
			System.out.println("Введите математическое выражение");
			mathExpression = scanner.nextLine();

			calc.сalculate(mathExpression);

			System.out.println("Вы хотите продолжить? [да/нет]");

			do {
				next = scanner.nextLine();
				switch (next) {
					case "нет":
						System.out.println("игра закончена");
						break;
					case "да":
						System.out.println("введите число");
						break;
					default:							
						System.out.println("Введите ответ еще раз");
				}
			} while (!next.equals("да") && !next.equals("нет"));
		} while (next.equals("да"));
	}
}