package buzz.xinyan.java2;

public class Interface3 {
	public static void main(String[] args) {
		ComparableRectangle c1 = new ComparableRectangle(1, 10);
		ComparableRectangle c2 = new ComparableRectangle(10, 10);
		System.out.println(c1.compareTo(c2));
	}
}
