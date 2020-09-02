package buzz.xinyan.java.debugText;

public class TextD {
	public static void main(String[] args) {
		int i = 0;
		charge(i);
		i++;
		i = i++;
		System.out.println(i);
		System.out.println(i);

	}

	public static void charge(int i) {
		i++;
		System.out.println(i);
	}
}
