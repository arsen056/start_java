import java.util.Scanner;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name1, name2;
		String proceed;
		boolean isContinue = true;	

		do {
			System.out.println("Введите имя первого пользователя");
			name1 = scanner.nextLine();
			Player player1 = new Player(name1);			

			System.out.println("Введите имя второго пользователя");
			name2 = scanner.nextLine();	
			Player player2 = new Player(name2);

			GuessNumber guessNum = new GuessNumber(player1, player2);
			
			System.out.println("Хотите продолжить?");			

			do {
				proceed = scanner.nextLine();
				switch (proceed) {
					case "нет":
						isContinue = false;
						System.out.println("игра закончена");	
						break;									
					case "да":
						System.out.println("игра началась заново");
						break;				
					default:							
						System.out.println("Введите ответ еще раз");					
				}
			} while (proceed.equals("нет") == false && proceed.equals("да") == false);

		} while (isContinue);		
	}
}