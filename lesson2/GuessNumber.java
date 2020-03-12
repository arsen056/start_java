import java.util.*;

class GuessNumber {
	public void startGame(Player pl1, Player pl2) {
		Scanner scanner = new Scanner(System.in);		
		int randNum = (int) (Math.random()*101);
		System.out.println("игра началась! загаданное число " + randNum);		
		System.out.println(pl1.setName(pl1) + " введите число");			
		String proceed;
		int playerNum1 = -1;
		int playerNum2 = -1;
		
		OUTER:
		while(true) {
			if (playerNum1 == randNum || playerNum2 == randNum) {
				randNum = (int) (Math.random()*101);
				System.out.println("игра началась! загаданное число " + randNum);
			}

			playerNum1 = pl1.setNumUser(scanner.nextInt());
			if (playerNum1 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + pl2.setName(pl2));
			} else if (playerNum1 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + pl2.setName(pl2));
			} else if (playerNum1 == randNum) {
				System.out.println(pl1.setName(pl1) + " угадал число");
				scanner.nextLine();
				System.out.println("Вы хотите продолжить? [да/нет]");							
				do {
					proceed = scanner.nextLine();
					switch (proceed) {
						case "нет":				
							break OUTER;
						case "да":
							System.out.println(pl1.setName(pl1) + " введите число");
							continue OUTER;
						default:							
							System.out.println("Введите ответ еще раз");					
					}
				} while (proceed != "нет" && proceed != "да");				
			}

			playerNum2 = pl2.setNumUser(scanner.nextInt());
			if (playerNum2 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + pl1.setName(pl1));
			} else if (playerNum2 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + pl1.setName(pl1));
			} else if (playerNum2 == randNum) {
				System.out.println(pl2.setName(pl2) + " угадал число");
				System.out.println("Вы хотите продолжить? [да/нет]");
				scanner.nextLine();							
				do {
					proceed = scanner.nextLine();
					switch (proceed) {
						case "нет":				
							break OUTER;
						case "да":
							System.out.println(pl1.setName(pl1) + " введите число");
							continue OUTER;
						default:							
							System.out.println("Введите ответ еще раз");					
					}
				} while (proceed != "нет" && proceed != "да");				
			}						
		} 		
	}
}