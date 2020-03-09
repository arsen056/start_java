import java.util.*;

class MyFirstGame {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int randNum =(int) (Math.random() * 101);		
		System.out.println("загаданное число " + randNum);
		System.out.println("Введите число");
		int userNum;		
		do {
			userNum = scanner.nextInt();
			if (userNum > randNum) {
				System.out.println("Повторите попытку, ваше число больше загаданного числа");
			} else if (userNum < randNum) {
				System.out.println("Повторите попытку, ваше число меньше загаданного числа");
			} 
		} while (userNum != randNum);
		System.out.println("Вы угадали число");
	}
}