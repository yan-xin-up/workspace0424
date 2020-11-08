package buzz.xinyan.java.exercise;

public class First {
	private  static int a;
	static int b = 5;

	public  static class Contents {
		public int c;
		static int d;

		public void f() {
			System.out.println(a);
			System.out.println(b);
		}
	}

	static class Titles{
		public int e;
		int f;

	public void show(){
			System.out.println(a);
			System.out.println(b);
		}

	}

	public  void getInnerClassDate() {
		System.out.println(new Contents().c);//
		System.out.println(new Contents().d);//
		System.out.println(new Titles().e);//
		System.out.println(new Titles().f);//
	}

	public static void main(String[] args) {
		new First().getInnerClassDate();
		
		new Contents().f();
	}
}


