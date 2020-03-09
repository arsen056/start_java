class Jaeger {
	String modelName;
	String mark;
	String origin;
	double weight;
	double height;

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

	String setModelName (String modelName) {
		return modelName = modelName;
	}

	String setMark (String mark) {
		return mark = mark;
	}

	String setOrigin (String origin) {
		return origin = origin;
	}

	double setWeight (double weight) {
		return weight = weight;
	}

	double setHeight (double height) {
		return height = height;
	}
}