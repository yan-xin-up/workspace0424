package buzz.xinyan.java.exer1;

public class GeometricTest {
	public static void main(String[] args) {
		Circle yuan = new Circle("brown", 10, 1);
		MyRectangle ju = new MyRectangle("red", 10, 1, 10, 10);
		GeometricTest test = new GeometricTest();
		System.out.println(test.equalsArea(yuan, ju));
		System.out.println(test.displayGeometricObject(yuan));
		System.out.println(test.displayGeometricObject(ju));
	}				

	public boolean  equalsArea(GeometricObject o1,GeometricObject o2) {
		return o1.findArea()==o2.findArea();
	}

	public double displayGeometricObject(GeometricObject o) {
		return o.findArea();
	}
}
