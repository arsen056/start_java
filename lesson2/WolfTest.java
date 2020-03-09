class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();
		System.out.println("Пол: " + wolf1.gender);
		System.out.println("Возраст: " + wolf1.age);
		System.out.println("Кличка: " + wolf1.nickname);
		System.out.println("Вес: " + wolf1.weight);
		System.out.println("Цвет: " + wolf1.color);

		wolf1.sit();
		wolf1.go();
		wolf1.run();
		wolf1.howls();
		wolf1.hunt();
	}
}