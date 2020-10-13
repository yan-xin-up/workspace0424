package buzz.xinyan.java.exer1;

public class InterviewTest {
	public static void main(String[] args) {
		Base1 base = new sub1();
		base.add(1,2,3);
		sub1 s = (sub1)base;
		s.add(1, 2, 3);
	}
	
}
class Base1{
	public void add(int a,int...arr) { 
		System.out.println("base1");
	}
}
class sub1 extends Base1{
	
	public void add(int a,int[]arr) { 
		System.out.println("sub_1");
	}
	public void add(int a,int b,int c) { 
		System.out.println("sub_2");
	}
}