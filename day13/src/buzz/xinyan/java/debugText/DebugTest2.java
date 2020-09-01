package buzz.xinyan.java.debugText;
//此题主要考察this调用构造器。迷惑选项
public class DebugTest2 {

	public static void main(String[] args) {
		new A(new B());
	}
}

class A {								//迷惑选项
	public A() {
		System.out.println("A");
	}

	public A(B b) {
		this();
		System.out.println("AB");
	}
}

class B {
	public B() {
		System.out.println("B");
	}
}
