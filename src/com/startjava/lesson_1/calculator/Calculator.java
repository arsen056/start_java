package com.startjava.lesson_1.calculator;

class Calculator {
	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		char mathOperation = '^';

		if (mathOperation == '+') {
			System.out.println(a + b);
		} else if (mathOperation == '-') {
			System.out.println(a - b);
		} else if (mathOperation == '/') {
			System.out.println(a / b);
		} else if (mathOperation == '*') {
			System.out.println(a * b);
		} else if (mathOperation == '%') {
			System.out.println( a % b);
		} else if (mathOperation == '^') {				
			int res = 1;
			for (int i = 1; i <= b; i++) {
				res *= a;				
			}
			System.out.println(res);
		}
	}
}