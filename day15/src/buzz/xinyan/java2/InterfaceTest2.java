package buzz.xinyan.java2;

public class InterfaceTest2 {
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(1.375);
		ComparableCircle c2 = new ComparableCircle(3.1415926);
		System.out.println(c1.compareTo(c2));
	}
}
