class JaegerTest {
	public static void main(String[] args) {
		//Реализация через методы (сеттеры)
		/*		
		Jaeger gipsyAvenger = new Jaeger();
		System.out.println("Model name: " + gipsyAvenger.setModelName("Gipsy Avenger"));
		System.out.println("Mark: " + gipsyAvenger.setMark("Mark-6"));
		System.out.println("Weight: " + gipsyAvenger.setWeight(2.004) + " tons");
		System.out.println("Height: " + gipsyAvenger.setHeight(81) + " m");

		System.out.println();
		Jaeger gipsyDanger  = new Jaeger();
		System.out.println("Model name: " + gipsyDanger.setModelName("Gipsy Danger"));
		System.out.println("Mark: " + gipsyDanger.setMark("Mark-3"));
		System.out.println("Weight: " + gipsyDanger.setWeight(1.980) + " tons");
		System.out.println("Height: " + gipsyDanger.setHeight(79) + " m");
		System.out.println("Origin: " + gipsyDanger.setOrigin("USA"));		
		*/

		// Реализация чере конструкторы		
		Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", 2.004, 81);
		gipsyAvenger.getJaeger(gipsyAvenger);

		System.out.println();

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 1.980, 79);		
		gipsyDanger.getJaeger(gipsyDanger);			
	}
}