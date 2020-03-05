
import java.util.*;

class MyFirstGame {
	public static void main(String[] args) {
		int a =(int) (Math.random()*100);
		Scanner scanner = new Scanner(System.in);
		
		boolean isBool = true;
		System.out.println("загаданное число " + a);
		System.out.println("Введите число");
		while(isBool) {
			int numberUser = scanner.nextInt();

			if (numberUser>a){
				System.out.println("Повторите попытку, ваше число больше загаданного числа");
			}

			else if (numberUser<a) {
				System.out.println("Повторите попытку, ваше число меньше загаданного числа");
			}

			else if (numberUser==a) {
				System.out.println("Вы угадали число");
				isBool = false;
			}
		}
	}
}