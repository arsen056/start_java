package com.startjava.lesson2_3.robot;

class JaegerTest {
	
	public static void main(String[] args) {			
		// Реализация чере конструкторы			
		Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", 2.004, 81);
		gipsyAvenger.getJaeger(gipsyAvenger);
		//Реализация через методы (геттеры)
		System.out.println("Model name: " + gipsyAvenger.getModelName());
		System.out.println("Mark: " + gipsyAvenger.getMark());
		System.out.println("Weight: " + gipsyAvenger.getWeight() + " tons");
		System.out.println("Height: " + gipsyAvenger.getHeight() + " m");
		System.out.println();

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 1.980, 79);		
		gipsyDanger.getJaeger(gipsyDanger);
		System.out.println();		
		System.out.println("Model name: " + gipsyDanger.getModelName());
		System.out.println("Mark: " + gipsyDanger.getMark());
		System.out.println("Weight: " + gipsyDanger.getWeight() + " tons");
		System.out.println("Height: " + gipsyDanger.getHeight() + " m");
		System.out.println("Origin: " + gipsyDanger.getOrigin());				
	}
}