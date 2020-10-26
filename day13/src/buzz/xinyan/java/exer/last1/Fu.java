package buzz.xinyan.java.exer.last1;

public class Fu{
	public static void main(String[] args) {
		int i = 0;
		Fu1 f = new Demo();
		Demo d = new Demo();
		for (f.show('A'); f.show('B') && (i < 2); f.show('C')) {
			i++;
			d.show('D');
		}
	}
}

class Fu1 {
	boolean show(char a) {
		System.out.println(a);
		return true;
	}
}

class Demo extends Fu1 {
	boolean show(char a) {
		System.out.println(a);
		return false;
	}
}
