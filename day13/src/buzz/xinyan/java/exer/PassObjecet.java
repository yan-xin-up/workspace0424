package buzz.xinyan.java.exer;

public class PassObjecet {
	public static void main(String[] args) {
		PassObjecet test = new PassObjecet();
		Circle c = new Circle();
		test.printAreas(c, 5);
		System.out.println("now radius is 	"+c.radius);
	}

	public void printAreas(Circle c, int time) {

		System.out.println("Radius\t\t\tArea	");
		for (double i = 1; i <= time; i++) {
			c.radius = i;
			double area = c.findArea();
			System.out.println(c.radius + "\t\t\t" + area);
		}
		
		c.radius = time+1;

	}

}
