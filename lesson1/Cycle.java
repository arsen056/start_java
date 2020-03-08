class Cycle {	
	public static void main(String[] args) {		
		// Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}		
		System.out.println();
		//Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int counter = 6;
		while (counter != -8) {
			System.out.println(counter);
			counter -= 2;	
		}		
		System.out.println();
		//Сумма нечетных чисел от 10 до 20
		int rangeNumb = 10;
		int sumOdd = 0;	 
		do {
			rangeNumb++;
			if (rangeNumb % 2 != 0) {			
				sumOdd = sumOdd + rangeNumb;
			}
		} while(rangeNumb < 20);
		System.out.println(sumOdd);
	}
}