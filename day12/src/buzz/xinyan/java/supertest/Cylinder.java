package buzz.xinyan.java.supertest;

public class Cylinder extends Circle {
	private double length;

	public Cylinder() {
		super();
		length = 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {
		return super.findArea()*getLength();
	}
	
	@Override
	public double findArea() {
		return super.findArea()*2+2*Math.PI*getRadious()*getLength();
	}
}
