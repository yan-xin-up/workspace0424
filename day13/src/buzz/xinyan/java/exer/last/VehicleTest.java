package buzz.xinyan.java.exer.last;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle T = new Truck(12, 8900, 4, 4000);
		if(T instanceof Truck ) {
			Truck t1 = (Truck)T;
			System.out.println(t1.toString());
		}else {
			System.out.println("error!");
		}
	}
}

class Vehicle {
	private int wheels;
	private int weight;

	public Vehicle() {
		super();
	}

	public Vehicle(int wheels, int weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

class Car1 extends Vehicle {
	private int loader;

	public Car1(int loader) {
		super();
		this.loader = loader;
	}

	public Car1(int wheels, int weight, int loader) {
		super(wheels, weight);
		this.loader = loader;
	}

	public Car1() {
		super();
	}

	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

}

class Truck extends Car1 {
	private int payload;

	public Truck() {

	}

	public Truck(int payload) {

		this.payload = payload;
	}

	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	public Truck(int wheels, int weight, int loader, int payload) {
		super(wheels, weight, loader);
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "Truck [ wheels= " + getWheels() + " ,weight= " + getWeight() + ",loader= " + getLoader() + ",payload= "
				+ getPayload() + "]";
	}
}
