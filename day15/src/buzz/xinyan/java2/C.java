package buzz.xinyan.java2;

interface A {
	int x = 10;
}

class B {
	int x = 15;
}

public class C extends B implements A {
	public void outPut() {
		System.out.println(A.x);
	}
	public static void main(String[] args) {
		C c = new C();
		c.outPut();
	}
}
