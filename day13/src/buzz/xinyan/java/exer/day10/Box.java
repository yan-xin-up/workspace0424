package buzz.xinyan.java.exer.day10;

public class Box {
	private double length;
	private double width;
	private double height;

	public Box() {

	}

	public Box(double length, double width, double height) {
		this.height = height;
		this.length = length;
		this.width = width;

	}
	public double getVolume() {
		return height * length * width;
	}
}
