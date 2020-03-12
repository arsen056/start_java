import java.util.*;

class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		GuessNumber guessNum = new GuessNumber();

		System.out.println("Введите имя первого пользователя");
		String name1 = scanner.nextLine();
		Player player1 = new Player(name1);

		System.out.println("Введите имя второго пользователя");
		String name2 = scanner.nextLine();
		Player player2 = new Player(name2);
		guessNum.startGame(player1, player2);
	}
}