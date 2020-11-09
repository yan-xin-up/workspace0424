package buzz.xinyan.java.exercise;

public class BellTest {
	public static void main(String[] args) {
		new CellPhone().alarm(new Bell(){

			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("pig ");
			}
			
		});
	}
}
