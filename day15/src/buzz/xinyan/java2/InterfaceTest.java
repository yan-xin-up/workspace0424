package buzz.xinyan.java2;

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
	//	Flyable.MIN_SPEED = 2;
		Plane p = new Plane();
		p.fly();
	}
}

interface Flyable {// 接口
	public static final int MAX_SPEED = 7900;
	int MIN_SPEED = 1; // 省略了public static final

	public abstract void fly(); // 抽象方法

	void stop(); // 省略public abstract
	// 接口一定不存在构造器
}

interface Attackable {
	void Attack();
}

class Plane implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("驾驶员减速停止");
	}

}
abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void getGirl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBoy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
interface CC extends AA,BB{
	
}
interface AA {
	void getGirl();
}
interface BB {
	void getBoy();
}
