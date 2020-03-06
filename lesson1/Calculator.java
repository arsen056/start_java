class Calculator {
	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		char mathematicalOperation = '^';

		if (mathematicalOperation == '+') {
			System.out.println(a+b);
		}
		else if (mathematicalOperation == '-') {
			System.out.println(a-b);
		} else if (mathematicalOperation == '/') {
			System.out.println(a/b);
		} else if (mathematicalOperation == '*') {
			System.out.println(a*b);
		} else if (mathematicalOperation == '%') {
			System.out.println(a%b);
		} else if (mathematicalOperation == '^') {				
			int res = 1;
			for (int i = 1; i <= b; i++){
				res *= a;				
			}

			System.out.println(res);
		}
	}
}