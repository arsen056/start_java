import java.util.Scanner;

class CalculatorTest {
	public static void main(String[] args) {
		String next;
		boolean isContinue;
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