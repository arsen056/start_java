class Calc {
	public static void main(String[] args) {
		double a = 2;
		double b = 6;

		char znak = '^';

		if (znak == '+') {
			System.out.println(a+b);
		}

		else if (znak == '-') {
			System.out.println(a-b);
		}

		else if (znak == '/') {
			System.out.println(a/b);
		}

		else if (znak == '*') {
			System.out.println(a*b);
		}

		else if (znak == '%') {
			System.out.println(a%b);
		}

		else if (znak == '^') {
			if (b==0){
				System.out.println(1);
			}
			
			int res = 1;
			for (int c=1; c<=b; c++){
				res*=a;				
			}

			System.out.println(res*=1);
		}
	}
}