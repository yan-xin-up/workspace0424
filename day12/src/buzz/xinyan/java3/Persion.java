package buzz.xinyan.java3;

import java.security.PublicKey;

public class Persion {

	String name;
	int age;
	int id = 5;

	public Persion() {
		System.out.println("我是你爸爸");
	}

	public Persion(String name) {
		this.name = name;
	}

	public Persion(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("人，吃饭");
	}

	private void wal() {
		System.out.println("人，走路");
	}

}
