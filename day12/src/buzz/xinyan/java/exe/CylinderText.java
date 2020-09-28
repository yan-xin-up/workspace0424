package buzz.xinyan.java.exe;

public class CylinderText {
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setRadious(17.5);
		c.setLength(10);
		double findArea = c.findArea();
		System.out.println("面积为： "+findArea+".");
		double findVolume = c.findVolume();
		System.out.println("体积为： "+findVolume+".");
		
	}
}
