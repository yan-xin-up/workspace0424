package buzz.xinyan.java.debugText;

class Value {
	int i = 15;
}

public class TextB {
	public static void main(String argv[]) {
		TextB t = new TextB();
		t.first();
	}

	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}

	public void second(Value v, int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.print(v.i + " " + i);
	}
}
