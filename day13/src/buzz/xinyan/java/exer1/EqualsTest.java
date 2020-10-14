package buzz.xinyan.java.exer1;

public class EqualsTest {
	public static void main(String[] args ) {
	MyDate m1 = new MyDate(14, 3, 1976);
	MyDate m2 = new MyDate(14, 3, 1976);
	if(m1 == m2 ) {
		System.out .println("m1==m2");
	}else {
		System.out.println("m1!= m2"); // m1 != m2
	}
	if(m1.equals(m2)) {
		System.out.println("m1 is equal to m2 ");// m1 is equal to m2
		}else {
			System.out.println("m1 is not equal to m2");
		}
	}
}

class MyDate {
	private int day;
	private int mo;
	private int year;

	protected MyDate(int day, int mo, int year) {
		super();
		this.day = day;
		this.mo = mo;
		this.year = year;
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof MyDate) {
			MyDate m1 = (MyDate)obj;
			return this.day == m1.day && this.mo == m1.mo 
					&& this.year == m1.year; 
		}
		return false;
	}
}