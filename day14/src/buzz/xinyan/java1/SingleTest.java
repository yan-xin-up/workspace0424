package buzz.xinyan.java1;

public class SingleTest {
	public static void main(String[] args) {
		Bank bank1 = Bank.getBank();
		Bank bank2 = Bank.getBank();
		System.out.println(bank1 == bank2);
		System.out.println(Order.getOrder().getClass());
		son s = new son();
	}
}

class Bank {
	private Bank() {

	}

	static {
		System.out.println("我是你爸爸");
	}
	// 饿汉式
	// 内部创建类的对象，且类的对象为静态模式；
	// private static Bank bank = new Bank();
	private static Bank bank = null;
	// 饿汉式使用静态代码块
	static {
		bank = new Bank();
	}

	public static Bank getBank() {
		return bank;
	}
}

//懒汉式
class Order {
	// 1.私化类的构造器
	private Order() {

	}

	// 2.声明当前类对象，没初始化
	// 4.因为返回当前类的对象的方法为static所以此对象也必须声明为static的
	private static Order order = null;

	// 3.声明public、static的返回当前类对象的方法
	public static Order getOrder() {
		if (order == null) {
			order = new Order();
		}
		return order;
	}
}

class Dady {
	static{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	Dady(){
		System.out.println("3");
	}
}
class son extends Dady {
	static{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	son(){
		System.out.println("3");
	}
}
