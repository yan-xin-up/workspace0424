package buzz.xinyan.java.exer.last;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("green", "ddd1");
		System.out.println("汽车颜色：" + c1.getColor() +"型号是：" + c1.getType() );
		Car c2 = new Car("brown", "bdd1");
		System.out.println("汽车颜色：" + c2.getColor() +"型号是：" + c2.getType() );
		System.out.println("两个对象是否相同："+ c1.equals(c2) );
	}
}

class Car {
	private String color;
	private String type;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	protected Car() {
		super();
	}

	protected Car(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car[ color =" + color + " ,type =" + type + ".]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Car) {
			Car c = (Car) obj;
			return this.color.equals(c.color) && this.type.equals(c.type);
		}
		return false;
	}
}
