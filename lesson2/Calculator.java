class Calculator {
	public void сalculate(double firstNum, char mathOperation, double secondNum) {			
						
		switch (mathOperation) {
			case '-':
				System.out.println("Ответ: " + (firstNum - secondNum));
				break;
			case '+':
				System.out.println("Ответ: " + (firstNum + secondNum));
				break;
			case '/':
				System.out.println("Ответ: " + (firstNum / secondNum));
				break;
			case '*':
				System.out.println("Ответ: " + (firstNum * secondNum));
				break;
			case '%':
				System.out.println("Ответ: " + (firstNum % secondNum));
				break;
			case '^':			
				int res = 1;
				for (int i = 1; i <= secondNum; i++) {
					res *= firstNum;				
				}
				System.out.println("Ответ: " + res);
				break;
		}	
	}	
}