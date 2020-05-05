package com.startjava.lesson_4.calculator;

class Calculator {

	public void сalculate(String mathExpression) {
		String [] splitMathExpression = mathExpression.split(" ");
		int firstNum, secondNum;
		firstNum = Integer.parseInt(splitMathExpression [0]);
		secondNum = Integer.parseInt(splitMathExpression [2]);

		switch (splitMathExpression[1]) {
			case "-":
				System.out.println("Ответ: " + Math.subtractExact(firstNum, secondNum));
				break;
			case "+":
				System.out.println("Ответ: " + Math.addExact(firstNum, secondNum));
				break;
			case "/":
				System.out.println("Ответ: " + Math.floorDiv(firstNum, secondNum));
				break;
			case "*":
				System.out.println("Ответ: " + Math.multiplyExact(firstNum, secondNum));
				break;
			case "%":
				System.out.println("Ответ: " + (firstNum % secondNum));
				break;
			case "^":
				System.out.println(Math.pow(firstNum, secondNum));
				break;
		}	
	}
}