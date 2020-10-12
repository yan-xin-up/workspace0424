package buzz.xinyan.java.exer1;

public class GeometricObject {
	protected String color;
	protected double weight;

	protected GeometricObject() {
		super();
	}
	protected GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double findArea() {
		return 0.0;
	}
	
}
