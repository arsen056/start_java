class Cycle {
	
	public static void main(String[] args) {		
		// Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {

			System.out.println(i);
		}		
		System.out.println();		
		//Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		boolean b = true;
		int c = 8;
		while (b) {
			c-=2;
			System.out.println(c);
			
			if (c == -6) {
				b = false;
			}
		}		
		System.out.println();
		//Сумма нечетных чисел от 10 до 20
		int a=11;
		int g = 11;
		 
		do {
			a+=2;
			g = g + a;

		} 
		
		while(a<19);
		System.out.println(g);
	}

}