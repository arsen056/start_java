package com.startjava.lesson2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String next, mathExpression;
		boolean isContinue;
		Scanner scanner = new Scanner (System.in);
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
						isContinue = false;									
						break;
					case "да":
						System.out.println("введите число");
						isContinue = false;
						break;
					default:							
						System.out.println("Введите ответ еще раз");
						isContinue = true;															
				}
			} while (isContinue);	
		} while (next.equals("да"));
	}
}