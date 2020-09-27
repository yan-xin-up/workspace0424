package buzz.xinyan.java.exe;

public class Circle {
	private double radious;

	public Circle() {
		radious = 1;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	public double findArea() {
		
		return Math.PI * Math.pow(getRadious(), 2);
		
		
	}

}
