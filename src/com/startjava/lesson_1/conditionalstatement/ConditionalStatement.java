package com.startjava.lesson_1.conditionalstatement;

class ConditionalStatement {
	public static void main(String[] args) {		
		int age = 25;
		if (age > 20) {
			System.out.println("Ваш возраст больше 20");
		}	

		boolean isMale  = true;
		if (isMale) {
			System.out.println("Пол мужской");
		} else if (!isMale) {
			System.out.println("Пол не мужской");
		}

		double weight = 1.90;
		if (weight < 1.80) {
			System.out.println("Пол мужской");
		} else {
			System.out.println("Рост больше 1.80");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("Первая буква М");
		} else if (firstNameLetter == 'I') {
			System.out.println("Первая буква I");
		} else {
			System.out.println("Первая буква имени "+ firstNameLetter);
		}		
	}
}