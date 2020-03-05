
import java.util.*;

class MyFirsGame {
	public static void main(String[] args) {
		int a =(int) (Math.random()*100);
		Scanner scanner = new Scanner(System.in);
		
		boolean bool = true;
		System.out.println("загаданное число " + a);
		System.out.println("Введите число");
		while(bool) {
			int number_user = scanner.nextInt();

			if (number_user>a){
				System.out.println("Повторите попытку, ваше число больше загаданного числа");
			}

			else if (number_user<a) {
				System.out.println("Повторите попытку, ваше число меньше загаданного числа");
			}

			else if (number_user==a) {
				System.out.println("Вы угадали число");
				bool = false;
			}

		}

	}

}