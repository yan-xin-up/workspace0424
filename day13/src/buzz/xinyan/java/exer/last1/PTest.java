package buzz.xinyan.java.exer.last1;

class A {
	private int a;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

class B extends A {
	private int a;

	public void setA(int a) {
		this.a = a;
	}
//	 public int getA(){
//	 return a;
//	 }
}

public class PTest {

	public static void main(String[] args) {
		A c = new B();

		c.setA(5);

		System.out.println(c.getA());
	}
}
