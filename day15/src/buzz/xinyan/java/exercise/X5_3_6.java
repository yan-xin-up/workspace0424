package buzz.xinyan.java.exercise;

import circle.Circle;
import cylinder.Cylinder;

public class X5_3_6 {
	public static void main(String[] args) {
		Circle cir1 = new Circle(10);
		Circle cir2 = new Circle(100);
		System.out.println(cir1.getArea());
		System.out.println(cir1.getPerimeter());
		System.out.println(cir2.getArea());
		System.out.println(cir2.getPerimeter());
		System.out.println("*************************************");
		Cylinder cy1 = new Cylinder(10, 10);
		Cylinder cy2 = new Cylinder(1, 1);
		System.out.println(cy1.findArea());
		System.out.println(cy1.getVolume());
		System.out.println(cy2.findArea());
		System.out.println(cy2.getVolume());
		
		
	}

}
