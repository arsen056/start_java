class ConditionalStatement {
	public static void main(String[] args) {		
		int age = 25;
		if (age > 20) {
			System.out.println("Ваш возраст больше 20");
		}		
		boolean isMale  = true;
		if (isMale == true) {
			System.out.println("Пол мужской");
		} else if (isMale == false) {
			System.out.println("Пол не мужской");
		}
		double weight = 1.90;
		if (weight < 1.80) {
			System.out.println("Пол мужской");
		} else {
			System.out.println("Рост больше 1.80");
		}
		char firstSymbName = 'M';
		if (firstSymbName == 'M') {
			System.out.println("Первая буква М");
		} else if (firstSymbName == 'I') {
			System.out.println("Первая буква I");
		} else {
			System.out.println("Первая буква имени "+ firstSymbName);
		}		
	}
}