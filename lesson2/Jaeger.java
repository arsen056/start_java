public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private double weight;
	private double height;
	
	Jaeger (String modelName, String mark, String origin, double weight, double height) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.weight = weight;
		this.height = height;
	}

	Jaeger (String modelName, String mark, double weight, double height) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = null;
		this.weight = weight;
		this.height = height;
	}

	Jaeger (){

	}

	public void getJaeger(Jaeger j1) {
		System.out.println("Model name: " + j1.modelName);
		System.out.println("Mark : " + j1.mark);
		if (j1.origin != null) {
			System.out.println("Origin : " + j1.origin);
		}
		System.out.println("Weight : " + j1.weight);
		System.out.println("height : " + j1.height);
	}	
	
	String setModelName(String modelName) {
		return modelName = modelName;
	}

	String setMark(String mark) {
		return mark = mark;
	}

	String setOrigin(String origin) {
		return origin = origin;
	}

	double setWeight(double weight) {
		return weight = weight;
	}

	double setHeight(double height) {
		return height = height;
	}	
}