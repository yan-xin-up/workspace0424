package buzz.xinyan.java.exe;

public class Cylinder extends Circle {
	private double length;
	public Cylinder() {
		length = 1;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return super.findArea()*getLength();
//		return Math.PI*Math.pow(getRadious(), 2)*getLength();
	}
	@Override
	public double findArea() {
		return Math.PI*Math.pow(getRadious(),2)*2+2*Math.PI*
				getRadious()*getLength();
	}
}
