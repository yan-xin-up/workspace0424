package buzz.xinyan.java.supertest;

public class Circle {
	private double radious;

	public Circle() {
		super();
		radious = 1.0;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	
	public double findArea() {
		return Math.PI*Math.pow(radious, 2);
	}
	
}
