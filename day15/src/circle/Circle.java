package circle;

import shape.Shape;

public class Circle implements Shape {

	private double radious;
	

	public Circle() {
		super();
	}


	public Circle(double radious) {
		super();
		this.radious = radious;
	}


	public double getRadious() {
		return radious;
	}


	public void setRadious(double radious) {
		this.radious = radious;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*Math.pow(getRadious(),2);
	}
	public double getPerimeter() {
		return PI*2*getRadious();
	}
	
}
