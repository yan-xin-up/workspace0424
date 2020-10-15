package buzz.xinyan.java.exer4;

import java.io.ObjectInputStream.GetField;

public class SuperTest{
	public static void main(String[] args) {
		Super s = new Demo15();
		System.out.println(s.get());
	}
}

class Super {
	public int get() {
		return 4;
	}
}

class Demo15 extends Super {
	public int get() {
		return 4;
	}
}

