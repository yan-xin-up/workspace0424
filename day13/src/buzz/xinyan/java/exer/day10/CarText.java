package buzz.xinyan.java.exer.day10;

public class CarText {
	public static void main(String[] args) {
		Car bmw = new Car("bmw", "pink", 19999);
		bmw.Show();
		Car jieda = new Car("jieda", "black", 2000);
		jieda.Show();
		Car RR = new Car("RR", "brown", 99999);
		RR.Show();
		Car cruze = new Car("cruze", "red", 3000);
		cruze.Show();
		Car mai = new Car("mai", "yellow", 5000);
		mai.Show();
	}
}

class Car {
	private String brand;
	private String color;
	private double price;

	public Car() {

	}


	public Car(String brand, String color, double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public void Show() {
		System.out.println("brand: "+brand+" color: "+color+" price: "+price
				+" bucks.");
	}


}
