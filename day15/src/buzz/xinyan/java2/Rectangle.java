package buzz.xinyan.java2;

public class Rectangle {
	private double lengeth;
	private double width;
	
	public Rectangle(double lengeth, double width) {
		super();
		this.lengeth = lengeth;
		this.width = width;
	}

	public Double findArea() {
		
		Double c = lengeth*width;
		return c;
	}

}
