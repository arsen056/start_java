class Cycle {	
	public static void main(String[] args) {		
		// Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}		
		System.out.println();
	
		int counter = 6;
		while (counter != -8) {
			System.out.println(counter);
			counter -= 2;	
		}		
		System.out.println();
		
		int rangeNum = 10;
		int sumOdd = 0;	 
		do {
			rangeNum++;
			if (rangeNum % 2 != 0) {			
				sumOdd += rangeNum;				
			}
		} while(rangeNum < 20);
		System.out.println(sumOdd);
	}
}