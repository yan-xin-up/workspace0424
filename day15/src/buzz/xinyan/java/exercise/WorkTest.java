package buzz.xinyan.java.exercise;

public class WorkTest {
	static class calculate{
		void work() {
			// TODO Auto-generated method stub
			System.out.println("计算");
		}
	}
	static class clock{
			void work() {
			// TODO Auto-generated method stub
				System.out.println("计时");
		}
			
		class phone{
			calculate c() {
				return new calculate() {};
			}
			clock c1(){
				return new clock() {};
			}
		}
	}
}
