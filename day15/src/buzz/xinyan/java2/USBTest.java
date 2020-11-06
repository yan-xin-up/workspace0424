package buzz.xinyan.java2;

public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();			//实例化电脑对象
		//接口非匿名实现类的非匿名对象
		Printer p = new Printer();
		com.transferData(p);
		//接口非匿名实现类的匿名对象
		com.transferData(new Flash());
		//接口匿名实现类的非匿名对象
		USB phone = new USB() {

			@Override
			public void Start() {
				// TODO Auto-generated method stub
				
				System.out.println("phone启动");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
				System.out.println("phone关闭");
			}
			
		};
		com.transferData(phone);
		//接口匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void Start() {
				// TODO Auto-generated method stub
				
				System.out.println("ipod开启");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("ipod关闭");
				
			}
			
		});
	}
}

class Computer {
	public void transferData(USB u) {
		u.Start();
		System.out.println("整理数据");
		u.stop();
	}
}

interface USB {
	// 协议 定义了传输速度等，如USB2.0、USB3.0；
	void Start();

//	System.out.println("传输细节");
	void stop();
}

class Flash implements USB {

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("U盘启动");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("U盘关闭");
	}

}

class Printer implements USB {

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("打印机开启");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("打印机关闭");
	}

}
