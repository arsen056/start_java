import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String proceed;
		boolean isContinue = true;
		Scanner scanner = new Scanner (System.in);
		Calculator calc = new Calculator();
		
		do {
			System.out.println("Введите первое число");
			double firstNum = scanner.nextDouble();
			System.out.println("Введите знак математ. операции");
			char mathOperation = scanner.next().charAt(0);
			System.out.println("Введите второе число");
			double secondNum = scanner.nextDouble();

			calc.сalculate(firstNum, mathOperation, secondNum);

			System.out.println("Вы хотите продолжить? [да/нет]");
			scanner.nextLine();							
			do {
				proceed = scanner.nextLine();
				switch (proceed) {
					case "нет":
						isContinue = false;				
						break;
					case "да":
						System.out.println("введите число");
						continue;
					default:							
						System.out.println("Введите ответ еще раз");					
				}
			} while (proceed.equals("нет") == false && proceed.equals("да") == false);	
		} while(isContinue);
	}
}