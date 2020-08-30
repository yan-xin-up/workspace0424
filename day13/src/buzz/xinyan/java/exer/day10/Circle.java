package buzz.xinyan.java.exer.day10;

public class Circle {
	private double radious;
	
	public Circle(double radious) {
		super();
		this.radious = radious;
	}
	public Circle() {
		
	}

	public double getCircumference() {
		return 2 * Math.PI * radious;
	}
	
	public double getArea() {
		return Math.PI * radious *radious; 
	}
	
}
