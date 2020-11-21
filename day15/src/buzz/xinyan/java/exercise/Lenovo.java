package buzz.xinyan.java.exercise;

import buzz.xinyan.java.exercise.Lenovo.Works.Work;

public class Lenovo {
	static class  Works {
		interface Work{
			void work();
		}
	}
	static class sal implements Work{

		@Override
		public void work() {
			// TODO Auto-generated method stub
			System.out.println("销售工作");
		}
		
	}
	static class dev implements Work{

		@Override
		public void work() {
			// TODO Auto-generated method stub
			System.out.println("研发工作");
		}
	}
	public static void main(String[] args) {
		new sal().work();
		new dev().work();
	}
}
