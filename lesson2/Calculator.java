import java.util.Scanner;
class Calculator {	
	public void сalc() {
		Scanner scanner = new Scanner(System.in);
		boolean isCalculate = true;
		String proceed;
		double firstNum, secondNum;
		do {
			System.out.println("Введите первое число");
			firstNum = scanner.nextDouble();
			System.out.println("Введите знак математической операции");
			char mathOperation = scanner.next().charAt(0);
			System.out.println("Введите второе число");
			secondNum = scanner.nextDouble();
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
					for (int i = 1; i <= secondNum; i++){
						res *= firstNum;				
					}
					System.out.println("Ответ: " + res);
					break;
			}			
			scanner.nextLine();
			System.out.println("Вы хотите продолжить? [да/нет]");
			proceed = scanner.nextLine();			
			switch (proceed) {
				case "нет":					
					isCalculate = false;
					break;
				default:
					continue;					
			}			
		} while(isCalculate);
	}	
}