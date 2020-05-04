package com.startjava.lesson2_3.calculator;

class Calculator {

	public void сalculate(String mathExpression) {
        String [] mathArray = mathExpression.split(" ");
        int firstNum, secondNum;
        char mathOperation;
		firstNum = Integer.parseInt(mathArray [0]);
		secondNum = Integer.parseInt(mathArray [2]);

		switch (mathArray[1]) {
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