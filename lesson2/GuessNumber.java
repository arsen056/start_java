import java.util.Scanner;

class GuessNumber {	
	private Player pl1;
	private Player pl2;
	
	GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}

	public void guessNumber() {				
		int randNum = (int) (Math.random() * 101);
		System.out.println("игра началась! загаданное число " + randNum);		
		System.out.println(pl1.getName() + " введите число");		
		int playerNum1, playerNum2;		
		Scanner scanner = new Scanner(System.in);

		do {
			pl1.setNumber(scanner.nextInt());
			playerNum1 = pl1.getNumber();
			if (playerNum1 > randNum) {
				System.out.println("Ваше число больше загаданного числа \n\n" + pl2.getName() + " введите число");
			} else if (playerNum1 < randNum) {
				System.out.println("Ваше число меньше загаданного числа \n\n" + pl2.getName() + " введите число");
			} else if (playerNum1 == randNum) {
				System.out.println(pl1.getName() + " угадал число");
				break;		
			}

			pl2.setNumber(scanner.nextInt());
			playerNum2 = pl2.getNumber();
			if (playerNum2 > randNum) {
				System.out.println("Ваше число больше загаданного числа \n\n" + pl1.getName() + " введите число");
			} else if (playerNum2 < randNum) {
				System.out.println("Ваше число меньше загаданного числа \n\n" + pl1.getName() + " введите число");
			} else if (playerNum2 == randNum) {
				System.out.println(pl2.getName() + " угадал число");
				break;							
			}						
		} while (true);		
	}
}