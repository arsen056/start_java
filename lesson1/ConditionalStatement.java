
class ConditionalStatement {

	public static void main(String[] args) {
		int age = 25;
		char pol = 'm';
		double weight = 1.90;
		char pervBukvaImeni = 'M';

		if (age > 20) {
			System.out.println("Ваш возраст больше 20");
		}

		if (pol == 'm') {
			System.out.println("Пол мужской");
		}

		if (pol != 'm') {
			System.out.println("Пол не мужской");
		}

		if (weight < 1.80) {
			System.out.println("Пол мужской");
		}
		else {
			System.out.println("Рост больше 1.80");

		}

		if (pervBukvaImeni == 'M') {
			System.out.println("Первая буква М");
		}
		else if (pervBukvaImeni == 'I') {
			System.out.println("Первая буква I");
		}
		else {
			System.out.println("Первая буква имени "+ pervBukvaImeni);

		}		
	}

}