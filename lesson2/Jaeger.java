public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private double weight;
	private double height;
	
	Jaeger(String modelName, String mark, String origin, double weight, double height) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.weight = weight;
		this.height = height;
	}

	Jaeger(String modelName, String mark, double weight, double height) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = null;
		this.weight = weight;
		this.height = height;
	}

	public void getJaeger(Jaeger j1) {
		System.out.println("Model name: " + j1.modelName);
		System.out.println("Mark : " + j1.mark);
		if (j1.origin != null) {
			System.out.println("Origin : " + j1.origin);
		}
		System.out.println("Weight : " + j1.weight);
		System.out.println("height : " + j1.height);
		System.out.println();
	}	
	
	String getModelName() {
		return modelName;
	}

	String getMark() {
		return mark;
	}

	String getOrigin() {
		return origin;
	}

	double getWeight() {
		return weight;
	}

	double getHeight() {
		return height;
	}	
}