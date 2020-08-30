package buzz.xinyan.java.exer.day10;

//for循环中内部执行顺序。
class Demo {
	public static void main(String[] args) {
		int x = 1;
		for (show('a'); show('b') && x < 3; show('c')) {
			show('d');
			x++;
		}
	}

	public static boolean show(char ch) {
		System.out.print(ch);
		return true;
	}
}
