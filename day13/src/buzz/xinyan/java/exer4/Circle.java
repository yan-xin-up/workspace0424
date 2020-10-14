package buzz.xinyan.java.exer4;

public class Circle extends GeometricObject {
	private double radious;

	public Circle() {
		super();
		radious = 1.0;
	}

	public Circle(double radious) {
		super();
		this.radious = radious;
	}

	public Circle(String color, double weight, double radious) {
		super(color, weight);
		this.radious = radious;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	public double findArea() {
		return Math.PI * Math.pow(radious, 2);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			return this.radious == c.radious;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Circle [radious ="+radious+"]";
	}
}
