package buzz.xinyan.java.exercise;

public class DemoT  {
	public static void main(String[] args) {
		new DemoT().show(new Test() {

	
			public void func() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	void show(Test t) {
		t.func();
	}

}
