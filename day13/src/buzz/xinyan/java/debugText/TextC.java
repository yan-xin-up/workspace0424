package buzz.xinyan.java.debugText;

public class TextC {
	int x = 12;

	public void method(int x) {
		x += x;
		System.out.println(x);
	}

	public static void main(String[] args) {
		TextC t = new TextC();
		t.method(5);
	}
}