import java.util.Scanner;

class GuessNumber {
	GuessNumber(Player pl1, Player pl2) {
		Scanner scanner = new Scanner(System.in);		
		int randNum = (int) (Math.random()*101);
		System.out.println("игра началась! загаданное число " + randNum);		
		System.out.println(pl1.getName() + " введите число");			
		String proceed;
		int playerNum1 = -1;
		int playerNum2 = -1;

		do {
			if (playerNum1 == randNum || playerNum2 == randNum) {
				randNum = (int) (Math.random()*101);
				System.out.println("игра началась! загаданное число " + randNum);
			}

			pl1.setNumUser(scanner.nextInt());
			playerNum1 = pl1.getNum();
			if (playerNum1 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + pl2.getName());
			} else if (playerNum1 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + pl2.getName());
			} else if (playerNum1 == randNum) {
				System.out.println(pl1.getName() + " угадал число");
				break;		
			}

			pl2.setNumUser(scanner.nextInt());
			playerNum2 = pl2.getNum();
			if (playerNum2 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + pl1.getName());
			} else if (playerNum2 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + pl1.getName());
			} else if (playerNum2 == randNum) {
				System.out.println(pl2.getName() + " угадал число");
				break;							
			}						
		} while ((playerNum1 != randNum || playerNum2 != randNum) || (playerNum1 != randNum && playerNum2 != randNum));		
	}
}