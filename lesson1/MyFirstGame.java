import java.util.*;

class MyFirstGame {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int randNumb =(int) (Math.random()*100);		
		System.out.println("загаданное число " + randNumb);
		System.out.println("Введите число");
		int numberUser;		
		do {
			numberUser = scanner.nextInt();
			if (numberUser > randNumb) {
				System.out.println("Повторите попытку, ваше число больше загаданного числа");
			} else if (numberUser < randNumb) {
				System.out.println("Повторите попытку, ваше число меньше загаданного числа");
			} 
		} while (numberUser != randNumb);
		System.out.println("Вы угадали число");
	}
}