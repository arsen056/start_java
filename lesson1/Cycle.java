class Cycle {
	
	public static void main(String[] args) {		
		// Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}		
		System.out.println();

		//Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int iterStep2 = 6;
		while (iterStep2 != -8) {
			System.out.println(iterStep2);
			iterStep2-=2;	
		}		
		System.out.println();

		//Сумма нечетных чисел от 10 до 20
		int rangeNumb=11;
		int sumRange = 11;		 
		do {
			rangeNumb += 2;
			sumRange = sumRange + rangeNumb;

		} while(rangeNumb < 19);
		System.out.println(sumRange);
	}
}