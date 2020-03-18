import java.util.Scanner;

class GuessNumber {
	String name1, name2;
	
	GuessNumber(Player pl1, Player pl2) {
		this.name1 = pl1.getName();
		this.name2 = pl2.getName();
	}

	public void guessNumber(Player pl1, Player pl2) {
		Scanner scanner = new Scanner(System.in);		
		int randNum = (int) (Math.random() * 101);
		System.out.println("игра началась! загаданное число " + randNum);		
		System.out.println(name1 + " введите число");		
		int playerNum1 = -1;
		int playerNum2 = -1;

		do {
			if (playerNum1 == randNum || playerNum2 == randNum) {
				randNum = (int) (Math.random() * 101);
				System.out.println("игра началась! загаданное число " + randNum);
			}

			pl1.setNumUser(scanner.nextInt());
			playerNum1 = pl1.getNum();
			if (playerNum1 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + name2);
			} else if (playerNum1 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + name2);
			} else if (playerNum1 == randNum) {
				System.out.println(name1 + " угадал число");
				break;		
			}

			pl2.setNumUser(scanner.nextInt());
			playerNum2 = pl2.getNum();
			if (playerNum2 > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + name1);
			} else if (playerNum2 < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + name1);
			} else if (playerNum2 == randNum) {
				System.out.println(name2 + " угадал число");
				break;							
			}						
		} while (true);		
	}
}