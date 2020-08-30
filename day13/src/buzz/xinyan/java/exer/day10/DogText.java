package buzz.xinyan.java.exer.day10;


public class DogText{
	public static void main(String[] args) {
		Dog dog = new Dog("小白", "White", 2);
		
		dog.ShowDetails();
	}
}
class Dog {
	private String name;
	private String color;
	private int age;

	public Dog() {

	}

	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void ShowDetails() {
		System.out.println("name: " + name + " color: " + color + " age: " + age);
	}
}

