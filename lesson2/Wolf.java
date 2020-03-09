class Wolf {
	private String gender;
	private String nickname;
	private double weight;
	private int age;
	private String color = "red";

	public String setGender (String gender) {
		return gender = gender;
	}

	public String setNickname (String nickname) {
		return nickname = nickname;
	}

	public double setWeight (double weight) {
		return weight = weight;
	}

	public void setAge (int age2) {
		if (age2 > 8) {
			System.out.println("Некоректный возраст");
		} else {
			age = age2;
			System.out.println("Возраст: " + age);
		}
	}

	public String setColor (String color) {	
		return color = color;
	}

	public String getColor() {
		return color;
	}

	public void go () {
		System.out.println("Волк идет");
	}

	public void sit () {
		System.out.println("Волк сидит");
	}

	public void run () {
		System.out.println("Волк бежит");
	}

	public void howls () {
		System.out.println("Волк воет");
	}
	
	public void hunt () {
		System.out.println("Волк охотиться");
	}
}