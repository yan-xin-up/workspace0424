package buzz.xinyan.java.exer4;

public class GeometricTest {
	public static void main(String[] args) {
		Circle c1 = new Circle("white", 10, 10);
		Circle c2 = new Circle("red", 1.0, 1.0);
		Circle c3 = new Circle(1.5);
		Circle c4 = new Circle();
		// color
		System.out.println("颜色是否相等："+c1.getColor().equals(c2.getColor()));
		System.out.println("颜色是否相等："+c1.getColor().equals(c4.getColor()));
		// radious ==
		System.out.println("半径是否相等："+c2.equals(c4));
		//print radious
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
	}
}
