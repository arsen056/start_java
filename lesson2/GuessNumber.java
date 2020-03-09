import java.util.*;
class GuessNumber {
	void guessNum () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя первого пользователя");
		String name1 = scanner.nextLine();
		Player player1 = new Player(name1, 0);

		System.out.println("Введите имя второго пользователя");
		String name2 = scanner.nextLine();
		Player player2 = new Player(name2, 0);
		
		int randNum = (int) (Math.random()*101);		
		System.out.println("загаданное число " + randNum);
		System.out.println(player1.name_user(player1) + " введите число");		
		do {
			player1.number = scanner.nextInt();
			if (player1.number > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + player2.name_user(player2));
			} else if (player1.number < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + player2.name_user(player2));
			} else if (player1.number == randNum) {
				System.out.println(player1.name_user(player1) + " угадал число");
				break;
			}
			player2.number = scanner.nextInt();
			if (player2.number > randNum) {
				System.out.println("Ваше число больше загаданного числа, повторите попытку, сейчас очередь " + player1.name_user(player1));
			} else if (player2.number < randNum) {
				System.out.println("Ваше число меньше загаданного числа, повторите попытку позже, сейчас очередь " + player1.name_user(player1));
			} else if (player2.number == randNum) {
				System.out.println(player2.name_user(player2) + " угадал число");
				break;
			}
		} while(player1.number != randNum && player2.number != randNum);		
	}
}