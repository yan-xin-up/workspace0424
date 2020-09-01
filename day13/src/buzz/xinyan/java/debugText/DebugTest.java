package buzz.xinyan.java.debugText;

public class DebugTest {
	public static void main(String[] args) {
		int[] a = new int[1];
		for(int i= 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		modify(a);
		System.out.println(a[0]); //
	}

	public static void modify(int[] a) {
		
		System.out.println(a[0]++);
	}
}
