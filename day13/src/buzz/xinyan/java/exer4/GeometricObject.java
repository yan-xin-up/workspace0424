package buzz.xinyan.java.exer4;

public class GeometricObject {
	protected String color;
	protected double weight;
	
	protected GeometricObject() {
		super();
		color = "white";
		weight = 1.0;
	}

	protected GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	int show(int a,int b) {
		return 0;
	}
	
}
