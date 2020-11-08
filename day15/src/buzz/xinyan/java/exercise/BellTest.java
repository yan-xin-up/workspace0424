package buzz.xinyan.java.exercise;

public class BellTest {
	public static void main(String[] args) {
		CellPhone c = new CellPhone() {
			@Override
			void alarm(Bell b) {
				// TODO Auto-generated method stub
				
				System.out.println("懒猪起床");
			}
		};
		c.alarm();
		System.out.println("懒猪起床");
	}
}
